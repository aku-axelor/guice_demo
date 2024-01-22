package com.app.module;

import com.app.service.DrawCircle;
import com.app.service.DrawShape;
import com.app.service.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        // Bind DrawShape to DrawSquare with the name "square"
        bind(DrawShape.class).annotatedWith(Names.named("square")).to(DrawSquare.class);

        // If you have other bindings, you can add them here
        bind(DrawCircle.class).annotatedWith(Names.named("circle")).to(DrawCircle.class);

    }
}
