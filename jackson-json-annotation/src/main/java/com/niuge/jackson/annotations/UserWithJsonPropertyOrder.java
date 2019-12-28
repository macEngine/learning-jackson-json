package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonPropertyOrder({"name", "id"})
public class UserWithJsonPropertyOrder {
  public int id;
  public String name;
}
