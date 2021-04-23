package com.example.darwynn;

import java.util.Arrays;
import java.util.List;

public class DarwynnBox {
    List<Integer> dimensions;

    public DarwynnBox(int height, int width, int length) {
        this.dimensions = Arrays.asList(height, width, length);
    }

    @Override
    public String toString() {
        return "Height: " + this.dimensions.get(2) + " Width: " + this.dimensions.get(1) + " Length: " + this.dimensions.get(0);
    }
}
