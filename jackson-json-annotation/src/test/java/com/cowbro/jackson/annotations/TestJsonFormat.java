package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestJsonFormat {
  @Test
  public void whenSerializingWithJsonFormat_thenCorrect()
      throws JsonProcessingException, ParseException {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));

    String toParse = "2019-12-27";
    Date date = df.parse(toParse);
    UserWithJsonFormat user = new UserWithJsonFormat("Alex", date);

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString(toParse));
  }
}
