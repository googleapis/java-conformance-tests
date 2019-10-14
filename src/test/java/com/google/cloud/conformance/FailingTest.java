package com.google.cloud.conformance;

import org.junit.Assert;
import org.junit.Test;

public final class FailingTest {

  @Test
  public void shouldFail() {
    Assert.fail("verifying failure detection");
  }
}
