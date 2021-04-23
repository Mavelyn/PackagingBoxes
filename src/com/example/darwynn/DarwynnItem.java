package com.example.darwynn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DarwynnItem {
    // sorted in ascending order
    private List<Integer> dimensions;

    public DarwynnItem(int height, int width, int length) {
        this.dimensions = Arrays.asList(height, width, length);
        Collections.sort(this.dimensions);
    }

    public Integer getHighest() {
        return this.dimensions.get(2);
    }

    public Integer getSecondHighest() {
        return this.dimensions.get(1);
    }

    public Integer getLowest() {
        return this.dimensions.get(0);
    }
}

