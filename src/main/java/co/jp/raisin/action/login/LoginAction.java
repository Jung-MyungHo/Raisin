package co.jp.raisin.action.login;

import java.io.IOException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import co.jp.raisin.bean.LoginBean;
import co.jp.raisin.constant.Constants;
import co.jp.raisin.dao.LoginDao;
import lombok.Getter;
import lombok.Setter;

/**
 * ログインActionクラス
 *
 * @author Raisin
 * @since 2018-04-25
 */
public class LoginAction extends ActionSupport implements SessionAware {

  private static final long serialVersionUID = -5647390413888023978L;

  private Map<String, Object> session;

  @Getter
  @Setter
  private LoginBean loginBean;

  @Override
  public String execute() throws IOException {
    if (!checkLogin()) {
      return INPUT;
    }
    session.put(Constants.USER_KEY, loginBean);
    return SUCCESS;
  }

  /**
   * ログイン処理
   *
   * @return ログイン結果
   * @throws IOException IOException
   */
  public boolean checkLogin() throws IOException {

    // エラーがあれば抜ける
    if (hasErrors()) {
      return false;
    }

    // 情報取得
    LoginDao dao = new LoginDao();
    LoginBean bean = null;

    bean = dao.selectUser(loginBean.getEmail());

    // ログイン情報の一致チェック
    if (bean == null) {
      this.addFieldError(Constants.LOGIN_EMAIL, Constants.MSG_EMAIL_NOTHING);

    } else if (!bean.getPassword().equals(loginBean.getPassword())) {
      this.addFieldError(Constants.LOGIN_PASSWORD, Constants.MSG_PASSWORD_WRONG);
    }

    if (hasErrors()) {
      return false;
    }

    return true;
  }

  @Override
  public void setSession(Map<String, Object> session) {
    this.session = session;
  }
}
