package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class TestJsonAnyGetter {
  @Test
  public void whenSerializingUsingJsonAnyGetter_thenCorrect()
      throws JsonProcessingException {

    PaymentResponse paymentResponse = new PaymentResponse("reqId1");
    paymentResponse.add("attr1", "val1");
    paymentResponse.add("attr2", "val2");

    String result = new ObjectMapper().writeValueAsString(paymentResponse);

    System.out.println(result);
    assertThat(result, containsString("attr1"));
    assertThat(result, containsString("val1"));
  }
}
