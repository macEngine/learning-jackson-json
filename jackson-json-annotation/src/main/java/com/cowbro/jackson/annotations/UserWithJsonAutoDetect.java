package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserWithJsonAutoDetect {
  private int id;
  private String name;
}
