package com.javarush.games.snake;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;


public class Snake {

    private List<GameObject> snakeParts = new ArrayList<>(30);
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public void setDirection(Direction direction) {

        switch (direction) {
            case LEFT:
                if (snakeParts.get(0).y == snakeParts.get(1).y) {
                    return;
                }
                if (this.direction == Direction.RIGHT) {
                    return;
                }
                this.direction = direction;
            case RIGHT:
                if (snakeParts.get(0).y == snakeParts.get(1).y) {
                    return;
                }
                if (this.direction == Direction.LEFT) {
                return;
            }
                this.direction = direction;
            case UP:
                if (snakeParts.get(0).x == snakeParts.get(1).x) {
                    return;
                }
                if(this.direction == Direction.DOWN) {
                    return;
                }
                this.direction = direction;
            case DOWN:
                if (snakeParts.get(0).x == snakeParts.get(1).x) {
                    return;
                }
                if(this.direction == Direction.UP) {
                    return;
                }
                this.direction = direction;
        }
    }

    public Snake(int x, int y) {
        GameObject snake1 = new GameObject(x, y);
        GameObject snake2 = new GameObject(x + 1, y);
        GameObject snake3 = new GameObject(x + 2, y);
        snakeParts.add(snake1);
        snakeParts.add(snake2);
        snakeParts.add(snake3);
    }

    public void draw(Game game) {
        game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, isAlive ? Color.BLACK : Color.RED, 75);
        for (int i = 1; i < snakeParts.size(); i++) {
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, isAlive ? Color.BLACK : Color.RED, 75);
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        boolean isCollision = checkCollision(newHead);
        if ((newHead.x >= 0) && (newHead.x < SnakeGame.WIDTH) && (newHead.y >= 0) && (newHead.y < SnakeGame.HEIGHT)) {
            if (isCollision) {
                isAlive = false;
                return;
            }
            snakeParts.add(0, newHead);
            if (newHead.x == apple.x && newHead.y == apple.y) {
                apple.isAlive = false;
                return;
            }
            removeTail();
        } else {
                isAlive = false;
        }
    }

    public GameObject createNewHead() {
        switch (direction) {
            case UP:
                return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y-1);
            case DOWN:
                return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y+1);
            case RIGHT:
                return new GameObject(snakeParts.get(0).x+1, snakeParts.get(0).y);
            case LEFT:
                return new GameObject(snakeParts.get(0).x-1, snakeParts.get(0).y);
            default:
                return null;
        }
    }

    public void removeTail() {
        int tail = snakeParts.size() - 1;
        snakeParts.remove(tail);
    }

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject snakePart : snakeParts) {
            if (snakePart.x == gameObject.x && snakePart.y == gameObject.y) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}