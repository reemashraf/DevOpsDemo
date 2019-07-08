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
//    try to check why yasser exits
  String expected = "nice";
  String name = greeter.greet("reem");
  assertEquals(name,expected);
}
}

