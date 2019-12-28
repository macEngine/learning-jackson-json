package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserWithJsonUnwrapped {
  public int id;
  @JsonUnwrapped
  public Address address;

  @AllArgsConstructor
  public static class Address {
    public String province;
    public String city;
  }
}
