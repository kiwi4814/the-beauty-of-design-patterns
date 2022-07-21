package com.geek.java8.classes;

class Foo {
  Class<?> bar() throws NoSuchFieldException {
    class Bar<S> { }
    return Bar.class;
  }

  public static void main(String[] args) throws NoSuchFieldException {
    System.out.println(new Foo().bar().getDeclaringClass()); // null
    System.out.println(new Foo().bar().getEnclosingClass()); // Foo
  }
}