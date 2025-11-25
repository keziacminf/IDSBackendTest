package IDS.restful.repository;

import IDS.restful.model.StatusItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<StatusItem, Long> {

}