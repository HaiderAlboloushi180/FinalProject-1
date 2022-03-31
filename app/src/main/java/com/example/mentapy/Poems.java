package com.example.mentapy;

public class Poems {
    private String poemName;
    private int poemImg;

    public Poems(String poemName, int poemImg) {
        this.poemName = poemName;
        this.poemImg = poemImg;
    }

    public String getPoemName() { return poemName; }
    public void setPoemName(String poemName) { this.poemName = poemName; }

    public int getPoemImg() { return poemImg; }
    public void setPoemImg(int poemImg) { this.poemImg = poemImg; }
}
