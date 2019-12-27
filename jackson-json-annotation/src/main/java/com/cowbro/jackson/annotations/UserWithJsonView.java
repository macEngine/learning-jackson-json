package com.cowbro.jackson.annotations;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserWithJsonView {
  // 声明一般视图接口，只允许返回用户名
  public interface UserSimpleView {
  }

  // 声明完整视图接口，允许返回用户名和密码，由于集成了一般视图接口，拥有了一般视图所具有的返回属性
  public interface UserDetailView extends UserSimpleView {
  }

  @JsonView(UserSimpleView.class)
  private Integer id;

  @JsonView(UserSimpleView.class)
  private String userName;

  @JsonView(UserDetailView.class)
  private String passWord;
}
