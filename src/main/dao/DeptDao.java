package main.dao;

import main.dao.provider.DeptDynaSqlProvider;
import main.domain.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

import static main.util.common.Contants.DEPTTABLE;

public interface DeptDao {
    @SelectProvider(type = DeptDynaSqlProvider.class,method = "selectWithParam")
    List<Dept> selectByPage(Map<String,Object> params);

    @SelectProvider(type = DeptDynaSqlProvider.class, method = "count")
    Integer count(Map<String,Object> params);

    @Select("select * from "+DEPTTABLE+" where ID = #{id}")
    Dept selectById(int id);

    @Select("select * from "+DEPTTABLE+" ")
    List<Dept> selectAllDept();

    @Delete(" delete from "+DEPTTABLE+" where ID = #{id}")
    void deleteById(Integer id);

    @SelectProvider(type = DeptDynaSqlProvider.class, method = "insertDept")
    void save(Dept dept);

    @SelectProvider(type = DeptDynaSqlProvider.class, method = "updateDept")
    void update(Dept dept);

}
