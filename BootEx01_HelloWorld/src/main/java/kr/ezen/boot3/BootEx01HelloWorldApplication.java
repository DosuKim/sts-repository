package kr.ezen.boot3;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootEx01HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootEx01HelloWorldApplication.class, args);
	}
	
	// CommandLineRunner 객체는 애플리케이션이 시작될 때 자동으로 실행되는 객체!!
	// 초기 작업을 여기서 해주면 된다.
	@Bean
	CommandLineRunner getCommandLineRunner() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				System.out.println("-".repeat(120));
				System.out.println("http://localhost:8080 으로 접속해주세요.");
				System.out.println("-".repeat(120));
			}
		};
	}
	// ApplicationRunner 객체는 애플리케이션이 시작될 때 자동으로 실행되는 객체!!
	// 초기 작업을 여기서 해주면 된다. 두개의 차이는 매개변수가 다르다.
	@Bean
	ApplicationRunner getApplicationRunner() {
		return new ApplicationRunner() {
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("-".repeat(120));
				System.out.println("스프링에 등록된 객체 목록");
				System.out.println("-".repeat(120));
				
				System.out.println("-".repeat(120));
			}
		};
	}
}
