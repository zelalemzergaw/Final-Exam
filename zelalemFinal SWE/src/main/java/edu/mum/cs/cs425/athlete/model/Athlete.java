package edu.mum.cs.cs425.athlete.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "athletes")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long athleteId;

    @NotBlank(message = "athlete number is required")
    private String fullName;


    @NotBlank(message = "name is required")
    private String emailAddress;


    @NotBlank(message = "phone number is required ")
    private String phoneNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

    private LocalDate dateOfBirth;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfRegistration;

    @NotNull(message = "model number is required")
    @Digits(integer = 9, fraction = 0, message = "* SSN number must be numeric; and a positive, integral value")
    private Integer totalNumberOfModelsWon;

    @NotNull(message = "* SSN Number is required")
    @Digits(integer = 9, fraction = 0, message = "* SSN number must be numeric; and a positive, integral value")
    @Column(name = "ssnNumber", nullable = false, unique = true)
    private Long ssn;

    @Digits(integer = 9, fraction = 2, message = "* SSN number must be numeric; and a positive, integral value")
    @NotNull(message = "salary req")
    private Double monthlySalary;

    public Athlete() {
    }

    public Athlete( String fullName, String emailAddress, String phoneNumber, LocalDate dateOfBirth, LocalDate dateOfRegistration,   Integer totalNumberOfModelsWon,  Long ssn,  Double monthlySalary) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.dateOfRegistration = dateOfRegistration;
        this.totalNumberOfModelsWon = totalNumberOfModelsWon;
        this.ssn = ssn;
        this.monthlySalary = monthlySalary;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Integer getTotalNumberOfModelsWon() {
        return totalNumberOfModelsWon;
    }

    public void setTotalNumberOfModelsWon(Integer totalNumberOfModelsWon) {
        this.totalNumberOfModelsWon = totalNumberOfModelsWon;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Long getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(Long athleteId) {
        this.athleteId = athleteId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return emailAddress;
    }

    public void setName(String name) {
        this.emailAddress = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "athleteId=" + athleteId +
                ", fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfRegistration=" + dateOfRegistration +
                ", totalNumberOfModelsWon=" + totalNumberOfModelsWon +
                ", ssn=" + ssn +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
