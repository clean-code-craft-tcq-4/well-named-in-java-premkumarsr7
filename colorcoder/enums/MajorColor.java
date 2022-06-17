/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package colorcoder.enums;

/**
 * @author msp5cob
 */
public enum MajorColor {
                        WHITE(0),
                        RED(1),
                        BLACK(2),
                        YELLOW(3),
                        VIOLET(4);

  private int index;

  private MajorColor(final int index) {
    this.index = index;
  }

  public int getIndex() {
    return this.index;
  }

  public static MajorColor getMajorColorFromIndex(final int index) {
    for (MajorColor color : MajorColor.values()) {
      if (color.getIndex() == index) {
        return color;
      }
    }
    return null;
  }

}
