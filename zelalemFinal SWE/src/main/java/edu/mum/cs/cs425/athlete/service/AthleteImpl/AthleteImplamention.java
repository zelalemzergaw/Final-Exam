package edu.mum.cs.cs425.athlete.service.AthleteImpl;

import edu.mum.cs.cs425.athlete.model.Athlete;
import edu.mum.cs.cs425.athlete.repository.RepositoryAthlete;
import edu.mum.cs.cs425.athlete.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AthleteImplamention implements AthleteService {

    @Autowired
    private RepositoryAthlete repositoryAthlete;

    @Override
    public List<Athlete> getAllAthletes() {
        return repositoryAthlete.findAll();
    }

    @Override
    public Athlete saveAthlete(Athlete athlete) {
        return repositoryAthlete.save(athlete);
    }

    @Override
    public Athlete getAthleteById(Long customerId) {
        return repositoryAthlete.findById(customerId).orElse(null);
    }


}
