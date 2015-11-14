package com.github.sriprasanna;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameOfLifeTest {
    @Test
    public void shouldCreateAnInstance() {
        GameOfLife gameOfLife = new GameOfLife();
        assertThat(gameOfLife, is(instanceOf(GameOfLife.class)));
    }
}