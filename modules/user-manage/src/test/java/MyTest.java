import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.hld.UserApplication;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author liam
 * @date 2020/10/8 21:09
 */
@SpringBootTest(classes = UserApplication.class)
@RunWith(SpringRunner.class)
public class MyTest {
    @Autowired
    DataSource dataSource;
    @Test
    public void test() throws SQLException {
        System.out.println(dataSource.getClass());

        System.out.println(dataSource.getConnection());

    }
}
