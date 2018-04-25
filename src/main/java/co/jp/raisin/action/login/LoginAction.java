package co.jp.raisin.action.login;

import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

import co.jp.raisin.bean.LoginBean;
import co.jp.raisin.dao.LoginDao;
import lombok.Getter;
import lombok.Setter;

/**
 * ログインActionクラス
 *
 * @author Raisin
 * @since 2018-04-25
 */
public class LoginAction extends ActionSupport {

  private static final long serialVersionUID = -5647390413888023978L;

  @Getter
  @Setter
  private LoginBean loginBean;

  @Override
  public String execute() {
    return SUCCESS;
  }

  @Override
  public void validate() {
    LoginDao dao = new LoginDao();
    LoginBean bean = null;
    try {
      bean = dao.selectUser(loginBean.getEmail());
    } catch (IOException e) {
      e.printStackTrace();
    }

    if (bean == null) {
      this.addFieldError("loginBean.email", "IDが存在していません。");

    }
    if (bean != null && !bean.getPassword().equals(loginBean.getPassword())) {
      this.addFieldError("loginBean.password", "パスワードが間違います。");
    }
  }
}
