package kr.ezen.boot3.contoller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@RestController // 템플릿을 통과하지 않고 직접 출력하고자 할때 사용하는 컨트롤러
public class MyAPIController {

	// 인터넷 상에 URL 주소를 생성한다.
	@GetMapping("/")
	public String home() {
		return "나의 첫번째 스프링 부트 애플리케이션!!!";
	}
	
	// ApplicationRunner객체는 애플리케이션이 시작될때 자동으로 실행되는 객체!!
	// 초기작업을 여기서 해주면 된다. 두개의 차이는 매개변수가 다르다.
	@Bean
	ApplicationRunner getApplicationRunner() {
		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("-".repeat(120));
				System.out.println("스프링에 등록된 객체 목록");
				System.out.println("-".repeat(120));
				}
		};
	}
}
