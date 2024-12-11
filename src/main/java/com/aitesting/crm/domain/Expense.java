package com.aitesting.crm.domain;


import java.time.LocalDate;

public class Expense {

  private Long id;
  private String label;
  private Double amount;
  private LocalDate date;

  public Expense(String label, Double amount) {
    this.label = label;
    this.amount = amount;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}
