package team.hld.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liam
 * @date 2020/10/19 19:13
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SocketException.class)
    public Map<String, Object> socketException() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 500);
        map.put("msg", "与注册服务器断开连接，请稍后重试！");
        return map;
    }
}
