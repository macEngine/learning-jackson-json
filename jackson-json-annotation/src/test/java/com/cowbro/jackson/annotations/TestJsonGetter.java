package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonGetter {
  @Test
  public void whenSerializingUsingJsonGetter_thenCorrect()
      throws JsonProcessingException {

    User user = new User(1, "Alex");

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
  }
}
