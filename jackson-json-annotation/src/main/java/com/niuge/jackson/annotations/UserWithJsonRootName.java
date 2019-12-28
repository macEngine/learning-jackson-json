package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonRootName(value = "user")
public class UserWithJsonRootName {
  public int id;
  public String name;
}
