package co.jp.raisin.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import co.jp.raisin.bean.LoginBean;
import co.jp.raisin.dao.mapper.LoginMapper;

/**
 * ログインユーザー情報のDBアクセス
 *
 * @author Raisin
 * @since 2018-04-26
 *
 */
public class LoginDao extends BaseDao {

  private SqlSession session;

  /**
   * ログインユーザー情報を取得する
   *
   * @param email email
   * @return ログイン情報
   * @throws IOException コネクション取得例外
   */
  public LoginBean selectUser(String email) throws IOException {
    LoginBean result = null;
    session = getFactory().openSession();
    LoginMapper mapper = session.getMapper(LoginMapper.class);
    result = mapper.selectUser(email);
    session.close();
    return result;

  }

}
