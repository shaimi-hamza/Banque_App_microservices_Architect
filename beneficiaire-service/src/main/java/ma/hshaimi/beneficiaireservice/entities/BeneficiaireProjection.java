package ma.hshaimi.beneficiaireservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all",types = {Beneficiaire.class})

public interface BeneficiaireProjection {
    String getId();
    String getnom();
    String getprenom();
    String getrib();
    String gettype();

}
