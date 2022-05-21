package com.company;

public class Main {

    public static void main(String[] args) {

        for (ShapeType s : ShapeType.values())
            System.out.println(s + " has position " + s.ordinal() + '\n');
        
    }
}
