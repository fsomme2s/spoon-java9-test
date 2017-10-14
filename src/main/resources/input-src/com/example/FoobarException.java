package com.example;

import spoon.Launcher;

/**
 * Just a class that should be analyzed by spoon, but it's inherited from a java.lang class: RuntimeException.
 */
public class FoobarException extends RuntimeException {

    public FoobarException(String message) {
        //If you comment out this method, everything works fine
        //If you compile and run with jdk 1.8, it also works fine, with this method included
        //But if you compile and run with jdk 9, this method crashes spoon
        super(message);
    }
}
