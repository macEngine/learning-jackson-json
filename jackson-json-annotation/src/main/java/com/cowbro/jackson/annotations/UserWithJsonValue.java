package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonValue {
  public int id;
  private String name;

  //@JsonValue
  public String getName() {
    return name;
  }
}
