package com.niuge.jackson.annotations;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class Long2DateSerializer extends JsonSerializer<Long> {
  public static final String BIRTHDAY_FORMAT = "yyyy-MM-dd";

  private static SimpleDateFormat formatter
      = new SimpleDateFormat(BIRTHDAY_FORMAT);

  @Override
  public void serialize(
      Long value, JsonGenerator gen, SerializerProvider arg2)
      throws IOException {
    gen.writeString(formatter.format(value));
  }
}
