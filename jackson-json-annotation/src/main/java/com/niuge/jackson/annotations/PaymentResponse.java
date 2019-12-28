package com.niuge.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class PaymentResponse {
  public String reqId;
  private Map<String, String> properties;

  public PaymentResponse() {
    properties = new HashMap<String, String>();
  }

  public PaymentResponse(String reqId) {
    this.reqId = reqId;
    properties = new HashMap<String, String>();
  }

  @JsonAnySetter
  public void add(final String key, final String value) {
    properties.put(key, value);
  }

  @JsonAnyGetter
  public Map<String, String> getProperties() {
    return properties;
  }
}
