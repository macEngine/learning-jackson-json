package com.niuge.jackson.objectmapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestObjectMapper {
  @Test
  public void whenSerializingToString_thenCorrect()
      throws Exception {
    UserForObjectMapperDemo user
        = new UserForObjectMapperDemo(1, "Alex");

    String result = new ObjectMapper()
        .writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
  }

  @Test
  public void whenSerializingToFile_thenCorrect()
      throws Exception {
    UserForObjectMapperDemo user
        = new UserForObjectMapperDemo(1, "Alex");

    new ObjectMapper()
        .writeValue(new File("./target/123.txt"), user);
  }

  @Test
  public void whenSerializingToBytesArray_thenCorrect()
      throws Exception {
    UserForObjectMapperDemo user
        = new UserForObjectMapperDemo(1, "Alex");

    byte[] bytes = new ObjectMapper()
        .writeValueAsBytes(user);

    String result = new String(bytes);
    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
  }

  @Test
  public void whenDeserializingFromString_thenCorrect()
      throws Exception {

    String json = "{\"name\":\"Alex\"}";

    UserForObjectMapperDemo user = new ObjectMapper()
        .readerFor(UserForObjectMapperDemo.class)
        .readValue(json);

    assertEquals("Alex", user.name);
  }

  @Test
  public void whenDeserializingFromFile_thenCorrect()
      throws Exception {
    UserForObjectMapperDemo user = new ObjectMapper()
        .readerFor(UserForObjectMapperDemo.class)
        .readValue(new File("./target/123.txt"));

    assertEquals("Alex", user.name);
  }

  @Test
  public void whenDeserializingFromStringToJsonNode_thenCorrect()
      throws Exception {

    String json = "{\"name\":\"Alex\"}";

    JsonNode jsonNode = new ObjectMapper()
        .readTree(json);

    String name = jsonNode.get("name").asText();
    assertEquals("Alex", name);
  }

  @Test
  public void whenDeserializingFromStringToList_thenCorrect()
      throws Exception {

    String json = "[{\"name\":\"Alex\"},{\"name\":\"Tom\"}]";

    List<UserForObjectMapperDemo> users = new ObjectMapper()
        .readValue(json, new TypeReference<List<UserForObjectMapperDemo>>(){});

    assertEquals(2, users.size());
    assertEquals("Alex", users.get(0).name);
    assertEquals("Tom", users.get(1).name);
  }

  @Test
  public void whenDeserializingFromStringToMap_thenCorrect()
      throws Exception {

    String json = "{\"name\":\"Alex\", \"sex\":\"boy\"}";

    Map<String, String> map = new ObjectMapper()
        .readValue(json, new TypeReference<Map<String, String>>() {});

    assertEquals("Alex", map.get("name"));
    assertEquals("boy", map.get("sex"));
  }
}
