package com.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;  //prevLast присвоюємо посилання на останній реальний вузол
        prevLast.next = newNode;    //колишній останній вузол тепер вказує на newNode
        newNode.prev = prevLast;    //newNode.prev тепер вказує на попередній останній вузол
        newNode.next = last;        //новий вузол (newNode) тепер перед last
        last.prev = newNode;        //last тепер вказує на новий останній вузол.
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}