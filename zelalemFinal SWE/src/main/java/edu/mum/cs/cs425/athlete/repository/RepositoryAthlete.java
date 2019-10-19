package edu.mum.cs.cs425.athlete.repository;

import edu.mum.cs.cs425.athlete.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAthlete extends JpaRepository<Athlete,Long> {
}
