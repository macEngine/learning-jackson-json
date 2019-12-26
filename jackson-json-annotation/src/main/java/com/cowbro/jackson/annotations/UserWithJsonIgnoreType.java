package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonIgnoreType {
  public int id;
  public Address address;

  @AllArgsConstructor
  @JsonIgnoreType
  public static class Address {
    public String province;
    public String city;
  }
}
