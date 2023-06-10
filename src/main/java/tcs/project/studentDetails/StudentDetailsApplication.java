package tcs.project.studentDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class StudentDetailsApplication extends SpringBootServletInitializer{
	
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(StudentDetailsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
	}

}
