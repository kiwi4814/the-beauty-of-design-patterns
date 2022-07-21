package com.geek.java8.classes;

public class Main {
  private static class StaticInnerClass {

  }

  private class MemberInnerClass {

  }

  private static class ChildClass extends Main {

  }

  public MemberInnerClass getMemberInnerClassInstance() {
    return new MemberInnerClass();
  }

  public static void main(String[] args) {
    System.out.println( StaticInnerClass.class.getDeclaringClass() );
    System.out.println( StaticInnerClass.class.getEnclosingClass() );
    System.out.println( MemberInnerClass.class.getDeclaringClass() );
    System.out.println( MemberInnerClass.class.getEnclosingClass() );
    System.out.println( new ChildClass().getMemberInnerClassInstance().getClass().getEnclosingClass() );
    System.out.println( new ChildClass().getMemberInnerClassInstance().getClass().getDeclaringClass() );
  }
}