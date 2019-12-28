package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestJsonCreator {
  @Test
  public void whenDeserializingWithJsonCreator_thenCorrect()
      throws IOException {

    String json = "{\"id\":1,\"theName\":\"Alex\"}";

    UserWithJsonCreator userWithJsonCreator = new ObjectMapper()
        .readerFor(UserWithJsonCreator.class)
        .readValue(json);
    assertEquals("Alex", userWithJsonCreator.name);
  }
}
