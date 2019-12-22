package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonRawValue {
  @Test
  public void whenSerializingUsingJsonRawValue_thenCorrect()
      throws JsonProcessingException {

    // User user = new User(1, "{\"age\":18}");
     UserWithJsonRawValue user = new UserWithJsonRawValue(1, "{\"age\":18}");


    String result = new ObjectMapper().writeValueAsString(user);
    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("{\"age\":18}"));
  }
}
