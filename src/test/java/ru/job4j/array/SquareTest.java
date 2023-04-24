package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound7Then0149162536() {
        int bound = 7;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16, 25, 36};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound8Then01491625364964() {
        int bound = 9;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16, 25, 36, 49, 64};
        assertThat(result).containsExactly(expected);
    }
}