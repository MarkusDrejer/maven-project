package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
   * This method is used to greet the user using a final String as a parameter
   * Then returns "Hello" with that String following
   * @param someone
   * @return
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
