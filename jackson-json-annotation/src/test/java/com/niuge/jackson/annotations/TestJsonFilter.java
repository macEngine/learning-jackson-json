package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.junit.Test;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonFilter {
  @Test
  public void whenSerializingWithJsonFilter_thenCorrect()
      throws Exception {
    UserWithJsonFilter user = new UserWithJsonFilter(1, "Alex", "123456");

    FilterProvider filters
        = new SimpleFilterProvider().addFilter(
        "passwordFilter",
        SimpleBeanPropertyFilter.serializeAllExcept("password"));

    String result = new ObjectMapper()
        .writer(filters)
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
    assertThat(result, not(containsString("passdword")));
  }
}
