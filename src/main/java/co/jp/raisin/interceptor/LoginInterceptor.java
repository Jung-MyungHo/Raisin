package co.jp.raisin.interceptor;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.dispatcher.HttpParameters;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import co.jp.raisin.bean.LoginBean;
import co.jp.raisin.constant.Constants;

/**
 * ログイン認証を行う
 *
 * @author Raisin
 * @since 2018-04-27
 *
 */
public class LoginInterceptor extends AbstractInterceptor {

  private static final long serialVersionUID = -5640918453689284170L;
  private static final Logger LOG = LogManager.getLogger(LoginInterceptor.class);

  @Override
  public String intercept(ActionInvocation invocation) {
    try {

      Map<String, Object> session = invocation.getInvocationContext().getSession();
      LoginBean login = (LoginBean) session.get(Constants.USER_KEY);

      if (login == null) {
        HttpParameters params = invocation.getInvocationContext().getParameters();
        String email = params.get(Constants.LOGIN_EMAIL).getValue();
        String password = params.get(Constants.LOGIN_PASSWORD).getValue();
        if (email == null && password == null) {
          return Constants.MODE_LOGIN;
        }
      }
      return invocation.invoke();

    } catch (Exception e) {
      LOG.error(e.getMessage());
      return Constants.MODE_ERROR;
    }
  }
}
