package com.niuge.jackson.annotations;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2LongDeserializer extends JsonDeserializer<Long> {
  public static final String BIRTHDAY_FORMAT = "yyyy-MM-dd";

  @Override
  public Long deserialize(
      JsonParser jsonparser, DeserializationContext context)
      throws IOException {

    String date = jsonparser.getText();
    try {
      return new SimpleDateFormat(BIRTHDAY_FORMAT).parse(date).getTime();
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }
}
