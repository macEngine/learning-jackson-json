package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserWithJsonCreator {
  public int id;
  public String name;

  @JsonCreator
  public UserWithJsonCreator(
      @JsonProperty("id") int id,
      @JsonProperty("theName") String name) {
    this.id = id;
    this.name = name;
  }
}
