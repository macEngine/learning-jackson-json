package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class UserWithJsonAnySetter {
  public String name;
  private Map<String, String> properties = new HashMap<String, String>();

  @JsonAnySetter
  public void add(String key, String value) {
    properties.put(key, value);
  }
}
