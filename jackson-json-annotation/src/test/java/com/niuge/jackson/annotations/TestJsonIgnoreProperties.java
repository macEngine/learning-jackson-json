package com.niuge.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonIgnoreProperties {
  @Test
  public void whenSerializingUsingJsonIgnoreProperties_thenCorrect()
      throws JsonProcessingException {

    UserWithJsonIgnoreProperties user
        = new UserWithJsonIgnoreProperties(1, "Alex");

    String result = new ObjectMapper()
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("Alex"));
  }
}
