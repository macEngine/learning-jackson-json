package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonSerialize {
  public String name;

  @JsonSerialize(using = Long2DateSerializer.class)
  public Long birthday;
}
