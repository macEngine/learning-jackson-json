package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonIgnore {
  @Test
  public void whenSerializingWithJsonIgnore_thenCorrect()
      throws JsonProcessingException {

    UserWithJsonIgnore user = new UserWithJsonIgnore(1, "Alex");

    String result = new ObjectMapper()
        .writeValueAsString(user);

    assertThat(result, containsString("Alex"));
    assertThat(result, not(containsString("id")));
  }
}
