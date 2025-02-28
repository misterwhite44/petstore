package fr.epsi.b3devc1.tp_eval.repository;

import fr.epsi.b3devc1.tp_eval.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByPetStore_Id(Long storeId);
}
