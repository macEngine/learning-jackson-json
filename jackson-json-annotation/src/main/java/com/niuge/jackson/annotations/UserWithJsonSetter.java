package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class UserWithJsonSetter {
  public int id;
  private String theName;

  @JsonSetter("name")
  public void setTheName(String theName) {
    this.theName = theName;
  }
}
