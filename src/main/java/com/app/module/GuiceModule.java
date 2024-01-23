package com.app.module;

import com.app.service.DrawCircle;
import com.app.service.DrawShape;
import com.app.service.DrawSquare;
import com.app.service.ExtendedDrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
    	
        bind(DrawShape.class).annotatedWith(Names.named("square")).to(DrawSquare.class);
        bind(DrawShape.class).annotatedWith(Names.named("circle")).to(DrawCircle.class);
        bind(DrawSquare.class).to(ExtendedDrawSquare.class);

    }
}
