package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> cola = new LinkedList<>();

        cola.offer("Smith");
        cola.offer("Montessori");
        cola.offer("Peralta");
        cola.offer("House");

        return cola;

    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (queue.size()>0){
            String element = queue.poll();
            System.out.println("Elemento " + element);
        }
    }

    public static void main(String[] args) {
        Queue<String> cola = createQueue();
        printAndEmptyQueue(cola);
    }

}
