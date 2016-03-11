package com.trvajjala.factory;

public class Client {

    public static void main(String[] args) {

        final Shape circle = ShapeFactory.getShape("Circle");

        circle.draw();
    }
}
