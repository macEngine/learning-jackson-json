package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonInclude {
  @Test
  public void whenSerializingUsingJsonInclude_thenCorrect()
      throws JsonProcessingException {

    UserWithJsonInclude user = new UserWithJsonInclude(1, null);

    String result = new ObjectMapper()
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, not(containsString("name")));
  }
}
