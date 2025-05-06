package com.group10.searcher;

import com.group10.searcher.Strategies.Strategy;

public class Context {

    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int search(String content, String keyword) {
        return this.strategy.execute(content, keyword);
    }

}
