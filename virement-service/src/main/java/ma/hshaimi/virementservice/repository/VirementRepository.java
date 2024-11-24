package ma.hshaimi.virementservice.repository;

import ma.hshaimi.virementservice.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VirementRepository extends JpaRepository<Virement, Integer> {

}
