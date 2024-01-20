package org.example.logica;

public class Box {
    public char[] cell;

    public Box() {
        cell = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

    public void draw() {
        System.out.println("\n\n " +cell[0] + " | " +cell[1] + " | " +cell[2] + " ");
        System.out.println("-----------");
        System.out.println(" " +cell[3] + " | " +cell[4] + " | " +cell[5] + " ");
        System.out.println("-----------");
        System.out.println(" " +cell[6] + " | " +cell[7] + " | " +cell[8] + " \n");
    }

    public void clear() {
        for (int i = 0; i < 9; i++)
           cell[i] = ' ';
    }
}