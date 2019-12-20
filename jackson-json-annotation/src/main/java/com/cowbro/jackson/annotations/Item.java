package com.cowbro.jackson.annotations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {
  public int id;
  public String itemName;
  public User owner;
}
