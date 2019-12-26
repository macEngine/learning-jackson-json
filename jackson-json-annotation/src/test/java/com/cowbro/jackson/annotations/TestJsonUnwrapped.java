package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestJsonUnwrapped {
  @Test
  public void whenSerializingWithJsonUnwrapped_thenCorrect()
      throws Exception {
    UserWithJsonUnwrapped.Address address
        = new UserWithJsonUnwrapped.Address("Zhejiang", "Hangzhou");
    UserWithJsonUnwrapped user = new UserWithJsonUnwrapped(1, address);

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("Zhejiang"));
    assertThat(result, not(containsString("address")));
  }
}
