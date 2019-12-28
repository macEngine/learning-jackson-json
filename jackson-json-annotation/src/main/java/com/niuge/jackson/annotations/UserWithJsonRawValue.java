package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonRawValue {
  public int id;

  @JsonRawValue
  public String json;
}
