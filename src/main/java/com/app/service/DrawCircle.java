package com.app.service;

import javax.inject.Named;

@Named("circle")
public class DrawCircle implements DrawShape {


	@Override
    public void draw() {
        System.out.println("Drawing a circle !");
    }
}
