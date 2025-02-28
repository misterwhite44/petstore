package fr.epsi.b3devc1.tp_eval.repository;

import fr.epsi.b3devc1.tp_eval.entity.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
}
