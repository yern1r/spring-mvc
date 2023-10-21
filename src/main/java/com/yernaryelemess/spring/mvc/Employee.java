package com.yernaryelemess.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String departament;
    private Map<String , String> departments;

    private String footballClub;

    private Map<String, String> footballClubs;

    private  String[] languages;

    private Map<String , String> languagesMap;

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
