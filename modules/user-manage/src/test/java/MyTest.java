import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.hld.entity.User;
import team.hld.mapper.UserMapper;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author liam
 * @date 2020/10/8 21:09
 */
@SpringBootTest
public class MyTest {
    @Autowired
    DataSource dataSource;
    @Test
    public void test() throws SQLException {
        System.out.println(dataSource.getClass());

        System.out.println(dataSource.getConnection());

    }
}
