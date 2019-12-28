package com.niuge.jackson.objectmapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.niuge.jackson.annotations.UserWithJsonView;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestObjectMapper {
  @Test
  public void whenSerializingToString_thenCorrect()
      throws Exception {
    UserForObjectMapperDemo user = new UserForObjectMapperDemo(1, "Alex");

    String result = new ObjectMapper()
        .writerWithView(UserWithJsonView.UserSimpleView.class)
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
  }
  @Test
  public void whenSerializingToFile_thenCorrect()
      throws Exception {
    UserForObjectMapperDemo user = new UserForObjectMapperDemo(1, "Alex");

    new ObjectMapper()
        .writerWithView(UserWithJsonView.UserSimpleView.class)
        .writeValue(new File("123.txt"), user);

  }
}
