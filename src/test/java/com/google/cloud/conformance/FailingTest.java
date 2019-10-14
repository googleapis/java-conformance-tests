/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.conformance;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public final class FailingTest {

  @Test
  @Ignore
  public void shouldFail() {
    Assert.fail("verifying failure detection");
  }

  @Test
  @Ignore
  public void shouldAlsoFail() {
    Assert.fail("kaboom");
  }

  @Test
  public void passingTest() {
    assertTrue(true);
  }
}
