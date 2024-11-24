package ma.hshaimi.virementservice;

import ma.hshaimi.virementservice.entities.Virement;
import ma.hshaimi.virementservice.repository.VirementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class VirementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirementServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(VirementRepository virementRepository) {
        return args -> {
            virementRepository.save(Virement.builder().
                    id(UUID.randomUUID().toString()).idBeneficiaire("1111111110").ribSource("11221122112").montant(5000)
                    .description("paiement F150").type("Instantané").build());
        };
    }
}
