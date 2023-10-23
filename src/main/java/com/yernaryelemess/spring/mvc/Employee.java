package com.yernaryelemess.spring.mvc;


import com.yernaryelemess.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size (min = 2 , message = "name must be minimum 2 symbols")
    private String name;

//    @NotNull (message = "surname must be provided")
//    @NotEmpty (message = "surname must be provided")
    @NotBlank (message = "surname must be provided")
    private String surname;

    @Min(value = 250 , message = "must be greater than 249")
    @Max(value = 1500 , message = "must be less than 1501")
    private int salary;
    private String departament;
    private Map<String , String> departments;

    private String footballClub;

    private Map<String, String> footballClubs;

    private  String[] languages;

    private Map<String , String> languagesMap;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Please use the pattern XXX-XX-XX")
    private String phoneNumber;


    @CheckEmail(value = "nazarbayev.edu.kz" , message = "must be ended with nazarbayev.edu.kz")
    private String email;


    public Employee() {
        departments = new HashMap<>();
        departments.put("IT","Informational Technologies");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");

        footballClubs = new HashMap<>();
        footballClubs.put("Real Madrid", "RMA");
        footballClubs.put("Real Sociedad", "RSO");
        footballClubs.put("Real Betis", "RBE");

        languagesMap = new HashMap<>();
        languagesMap.put("English", "ENG");
        languagesMap.put("Russian", "RUS");
        languagesMap.put("Kazakh", "KAZ");
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getFootballClubs() {
        return footballClubs;
    }

    public void setFootballClubs(Map<String, String> footballClubs) {
        this.footballClubs = footballClubs;
    }

    public String getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(String footballClub) {
        this.footballClub = footballClub;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", departament='" + departament + '\'' +
                '}';
    }
}
