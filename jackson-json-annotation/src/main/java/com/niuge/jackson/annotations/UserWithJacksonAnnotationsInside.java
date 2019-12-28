package com.niuge.jackson.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@CustomJacksonAnnotationsInside
public class UserWithJacksonAnnotationsInside {
  public int id;
  public String name;
  public String password;
}
