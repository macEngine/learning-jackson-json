package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonProperty {
  public int id;
  private String theName;

  @JsonProperty("name")
  public void setTheName(String name) {
    this.theName = name;
  }
  @JsonProperty("name")
  public String getTheName() {
    return theName;
  }
}
