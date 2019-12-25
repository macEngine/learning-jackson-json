package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestJsonAlias {
  @Test
  public void whenDeserializingWithJsonAlias_thenCorrect()
      throws IOException {
    String json = "{\"id\": \"1\", \"username\": \"Alex\"}";
    UserWithJsonAlias user = new ObjectMapper()
        .readerFor(UserWithJsonAlias.class)
        .readValue(json);
    assertEquals("Alex", user.getName());
  }
}
