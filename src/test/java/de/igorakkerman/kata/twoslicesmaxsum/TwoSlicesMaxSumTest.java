package de.igorakkerman.kata.twoslicesmaxsum;

import org.junit.jupiter.api.Test;

import static de.igorakkerman.kata.twoslicesmaxsum.TwoSlicesMaxSum.*;
import static org.assertj.core.api.Assertions.assertThat;

class TwoSlicesMaxSumTest {

    @Test
    void empty_1_1() {
        assertThat(twoSlicesMaxSum(new int[]{}, 1, 1))
                .isEqualTo(-1);
    }

    @Test
    void single_1_1() {
        assertThat(twoSlicesMaxSum(new int[]{5}, 1, 1))
                .isEqualTo(-1);
    }

    @Test
    void two_1_1() {
        assertThat(twoSlicesMaxSum(new int[]{5, 6}, 1, 1))
                .isEqualTo(11);
    }

    @Test
    void sequence_2_3() {
        assertThat(twoSlicesMaxSum(new int[]{7, 8, 1, 4, 9, 4, 9, 8}, 2, 3))
                .isEqualTo(37);
    }

    @Test
    void sequence_3_2() {
        assertThat(twoSlicesMaxSum(new int[]{7, 8, 1, 4, 9, 4, 9, 8}, 3, 2))
                .isEqualTo(34);
    }
}