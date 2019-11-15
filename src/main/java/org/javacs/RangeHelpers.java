package org.javacs;

import com.google.common.collect.BoundType;

final class RangeHelpers {
  private RangeHelpers() {}

  static long getValidLowerRangeValue(com.google.common.collect.Range<Long> range) {
    long value = range.lowerEndpoint();
    if (range.lowerBoundType() == BoundType.OPEN) {
      value++;
    }
    return value;
  }

  static long getValidUpperRangeValue(com.google.common.collect.Range<Long> range) {
    long value = range.upperEndpoint();
    if (range.upperBoundType() == BoundType.OPEN) {
      value--;
    }
    return value;
  }
}
