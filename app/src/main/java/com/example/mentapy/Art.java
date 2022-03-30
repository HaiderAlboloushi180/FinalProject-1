package com.example.mentapy;

public class Art {
    private String artTitle;
    private int artImg;

    public Art(String artTitle, int artImg) {
        this.artTitle = artTitle;
        this.artImg = artImg;
    }

    public String getArtTitle() { return artTitle; }
    public void setArtTitle(String artTitle) { this.artTitle = artTitle; }

    public int getArtImg() { return artImg; }
    public void setArtImg(int artImg) { this.artImg = artImg; }
}
