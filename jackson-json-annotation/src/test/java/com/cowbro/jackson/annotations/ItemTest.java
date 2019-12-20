package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class ItemTest {
  /**
   * AddMixIn, 把一个特性混入原来的VO里面。
   *
   * addMixIn 和 @JsonIgnore 最本质的区别：
   * JsonIgnore 需要修改原来的代码，不能同时兼容两个输出。
   * addMixIn 可以实现不修改VO的情况下，给A接口输出5个字段，给A接口输出4个字段。
   */

  @Test
  public void whenSerializingUsingMixInAnnotation_thenCorrect()
      throws JsonProcessingException {
    Item item = new Item(1, "book", null);

    String result = new ObjectMapper().writeValueAsString(item);
    System.out.println(result);
    assertThat(result, containsString("owner"));

    ObjectMapper mapper = new ObjectMapper();
    mapper.addMixIn(User.class, MyMixInForIgnoreType.class);

    result = mapper.writeValueAsString(item);
    System.out.println(result);
    assertThat(result, not(containsString("owner")));
  }
}
