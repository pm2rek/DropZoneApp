package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.model.Parachute;

public interface ParachuteRepository extends JpaRepository<Parachute, Long> {

}
