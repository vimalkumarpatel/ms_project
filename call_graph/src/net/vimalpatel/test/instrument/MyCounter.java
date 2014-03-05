package net.vimalpatel.test.instrument;

public class MyCounter {

  private static int c = 0;

  public static void increase(int howmany) {
    c += howmany;
  }

  public static void report() {
    System.err.println("counter : " + c);
  }
}