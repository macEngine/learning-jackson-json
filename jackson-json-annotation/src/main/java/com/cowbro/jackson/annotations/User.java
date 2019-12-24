package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
  public int id;
  private String name;
}
