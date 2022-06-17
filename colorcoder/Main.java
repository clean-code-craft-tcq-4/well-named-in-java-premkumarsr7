package colorcoder;

import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;
import colorcoder.test.TestColorPair;

public class Main {

  private static final String[] MAJOR_COLOR_NAMES = { "White", "Red", "Black", "Yellow", "Violet" };
  private static final int NUMBER_OF_MAJOR_COLORS = MAJOR_COLOR_NAMES.length;
  private static final String[] MINOR_COLOR_NAMES = { "Blue", "Orange", "Green", "Brown", "Slate" };
  private static final int NUMBER_OF_MINOR_COLORS = MINOR_COLOR_NAMES.length;

  public static ColorPair getColorFromPairNumber(final int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    MajorColor majorColor = MajorColor.getMajorColorFromIndex(zeroBasedPairNumber / NUMBER_OF_MAJOR_COLORS);
    MinorColor minorColor = MinorColor.getMinorColorFromIndex(zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS);
    return new ColorPair(majorColor, minorColor);

  }

  public static int getPairNumberFromColor(final MajorColor major, final MinorColor minor) {
    return (major.getIndex() * NUMBER_OF_MINOR_COLORS) + minor.getIndex() + 1;
  }

  public static void main(final String[] args) {
    TestColorPair.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    TestColorPair.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

    TestColorPair.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    TestColorPair.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

    TestColorPair.printAllColorCodes();
  }

  /**
   * @return the majorcolornames
   */
  public static String[] getMajorcolornames() {
    return MAJOR_COLOR_NAMES;
  }

  /**
   * @return the minorcolornames
   */
  public static String[] getMinorcolornames() {
    return MINOR_COLOR_NAMES;
  }
}
