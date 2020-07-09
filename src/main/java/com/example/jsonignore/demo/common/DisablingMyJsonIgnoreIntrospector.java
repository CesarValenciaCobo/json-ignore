package com.example.jsonignore.demo.common;

import com.example.jsonignore.demo.annotation.MyJsonIgnore;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

import java.lang.annotation.Annotation;

public class DisablingMyJsonIgnoreIntrospector extends JacksonAnnotationIntrospector{

    @Override
    public boolean isAnnotationBundle(final Annotation ann){
        System.out.println("ann.annotationType(): " + ann.annotationType());

        if(ann.annotationType().equals(MyJsonIgnore.class)){
            return false;
        }else{
            return super.isAnnotationBundle(ann);
        }
    }

    @Override
    public boolean hasIgnoreMarker(final AnnotatedMember m) {
        return false;
    }
}