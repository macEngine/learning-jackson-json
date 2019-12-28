package com.niuge.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonManageReference {
  @Test
  public void whenSerializingWithJacksonReferenceAnnotation_thenCorrect()
      throws Exception {
    UserWithJsonManagedReference.Address address
        = new UserWithJsonManagedReference.Address(
        "Zhejiang", "Hangzhou", new ArrayList<UserWithJsonManagedReference>());
    UserWithJsonManagedReference user = new UserWithJsonManagedReference(1, "Alex", address);
    address.people.add(user);

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
    assertThat(result, not(containsString("people")));
  }
}
