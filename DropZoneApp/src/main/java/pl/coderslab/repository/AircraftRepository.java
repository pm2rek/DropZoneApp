package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.model.Aircraft;

public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

}
