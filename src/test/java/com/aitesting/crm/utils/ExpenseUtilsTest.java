package com.aitesting.crm.utils;

import com.aitesting.crm.domain.Expense;
import com.aitesting.crm.domain.User;
import com.aitesting.crm.enums.RoleEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExpenseUtilsTest {


  @Test
  public void testSortUsersByTotalExpenses() {
    List<Expense> user1Expenses = Arrays.asList(new Expense("Expense1", 100D), new Expense("Expense2", 200D));
    List<Expense> user2Expenses = List.of(new Expense("Expense1", 400D));
    User user1 = new User("Alice", "0606060606", "alice@mail.com", "11/10/1997");
    User user2 = new User("Bob", "0606060606", "bob@mail.com", "11/10/1997");
    user1.setExpenses(user1Expenses);
    user2.setExpenses(user2Expenses);
    List<User> users = Arrays.asList(user1, user2);

    List<User> sortedUsers = ExpenseUtils.sortUsersByTotalExpenses(users);

    Assertions.assertEquals(2, sortedUsers.size());
    Assertions.assertEquals("Bob", sortedUsers.get(0).getName());
    Assertions.assertEquals("Alice", sortedUsers.get(1).getName());
  }

  @Test
  public void testGetUsersAverageExpensesMap() {
    List<Expense> user1Expenses = Arrays.asList(new Expense("Expense1", 100D), new Expense("Expense2", 200D));
    List<Expense> user2Expenses = List.of(new Expense("Expense1", 300D));
    User user1 = new User(1L, "Alice", "0606060606", "alice@mail.com", RoleEnum.USER, "11/10/1997");
    User user2 = new User(2L, "Bob", "0606060606", "bob@mail.com", RoleEnum.USER,"11/10/1997");
    user1.setExpenses(user1Expenses);
    user2.setExpenses(user2Expenses);
    List<User> users = Arrays.asList(user1, user2);

    Map<Long, Double> averageExpensesMap = ExpenseUtils.getUsersAverageExpensesMap(users);

    Assertions.assertEquals(2, averageExpensesMap.size());
    Assertions.assertEquals(150.0, averageExpensesMap.get(1L));
    Assertions.assertEquals(300.0, averageExpensesMap.get(2L));
  }


}
