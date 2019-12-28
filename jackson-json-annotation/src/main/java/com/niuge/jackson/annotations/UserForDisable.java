package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserForDisable {
  public int id;
  public String name;
}
