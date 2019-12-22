package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserTypeWithJsonValue {
  NORMAL(1, "normal user"), SPAM(2, "spam user");

  private Integer id;
  private String name;

  @JsonValue
  public String getName() {
    return name;
  }
}
