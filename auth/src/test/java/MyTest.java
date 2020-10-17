import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;
import team.hld.AuthApplication;
import team.hld.service.MyUserDetailsService;

/**
 * @author liam
 * @date 2020/10/12 19:39
 */
@SpringBootTest(classes = AuthApplication.class)
@RunWith(SpringRunner.class)
public class MyTest {
    @Autowired
    MyUserDetailsService myUserDetailsService;

    @Test
    public void test() {
        UserDetails userDetails = myUserDetailsService.loadUserByUsername("huazai");
        System.out.println(userDetails.toString());
    }
}
