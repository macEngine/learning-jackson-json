package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class UserWithJsonFormat {
  public String name;

  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Date birthday;
}
