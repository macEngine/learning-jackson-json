package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestJsonAnySetter {
  @Test
  public void whenDeserializingWithJsonAnySetter_thenCorrect()
      throws IOException {
    String json
        = "{\"name\":\"Alex\",\"attr1\":\"val1\"}";

    UserWithJsonAnySetter user = new ObjectMapper()
        .readerFor(UserWithJsonAnySetter.class)
        .readValue(json);

    assertEquals("Alex", user.name);
    assertEquals("val1", user.getProperties().get("attr1"));
  }
}
