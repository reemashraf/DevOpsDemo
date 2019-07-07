package com.example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }


@Test
public void testAssert(){
  String expected = "Hello, reem!";
  String name = greeter.greet("reem");
  assertEquals(name,expected);
}
}

