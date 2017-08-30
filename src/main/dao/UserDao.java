package main.dao;

import main.dao.provider.UserDynaSqlProvider;
import main.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

import static main.util.common.Contants.USERTABLE;

public interface UserDao {

    @Select("select * from "+USERTABLE+" where loginname = # {loginname} and password = # {password}")
    User selectByLoginnameAndPassword(
      @Param("loginname") String loginname,
      @Param("password") String password
    );

    @Select("select * from "+USERTABLE+" where ID = #{id}")
    User selectById(Integer id);

    @Delete("delete form "+USERTABLE+" where id = #{id}")
    void deleteById(Integer id);

    @SelectProvider(type = UserDynaSqlProvider.class, method="selectWithParam")
    List<User> selectByPage(Map<String,Object> params);

    @SelectProvider(type=UserDynaSqlProvider.class, method="count")
    Integer count(Map<String,Object> params);

    @SelectProvider(type=UserDynaSqlProvider.class, method="insertUser")
    void save(User user);

}
