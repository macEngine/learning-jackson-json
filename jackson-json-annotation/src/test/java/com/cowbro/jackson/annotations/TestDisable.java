package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class TestDisable {
  @Test
  public void whenSerializingWithDisableAnnotation_thenCorrect()
      throws JsonProcessingException {
    UserForDisable user = new UserForDisable(1, null);

    ObjectMapper mapper = new ObjectMapper();
    mapper.disable(MapperFeature.USE_ANNOTATIONS);
    String result = mapper.writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("name"));
  }
}
