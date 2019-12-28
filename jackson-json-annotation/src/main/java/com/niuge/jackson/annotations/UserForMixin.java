package com.niuge.jackson.annotations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserForMixin {
  public int id;
  public String name;
  public Address address;

  @AllArgsConstructor
  public static class Address {
    public String province;
    public String city;
  }
}
