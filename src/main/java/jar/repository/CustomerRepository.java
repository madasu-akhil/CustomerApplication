package jar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jar.model.Customer;

@Repository
public interface CustomerRepository extends  JpaRepository<Customer, Long> {

	Optional<Customer> findById(Long id);

}
