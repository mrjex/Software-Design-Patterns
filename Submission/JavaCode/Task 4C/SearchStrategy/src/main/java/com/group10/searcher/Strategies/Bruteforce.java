package com.group10.searcher.Strategies;

import java.util.ArrayList;
import java.util.List;

// Resource used: https://www.educative.io/edpresso/shift-or-string-matching-algorithm

public class Bruteforce implements Strategy {
    @Override
    public int execute(String content, String keyword) {

        int m = keyword.length();
        int n = content.length();
        List<Integer> matches = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while(j < m) {
                if (content.charAt(i + j) != keyword.charAt(j)) {
                    break;
                }
                j++;
            }

            if (j == m) {
                matches.add(i);
            }

        }

        return matches.size();

    }

}
