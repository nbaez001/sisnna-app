package pe.gob.mimp.sisnna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SisnnaApplication {

	private static final Logger log = LoggerFactory.getLogger(SisnnaApplication.class);

	public static void main(String[] args) {
		log.info("---------Start class Application---------");
		SpringApplication.run(SisnnaApplication.class, args);
	}
}
