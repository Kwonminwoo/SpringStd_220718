package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        // 정보들이 콘솔창에 찍힘
        // 로그 레벨이 나눠져 있으며 아래 적힌 순서대로 임. 기본은 info부터 출력이 되나 properties에서 설정하면 trace debug도 볼 수 있음.
        // 필요한 레벨 이하만 출력하는데 이용 됨. (운영서버, 개발서버 등등을 다르게 해서 중요한 정보만을 받아 보게)
        log.trace(" trace log={}", name);
//        log.trace(" trace log= " + name);
        // 이렇게 안 쓰는 이유는 컴파일 과정 시 쓸데없는 문자열 연산이 일어날 수도 있어 낭비를 막기 위함임.
        log.debug(" debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);

        return "ok"; // RestController를 쓰면 반환되는 값이 그대로 body로 넘어감
    }
}
