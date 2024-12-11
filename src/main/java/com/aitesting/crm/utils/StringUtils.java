package com.aitesting.crm.utils;

import java.util.regex.Pattern;

public class StringUtils {

  // Method to validate email addresses
  public static boolean isValidEmail(String email) {
    if (email == null || email.isEmpty()) {
      return false;
    }
    String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    Pattern pattern = Pattern.compile(emailRegex);
    return pattern.matcher(email).matches();
  }

  // Method to format customer names (capitalize first letter of each word)
  public static String capitalize(String name) {
    if (name == null || name.isEmpty()) {
      return name;
    }
    String[] words = name.split("\\s+");
    StringBuilder formattedName = new StringBuilder();
    for (String word : words) {
      if (!word.isEmpty()) {
        formattedName.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase()).append(" ");
      }
    }
    return formattedName.toString().trim();
  }

  // Method to normalize phone numbers (remove non-numeric characters)
  public static String normalizePhoneNumber(String phoneNumber) {
    if (phoneNumber == null) {
      return null;
    }
    return phoneNumber.replaceAll("[^0-9]", "");
  }

  /**
   * Sanitizes input strings to prevent SQL injection and other harmful patterns.
   *
   * @param input The input string to sanitize
   * @return The sanitized string
   */
  public static String sanitize(String input) {
    if (input == null) {
      return null;
    }

    // More comprehensive sanitization
    String sanitized = input.replaceAll("['\";\\-]", "");
    sanitized = sanitized.replaceAll("[<>]", "");  // Remove angle brackets to prevent HTML injection
    sanitized = sanitized.replaceAll("\\s+", " "); // Normalize whitespace

    // Additional sanitization logic can be added here
    return sanitized.trim();
  }

}