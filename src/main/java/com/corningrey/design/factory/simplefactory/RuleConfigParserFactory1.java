package com.corningrey.design.factory.simplefactory;

import com.corningrey.design.factory.base.parser.IRuleConfigParser;
import com.corningrey.design.factory.base.parser.impl.JsonRuleConfigParser;
import com.corningrey.design.factory.base.parser.impl.PropertiesRuleConfigParser;
import com.corningrey.design.factory.base.parser.impl.XmlRuleConfigParser;
import com.corningrey.design.factory.base.parser.impl.YamlRuleConfigParser;

public class RuleConfigParserFactory1 {
    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}