package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestJsonSetter {
  @Test
  public void whenDeserializingWithJsonSetter_thenCorrect()
      throws IOException {

    String json = "{\"id\":1,\"name\":\"Alex\"}";

     UserWithJsonSetter user = new ObjectMapper()
        .readerFor(UserWithJsonSetter.class)
        .readValue(json);
    assertEquals("Alex", user.getTheName());
  }
}
