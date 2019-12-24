package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestJsonRootName {
  @Test
  public void whenSerializingWithJsonRootName_thenCorrect()
      throws JsonProcessingException {

    UserWithJsonRootName user = new UserWithJsonRootName(1, "Alex");

    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
    String result = mapper.writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("user"));
    assertThat(result, containsString("Alex"));
  }
}
