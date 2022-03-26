package com.example.mentapy;

public class HomePageWidget {
    private String widgetText;
    private int widgetImg;

    public HomePageWidget(String widgetText, int widgetImg) {
        this.widgetText = widgetText;
        this.widgetImg = widgetImg;
    }

    public String getWidgetText() { return widgetText; }

    public void setWidgetText(String widgetText) { this.widgetText = widgetText; }

    public int getWidgetImg() { return widgetImg; }

    public void setWidgetImg(int widgetImg) { this.widgetImg = widgetImg; }
}
