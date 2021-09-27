package santander.crud.poc.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UsersConfig {

    @Bean
    CommandLineRunner commandLineRunner( UsersRepository repository){
        return args -> {
            Users mafalda = new Users(
                    "Mafalda",
                    "mafalda@gmail.com",
                    LocalDate.of(1997, Month.MARCH,14)
            );

            Users renato = new Users(
                    "Renato",
                    "renato@gmail.com",
                    LocalDate.of(1995, Month.MAY,14)
            );

            repository.saveAll(List.of(mafalda,renato));
        };
    }
}
