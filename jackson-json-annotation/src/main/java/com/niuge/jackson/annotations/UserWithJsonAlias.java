package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonAlias {
  public int id;
  private String name;

  @JsonAlias({ "username", "userName" })
  public String getName() {
    return name;
  }
}
