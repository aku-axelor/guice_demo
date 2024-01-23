package com.app.service;

import javax.inject.Named;

@Named("square")
public class DrawSquare implements DrawShape {

	@Override
    public void draw() {
        System.out.println("Drawing a square !");
    }
}
