package co.jp.raisin.constant;

/**
 * 定数クラス
 *
 * @author Raisin
 * @since 2018-04-27
 *
 */
public class Constants {

  // キー又はField名
  /** 認証キー */
  public static final String USER_KEY = "USER";
  /** ログイン画面_Email */
  public static final String LOGIN_EMAIL = "loginBean.email";
  /** ログイン画面_password */
  public static final String LOGIN_PASSWORD = "loginBean.password";

  // 画面モード
  /** 画面モード_ログイン画面 */
  public static final String MODE_LOGIN = "login";
  /** 画面モード_エラー画面 */
  public static final String MODE_ERROR = "error";

  // メッセージ一覧
  // TODO properties管理が必要
  /** 入力エラー: Emailなし */
  public static final String MSG_EMAIL_NOTHING = "Emailが存在していません。";
  /** 入力エラー: パスワードエラー */
  public static final String MSG_PASSWORD_WRONG = "パスワードが間違います。";

}
