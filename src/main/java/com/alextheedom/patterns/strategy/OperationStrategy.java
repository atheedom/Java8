package com.alextheedom.patterns.strategy;

/**
 * Created by atheedom on 26/07/15.
 */
@FunctionalInterface
public interface OperationStrategy<T> {

    T compute(T x, T y);
}
