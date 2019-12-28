package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestJacksonInject {
  @Test
  public void whenDeserializingWithJsonInject_thenCorrect()
      throws IOException {

    String json = "{\"id\":\"1\"}";

    InjectableValues inject = new InjectableValues.Std()
        .addValue(String.class, "Alex");
    UserWithJacksonInject userWithJacksonInject = new ObjectMapper().reader(inject)
        .forType(UserWithJacksonInject.class)
        .readValue(json);

    assertEquals(1, userWithJacksonInject.id);
    assertEquals("Alex", userWithJacksonInject.name);
  }
}
