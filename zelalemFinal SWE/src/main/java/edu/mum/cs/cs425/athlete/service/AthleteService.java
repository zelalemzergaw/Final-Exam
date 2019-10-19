package edu.mum.cs.cs425.athlete.service;

import edu.mum.cs.cs425.athlete.model.Athlete;

import java.util.List;

public interface AthleteService {
    List<Athlete> getAllAthletes();
    Athlete saveAthlete(Athlete athlete);
    Athlete getAthleteById(Long athleteId);


}
