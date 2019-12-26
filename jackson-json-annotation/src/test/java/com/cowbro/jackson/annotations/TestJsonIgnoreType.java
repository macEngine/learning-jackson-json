package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.text.ParseException;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonIgnoreType {
  @Test
  public void whenSerializingWithJsonIgnoreType_thenCorrect()
      throws JsonProcessingException {

    UserWithJsonIgnoreType.Address address = new UserWithJsonIgnoreType.Address("Zhejiang", "Hangzhou");
    UserWithJsonIgnoreType user = new UserWithJsonIgnoreType(1, address);

    String result = new ObjectMapper()
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, not(containsString("Zhejiang")));
    assertThat(result, not(containsString("Hangzhou")));
  }
}
