package team.hld.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.hld.entity.User;

import java.util.List;

/**
 * @author liam
 * @date 2020/10/12 19:20
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 查询用户权限列表
     * @param id 用户id
     * @return 权限列表
     */
    @Select("SELECT CODE \n" +
            "FROM\n" +
            "\tprivilege \n" +
            "WHERE\n" +
            "\tid IN (\n" +
            "\tSELECT\n" +
            "\t\tprivilege_id \n" +
            "\tFROM\n" +
            "\t\trole_privilege \n" +
            "\tWHERE\n" +
            "\trole_id = ( SELECT role_id FROM user_role WHERE user_id = #{id} ) \n" +
            "\t)")
    List<String> getPrivileges(Integer id);
}
