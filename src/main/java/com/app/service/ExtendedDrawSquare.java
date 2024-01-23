package com.app.service;


public class ExtendedDrawSquare extends DrawSquare {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing an extended square !");
    }

}
