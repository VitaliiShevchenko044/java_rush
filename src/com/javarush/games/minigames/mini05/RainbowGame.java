package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 7; y++) {
                if (y == 0)
                    setCellColor(x, y, Color.RED);
                if (y == 1)
                    setCellColor(x, y, Color.ORANGE);
                if (y == 2)
                    setCellColor(x, y, Color.YELLOW);
                if (y == 3)
                    setCellColor(x, y, Color.GREEN);
                if (y == 4)
                    setCellColor(x, y, Color.BLUE);
                if (y == 5)
                    setCellColor(x, y, Color.INDIGO);
                if (y == 6)
                    setCellColor(x, y, Color.VIOLET);
            }
        }
    }
}
