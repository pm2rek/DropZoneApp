package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.model.Flight;

public interface LoadRepository extends JpaRepository<Flight, Long> {

}
