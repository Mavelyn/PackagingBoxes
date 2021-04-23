package com.example.darwynn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.example.darwynn.DarwynnBox;
import com.example.darwynn.DarwynnItem;

public class DeliveryAPI {
    DarwynnBox[] boxes = {
            new DarwynnBox(4,6,6),
            new DarwynnBox(5,7,7),
            new DarwynnBox(6,8,8),
            new DarwynnBox(8,8,8),
            new DarwynnBox(7,10,10),
            new DarwynnBox(8,8,10),
            new DarwynnBox(8,10,10),
            new DarwynnBox(10,10,10),
            new DarwynnBox(10,12,12),
            new DarwynnBox(12,18,18)
    };

    public DarwynnBox chooseBox(List<DarwynnItem> items) {
        Collections.sort(items, (a, b) -> a.getHighest().compareTo(b.getHighest()));
        int dimen1 = items.get(0).getHighest();

        Collections.sort(items, (a,b) -> a.getSecondHighest().compareTo(b.getSecondHighest()));
        int dimen2 = items.get(0).getSecondHighest();

        int dimen3 = 0;

        for(DarwynnItem item : items) {
            dimen3 += item.getLowest();
        }

        int smallestVolume = -1;
        DarwynnBox smallestBox = null;

        for(DarwynnBox box : this.boxes) {
            List<Integer> sortedDimensions = new ArrayList(box.dimensions);
            Collections.sort(sortedDimensions);

            if(sortedDimensions.get(2) >= dimen1
                    && sortedDimensions.get(1) >= dimen2
                    && sortedDimensions.get(0) >= dimen3) {
                int currentVolume = sortedDimensions.get(2)*sortedDimensions.get(1)*sortedDimensions.get(0);

                if(smallestBox == null || currentVolume < smallestVolume) {
                    smallestVolume = currentVolume;
                    smallestBox = box;
                }
            }

        }

        return smallestBox;
    }
}
