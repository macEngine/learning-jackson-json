package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonGetter {
  public int id;
  private String theNaame;

  @JsonGetter("name")
  public String getTheName() {
    return theNaame;
  }
}
