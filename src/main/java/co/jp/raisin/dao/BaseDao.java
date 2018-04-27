package co.jp.raisin.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * BaseDaoクラス
 *
 * @author Raisin
 * @since 2018-04-25
 */
public abstract class BaseDao {

  private InputStream inputStream;

  /**
   * コネクション情報を取得し、Factoryを生成する
   *
   * @return SqlSessionFactory
   * @throws IOException コネクション入力例外
   */
  protected SqlSessionFactory getFactory() throws IOException {
    String resource = "mybatis-config.xml";
    inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
        .build(inputStream);
    inputStream.close();
    return sqlSessionFactory;
  }

}
