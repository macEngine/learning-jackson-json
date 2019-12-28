package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonIgnoreProperties({ "id" })
public class UserWithJsonIgnoreProperties {
  public int id;
  public String name;
}
