package ma.hshaimi.beneficiaireservice;

import ma.hshaimi.beneficiaireservice.entities.Beneficiaire;
import ma.hshaimi.beneficiaireservice.repository.BeneficiaireRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeneficiaireServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeneficiaireServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(BeneficiaireRepository beneficiaireRepository) {
        return args -> {
            beneficiaireRepository.save(Beneficiaire.builder()
                    .nom("shaimi").prenom("hamza").rib("123321112345").type("physique")
                    .build());
            beneficiaireRepository.save(Beneficiaire.builder()
                    .nom("alaoui").prenom("hassan").rib("99999900999").type("physique")
                    .build());
            beneficiaireRepository.save(Beneficiaire.builder()
                    .nom("Holding").prenom("Shaimi").rib("1111111110").type("morale")
                    .build());
        };
    }

}
