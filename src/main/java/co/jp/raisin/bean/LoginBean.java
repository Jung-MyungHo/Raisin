package co.jp.raisin.bean;

import lombok.Data;

/**
 * ログイン画面のBeanクラス
 *
 * @author Raisin
 * @since 2018-04-25
 */
@Data
public class LoginBean {
  private String email;
  private String password;
}
