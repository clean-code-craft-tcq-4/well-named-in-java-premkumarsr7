/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package colorcoder;

import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;

/**
 * @author msp5cob
 */
public class ColorPair {

  private final MajorColor majorColor;
  private final MinorColor minorColor;

  public ColorPair(final MajorColor major, final MinorColor minor) {
    this.majorColor = major;
    this.minorColor = minor;
  }

  public MajorColor getMajor() {
    return this.majorColor;
  }

  public MinorColor getMinor() {
    return this.minorColor;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    String[] majorColorPairArr = Main.getMajorcolornames();
    String[] minorColorPairArr = Main.getMinorcolornames();
    return majorColorPairArr[this.majorColor.getIndex()] + " " + minorColorPairArr[this.minorColor.getIndex()];
  }
}