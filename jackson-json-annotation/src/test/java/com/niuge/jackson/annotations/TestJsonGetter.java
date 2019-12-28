package com.niuge.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonGetter {
  @Test
  public void whenSerializingWithJsonGetter_thenCorrect()
      throws JsonProcessingException {

    UserWithJsonGetter user = new UserWithJsonGetter(1, "Alex");

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("name"));
    assertThat(result, containsString("Alex"));
  }
}
