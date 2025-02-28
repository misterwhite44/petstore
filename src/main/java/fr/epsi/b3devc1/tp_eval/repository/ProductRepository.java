package fr.epsi.b3devc1.tp_eval.repository;

import fr.epsi.b3devc1.tp_eval.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
