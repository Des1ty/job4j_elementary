package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 3;
        int dest = input[input.length - 1 - source];
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 7, 5, 6, 4, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 2;
        int dest = input[input.length - 1 - source];
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 8, 4, 5, 6, 7, 3, 9};
        assertThat(result).containsExactly(expected);
    }
}