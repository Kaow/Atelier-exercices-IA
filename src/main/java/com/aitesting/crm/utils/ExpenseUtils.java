package com.aitesting.crm.utils;

import com.aitesting.crm.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseUtils {

  /**
   * Gets all users and sorts them in descending order of those having
   * the most expenses.
   *
   * @return sorted user list
   */
  public static List<User> sortUsersByTotalExpenses(List<User> allUsers) {
    // TODO :: implement this function
    return allUsers;
  }


  /**
   * Gets all users, calculates their average expenses, and return a map
   * with the id of the user as key and the average expense as value
   *
   * @return User id to average amount map
   */
  public static Map<Long, Double> getUsersAverageExpensesMap(List<User> allUsers) {
    // TODO :: implement this function
    return new HashMap<>();
  }

}
