package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonView {
  @Test
  public void whenSerializingWithJsonView_thenCorrect()
      throws Exception {
    UserWithJsonView user = new UserWithJsonView(1, "Alex", "123456");

    String result = new ObjectMapper()
        .writerWithView(UserWithJsonView.UserSimpleView.class)
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
    assertThat(result, not(containsString("123456")));
  }

  @Test
  public void givenUserDetailView_whenSerializingWithJsonView_thenCorrect()
      throws Exception {
    UserWithJsonView user = new UserWithJsonView(1, "Alex", "123456");

    String result = new ObjectMapper()
        .writerWithView(UserWithJsonView.UserDetailView.class)
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
    assertThat(result, containsString("123456"));
  }
}
