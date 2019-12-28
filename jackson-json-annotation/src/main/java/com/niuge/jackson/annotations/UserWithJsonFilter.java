package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@JsonFilter("passwordFilter")
public class UserWithJsonFilter {
  public int id;
  public String name;
  public String password;
}
