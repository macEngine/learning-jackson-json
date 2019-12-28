package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class UserWithJsonDeserialize {
  public String name;

  @JsonDeserialize(using = Date2LongDeserializer.class)
  public Long birthday;
}
