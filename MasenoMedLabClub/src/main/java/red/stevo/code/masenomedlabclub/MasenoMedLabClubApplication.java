package red.stevo.code.masenomedlabclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MasenoMedLabClubApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasenoMedLabClubApplication.class, args);
    }

}
