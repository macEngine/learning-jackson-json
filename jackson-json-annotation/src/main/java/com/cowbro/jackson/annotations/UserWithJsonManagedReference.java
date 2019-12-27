package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class UserWithJsonManagedReference {
  public int id;
  public String name;
  @JsonManagedReference
  public Address address;

  @AllArgsConstructor
  public static class Address {
    public String province;
    public String city;
    @JsonBackReference
    public List<UserWithJsonManagedReference> people;
  }
}
