package ke.dci.addnumbers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AddNumbersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AddNumbersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.warn("Hello Steve");
    }
}
