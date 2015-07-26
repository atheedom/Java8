package com.alextheedom.patterns.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by atheedom on 26/07/15.
 */

@RunWith(MockitoJUnitRunner.class)
public class OperationStrategyTest {

    @Test
    public void shouldAddTwoNumbers() {
        assertThat(Operation.ADD.compute(5d, 5d)).isEqualTo(new Double(10));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertThat(Operation.SUBTRACT.compute(10d, 5d)).isEqualTo(new Double(5d));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertThat(Operation.MULTIPLY.compute(5d, 5d)).isEqualTo(new Double(25));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        assertThat(Operation.DIVIDE.compute(10d, 2d)).isEqualTo(new Double(5d));
    }

    @Test
    public void shouldDetermineMaximumOfTwoNumbers() {
        assertThat(Operation.MAX.compute(10d, 5d)).isEqualTo(new Double(10d));
    }
}
