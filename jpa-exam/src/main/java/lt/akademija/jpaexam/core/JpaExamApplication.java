package lt.akademija.jpaexam.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class JpaExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExamApplication.class, args);
	}
}
