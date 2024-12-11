package com.aitesting.crm.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

  @Test
  public void isValidMailTest() {
    Assertions.assertTrue(StringUtils.isValidEmail("radar@test.com"));
    // TODO:: Add other test cases
  }

  @Test
  public void capitalizeTest() {
    // TODO:: Add test cases
  }

  @Test
  public void normalizePhoneNumberTest() {
    // TODO:: Add test cases
  }

  @Test
  public void sanitizeTest() {
    // TODO:: Add test cases
  }
}