package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJacksonAnnotationsInside {
  @Test
  public void whenSerializingWithCustomAnnotation_thenCorrect()
      throws Exception {
    UserWithJacksonAnnotationsInside user
        = new UserWithJacksonAnnotationsInside(1, "Alex", null);

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("Alex"));
    assertThat(result, containsString("1"));
    assertThat(result, not(containsString("password")));
  }
}
