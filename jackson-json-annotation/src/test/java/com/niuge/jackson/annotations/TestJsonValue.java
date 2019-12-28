package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestJsonValue {
  @Test
  public void whenSerializingWithJsonValue_thenCorrect()
      throws Exception {

    UserWithJsonValue user = new UserWithJsonValue(1, "Alex");

    String result = new ObjectMapper().writeValueAsString(user);
    System.out.println(result);
    // 字符串对象由双引号表示，而未加双引号引用表示字符串本身
    assertThat(result, is("\"Alex\""));
  }

  @Test
  public void testEnum_whenSerializingWithJsonValue_thenCorrect()
      throws Exception {

    String enumAsString = new ObjectMapper()
        .writeValueAsString(UserTypeWithJsonValue.NORMAL);

    System.out.println(enumAsString);
    assertThat(enumAsString, is("\"normal user\""));
  }
}
