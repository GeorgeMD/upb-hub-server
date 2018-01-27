package srv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author GeorgeMD
 */
@SpringBootApplication
@ComponentScan("srv")
@EnableJpaRepositories("srv.repositories")
@EntityScan("srv.entities")
public class RunWebApi {

    public static void main(String[] args) {
        SpringApplication.run(RunWebApi.class, args);
    }
}
