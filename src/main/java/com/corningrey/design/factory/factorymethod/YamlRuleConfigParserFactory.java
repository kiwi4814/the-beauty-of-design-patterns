package com.corningrey.design.factory.factorymethod;

import com.corningrey.design.factory.base.parser.IRuleConfigParser;
import com.corningrey.design.factory.base.parser.impl.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
  @Override
  public IRuleConfigParser createParser() {
    return new YamlRuleConfigParser();
  }
}