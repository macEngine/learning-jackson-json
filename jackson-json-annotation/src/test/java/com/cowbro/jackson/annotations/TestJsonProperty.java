package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestJsonProperty {
  @Test
  public void whenWithJsonProperty_thenCorrect()
      throws IOException {
    UserWithJsonProperty user = new UserWithJsonProperty(1, "Alex");

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("Alex"));
    assertThat(result, containsString("1"));

    UserWithJsonProperty resultBean = new ObjectMapper()
        .readerFor(UserWithJsonProperty.class)
        .readValue(result);
    assertEquals("Alex", resultBean.getTheName());
  }
}
