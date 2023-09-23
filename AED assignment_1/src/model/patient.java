/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author YAGNIK
 */
public class patient {
    private String patientid;
    private String primarydoc;
    private String lastvisit;
    private String nextapp;
    private String allergies;
    private String medication;
    private String insurancecoverage;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPrimarydoc() {
        return primarydoc;
    }

    public void setPrimarydoc(String primarydoc) {
        this.primarydoc = primarydoc;
    }

    public String getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(String lastvisit) {
        this.lastvisit = lastvisit;
    }

    public String getNextapp() {
        return nextapp;
    }

    public void setNextapp(String nextapp) {
        this.nextapp = nextapp;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getInsurancecoverage() {
        return insurancecoverage;
    }

    public void setInsurancecoverage(String insurancecoverage) {
        this.insurancecoverage = insurancecoverage;
    }
    
    
    
}
