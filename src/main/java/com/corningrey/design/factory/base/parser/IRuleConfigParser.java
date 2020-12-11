package com.corningrey.design.factory.base.parser;

import com.corningrey.design.factory.base.RuleConfig;

public interface IRuleConfigParser {

    public RuleConfig parse(String configText);
}
