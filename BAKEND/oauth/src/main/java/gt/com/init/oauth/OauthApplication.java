package gt.com.init.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthApplication {

	public static void main(String[] args) {
		System.out.println("Hello word from oauth init webapps");
		SpringApplication.run(OauthApplication.class, args);
	}

}
