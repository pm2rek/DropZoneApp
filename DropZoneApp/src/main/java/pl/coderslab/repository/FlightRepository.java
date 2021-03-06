package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
