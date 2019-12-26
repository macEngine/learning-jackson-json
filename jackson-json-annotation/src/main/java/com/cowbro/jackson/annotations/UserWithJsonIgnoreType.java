package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.AllArgsConstructor;
import sun.jvm.hotspot.debugger.Address;

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
