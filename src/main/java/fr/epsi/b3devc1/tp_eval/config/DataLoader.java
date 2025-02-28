package fr.epsi.b3devc1.tp_eval.config;

import fr.epsi.b3devc1.tp_eval.entity.*;
import fr.epsi.b3devc1.tp_eval.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class DataLoader implements CommandLineRunner {

    private final PetStoreRepository petStoreRepository;
    private final AnimalRepository animalRepository;

    public DataLoader(PetStoreRepository petStoreRepository, AnimalRepository animalRepository) {
        this.petStoreRepository = petStoreRepository;
        this.animalRepository = animalRepository;
    }

    @Override
    public void run(String... args) {
        Optional<PetStore> existingStore = petStoreRepository.findById(1L);
        PetStore store;

        if (existingStore.isPresent()) {
            store = existingStore.get();
        } else {
            store = new PetStore();
            store.setName("Animal Paradise");
            petStoreRepository.save(store);
        }

        List<Animal> existingAnimals = animalRepository.findByPetStore_Id(store.getId());
        if (existingAnimals.isEmpty()) {
            Cat cat = new Cat();
            cat.setName("Misty");
            cat.setType(AnimalType.CAT);
            cat.setPetStore(store);
            cat.setFurColor("Black");

            animalRepository.save(cat);
        }
    }
}
