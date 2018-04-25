package co.jp.raisin.dao.mapper;

import co.jp.raisin.bean.LoginBean;

public interface LoginMapper {
  public LoginBean selectUser(String email);
}
