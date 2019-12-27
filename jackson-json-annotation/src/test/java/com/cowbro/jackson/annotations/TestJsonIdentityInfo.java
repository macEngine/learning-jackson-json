package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonIdentityInfo {
  @Test
  public void whenSerializingWithJacksonIdentifyInfo_thenCorrect()
      throws Exception {
    UserWithJsonIdentityInfo.Address address
        = new UserWithJsonIdentityInfo.Address(
        "Zhejiang", "Hangzhou", new ArrayList<UserWithJsonIdentityInfo>());
    UserWithJsonIdentityInfo user = new UserWithJsonIdentityInfo(1, "Alex", address);
    address.people.add(user);

    String result = new ObjectMapper().writeValueAsString(user);

    System.out.println(result);
    assertThat(result, containsString("1"));
    assertThat(result, containsString("Alex"));
    assertThat(result, (containsString("people")));
  }
}
