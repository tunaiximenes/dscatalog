package br.com.tmsolutions.dscatalog.repositories;

import br.com.tmsolutions.dscatalog.entities.Category;
import br.com.tmsolutions.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
