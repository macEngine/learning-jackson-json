package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonIgnore {
  @JsonIgnore
  public int id;
  public String name;
}
