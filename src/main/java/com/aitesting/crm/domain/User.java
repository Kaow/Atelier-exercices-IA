package com.aitesting.crm.domain;

import com.aitesting.crm.enums.RoleEnum;

import java.time.LocalDate;
import java.util.List;

public class User {

  private Long id;
  private String name;
  private String phoneNumber;
  private String mail;
  private RoleEnum role;
  private String birthDate;
  private List<Expense> expenses;

  public User(Long id, String name, String phoneNumber, String mail, RoleEnum role, String birthDate) {
    this.id = id;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.mail = mail;
    this.role = role;
    this.birthDate = birthDate;
  }

  public User(String name, String phoneNumber, String mail, String birthDate) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.mail = mail;
    this.birthDate = birthDate;
    this.role = RoleEnum.USER;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public List<Expense> getExpenses() {
    return expenses;
  }

  public void setExpenses(List<Expense> expenses) {
    this.expenses = expenses;
  }


}
