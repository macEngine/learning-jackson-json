package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestJsonDeserialize {
  @Test
  public void whenDeserializingWithJsonDeserialize_thenCorrect()
      throws IOException {

    String json
        = "{\"name\":\"Alex\",\"birthday\":\"2019-12-25\"}";

    SimpleDateFormat df
        = new SimpleDateFormat(Date2LongDeserializer.BIRTHDAY_FORMAT);
    UserWithJsonDeserialize user = new ObjectMapper()
        .readerFor(UserWithJsonDeserialize.class)
        .readValue(json);

    assertEquals("2019-12-25", df.format(user.birthday));
  }
}
