package PAE.KTP1_018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Ktp1018Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Ktp1018Application.class, args);
	}
        @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Ktp1018Application.class);
    }
    
}
