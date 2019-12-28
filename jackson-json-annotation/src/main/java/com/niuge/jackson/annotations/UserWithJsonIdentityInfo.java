package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
public class UserWithJsonIdentityInfo {
  public int id;
  public String name;
  public Address address;

  @AllArgsConstructor
  @JsonIdentityInfo(
      generator = ObjectIdGenerators.PropertyGenerator.class,
      property = "city")
  public static class Address {
    public String province;
    public String city;
    public List<UserWithJsonIdentityInfo> people;
  }
}
