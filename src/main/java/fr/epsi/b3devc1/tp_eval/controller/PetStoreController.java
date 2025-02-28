package fr.epsi.b3devc1.tp_eval.controller;

import fr.epsi.b3devc1.tp_eval.entity.Animal;
import fr.epsi.b3devc1.tp_eval.service.PetStoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/petstores")
public class PetStoreController {

    private final PetStoreService petStoreService;

    public PetStoreController(PetStoreService petStoreService) {
        this.petStoreService = petStoreService;
    }

    @GetMapping("/{id}/animals")
    public List<Animal> getAnimals(@PathVariable Long id) {
        return petStoreService.getAnimalsByStore(id);
    }
}
