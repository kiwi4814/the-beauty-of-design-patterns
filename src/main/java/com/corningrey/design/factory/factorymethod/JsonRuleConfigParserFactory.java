package com.corningrey.design.factory.factorymethod;

import com.corningrey.design.factory.base.parser.IRuleConfigParser;
import com.corningrey.design.factory.base.parser.impl.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
  @Override
  public IRuleConfigParser createParser() {
    return new JsonRuleConfigParser();
  }
}