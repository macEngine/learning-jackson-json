package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JacksonInject;

public class UserWithJacksonInject {
  public int id;

  @JacksonInject
  public String name;
}
