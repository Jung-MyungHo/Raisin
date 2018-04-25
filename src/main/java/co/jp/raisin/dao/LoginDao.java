package co.jp.raisin.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import co.jp.raisin.bean.LoginBean;
import co.jp.raisin.dao.mapper.LoginMapper;

public class LoginDao extends BaseDao {

  public LoginBean selectUser(String email) throws IOException {
    LoginBean result = null;
    SqlSession session = getFactory().openSession();
    LoginMapper mapper = session.getMapper(LoginMapper.class);
    result = mapper.selectUser(email);
    session.close();
    return result;

  }

}
