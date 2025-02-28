package fr.epsi.b3devc1.tp_eval.service;

import fr.epsi.b3devc1.tp_eval.entity.Animal;
import fr.epsi.b3devc1.tp_eval.repository.AnimalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PetStoreService {
    private final AnimalRepository animalRepository;

    public PetStoreService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAnimalsByStore(Long storeId) {
        return animalRepository.findByPetStore_Id(storeId);
    }
}
