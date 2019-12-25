package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;

public class UserWithJsonDeserialize {
  public String name;

  @JsonDeserialize(using = Date2LongDeserializer.class)
  public Long birthday;
}
