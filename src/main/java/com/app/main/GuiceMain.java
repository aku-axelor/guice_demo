package com.app.main;

import com.app.module.GuiceModule;
import com.app.request.Request;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceMain {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GuiceModule());
        Request request = injector.getInstance(Request.class);
        request.makeSquareRequest();
        request.makeCircleRequest();
    }
}
