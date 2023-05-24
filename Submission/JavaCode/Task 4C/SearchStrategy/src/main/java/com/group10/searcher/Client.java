package com.group10.searcher;

import com.group10.searcher.Strategies.API;
import com.group10.searcher.Strategies.Bruteforce;
import com.group10.searcher.Strategies.ShiftOr;

/*

Resource used: https://www.educative.io/edpresso/shift-or-string-matching-algorithm

 */

public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        context.setStrategy(new API());

        int occurrences = context.search("abababab", "ab");
        System.out.println(occurrences);

    }


}
