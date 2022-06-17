/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package colorcoder.test;

import colorcoder.ColorPair;
import colorcoder.Main;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;

/**
 * @author msp5cob
 */
public class TestColorPair {

  public static void testNumberToPair(final int pairNumber, final MajorColor expectedMajor,
      final MinorColor expectedMinor) {
    ColorPair colorPair = Main.getColorFromPairNumber(pairNumber);
    System.out.println("Got pair " + colorPair.toString());
    assert (colorPair.getMajor() == expectedMajor);
    assert (colorPair.getMinor() == expectedMinor);
  }

  public static void testPairToNumber(final MajorColor major, final MinorColor minor, final int expectedPairNumber) {
    int pairNumber = Main.getPairNumberFromColor(major, minor);
    System.out.println("Got pair number " + pairNumber);
    assert (pairNumber == expectedPairNumber);
  }

  public static void printAllColorCodes() {
    for (MajorColor majorColor : MajorColor.values()) {
      for (MinorColor minorColor : MinorColor.values()) {
        System.out.println("Color Pair : " + majorColor + "-" + minorColor + ", Color code : " +
            Main.getPairNumberFromColor(majorColor, minorColor));
      }
    }
  }
}
