package com.example.myapplication;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.inject.Scope;

/**
 * Identifies a type that the injector only instantiates once. Not inherited.
 *
 * @see javax.inject.Scope @Scope
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerAndroid {}
