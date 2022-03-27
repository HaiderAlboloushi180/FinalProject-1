package com.example.mentapy;

import java.io.Serializable;

public class MentalDisorder implements Serializable {
    private String disorderName;
    private String disorderDesc;
    private String disorderSymptoms;
    private String disorderTips;
    private int disorderImg;

    public MentalDisorder(String disorderName, String disorderDesc, String disorderSymptoms, String disorderTips, int disorderImg) {
        this.disorderName = disorderName;
        this.disorderDesc = disorderDesc;
        this.disorderSymptoms = disorderSymptoms;
        this.disorderTips = disorderTips;
        this.disorderImg = disorderImg;
    }

    public String getDisorderName() { return disorderName; }
    public void setDisorderName(String disorderName) { this.disorderName = disorderName; }

    public String getDisorderDesc() { return disorderDesc; }
    public void setDisorderDesc(String disorderDesc) { this.disorderDesc = disorderDesc; }

    public String getDisorderSymptoms() { return disorderSymptoms; }
    public void setDisorderSymptoms(String disorderSymptoms) { this.disorderSymptoms = disorderSymptoms; }

    public String getDisorderTips() { return disorderTips; }
    public void setDisorderTips(String disorderTips) { this.disorderTips = disorderTips; }

    public int getDisorderImg() { return disorderImg; }
    public void setDisorderImg(int disorderImg) { this.disorderImg = disorderImg; }
}
