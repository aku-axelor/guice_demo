package com.app.request;

import com.app.service.DrawCircle;
import com.app.service.DrawSquare;
import com.google.inject.Inject;

public class Request {

    private final DrawSquare drawSquare;
    private final DrawCircle drawCircle;

    @Inject
    public Request(DrawSquare drawSquare, DrawCircle drawCircle) {
        this.drawSquare = drawSquare;
        this.drawCircle = drawCircle;
    }

    public void makeSquareRequest() {
        drawSquare.draw();
    }

    public void makeCircleRequest() {
        drawCircle.draw();
    }
}
