package com.corningrey.design.factory.factorymethod;

import com.corningrey.design.factory.base.parser.IRuleConfigParser;
import com.corningrey.design.factory.base.parser.impl.PropertiesRuleConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
  @Override
  public IRuleConfigParser createParser() {
    return new PropertiesRuleConfigParser();
  }
}