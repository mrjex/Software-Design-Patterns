package com.group10.searcher.Strategies;

import org.apache.commons.lang3.StringUtils;

public class API implements Strategy {

    @Override
    public int execute(String content, String keyword) {
        return StringUtils.countMatches(content, keyword);
    }

}
