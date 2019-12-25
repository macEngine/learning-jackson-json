package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonSerialize {
  @Test
  public void whenSerializingWithJsonSerialize_thenCorrect()
      throws JsonProcessingException, ParseException {

    SimpleDateFormat simpleDateFormat
        = new SimpleDateFormat(Long2DateSerializer.BIRTHDAY_FORMAT);

    String toParse = "1990-12-20";
    long time = simpleDateFormat.parse(toParse).getTime();
    UserWithJsonSerialize user = new UserWithJsonSerialize("Alex", time);

    String result = new ObjectMapper().writeValueAsString(user);
    System.out.println(result);
    assertThat(result, containsString(toParse));
  }
}
