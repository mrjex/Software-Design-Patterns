package com.group10.searcher.Strategies;

import java.util.ArrayList;
import java.util.List;

// Resource used: https://www.educative.io/edpresso/shift-or-string-matching-algorithm

public class ShiftOr implements Strategy {

    @Override
    public int execute(String content, String keyword) {

        int m = keyword.length();
        int n = content.length();
        List<Integer> matches = new ArrayList<>();

        // Initialize bit vector and mask vector
        int[] bitVector = new int[256];
        int[] maskVector = new int[m];
        int mask = 1;
        for (int i = 0; i < m; i++) {
            bitVector[keyword.charAt(i)] |= mask;
            maskVector[i] = mask;
            mask <<= 1;
        }

        // Search for pattern in text
        int state = 0;
        for (int i = 0; i < n; i++) {
            state = (state << 1 | 1) & bitVector[content.charAt(i)];
            if ((state & maskVector[m - 1]) != 0) {
                // Match found
                matches.add(i - m + 1);
            }
        }

        return matches.size();

    }




}
