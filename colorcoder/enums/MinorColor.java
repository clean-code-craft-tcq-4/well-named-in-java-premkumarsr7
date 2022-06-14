/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package colorcoder.enums;

/**
 * @author msp5cob
 */
public enum MinorColor {
                        BLUE(0),
                        ORANGE(1),
                        GREEN(2),
                        BROWN(3),
                        SLATE(4);

  private int index;

  private MinorColor(final int index) {
    this.index = index;
  }

  public int getIndex() {
    return this.index;
  }

  public static MinorColor getMinorColorFromIndex(final int index) {
    for (MinorColor color : MinorColor.values()) {
      if (color.getIndex() == index) {
        return color;
      }
    }
    return null;
  }

}
