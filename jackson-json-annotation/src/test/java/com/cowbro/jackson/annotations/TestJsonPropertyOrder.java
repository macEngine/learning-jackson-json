package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonPropertyOrder {
  @Test
  public void whenSerializingUsingJsonPropertyOrder_thenCorrect()
      throws JsonProcessingException {

    UserWithJsonPropertyOrder user = new UserWithJsonPropertyOrder(1, "Alex");

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("Alex"));
    assertThat(result, containsString("1"));
  }
}
