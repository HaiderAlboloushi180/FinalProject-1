package com.example.mentapy;

public class QuizModel {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int option1Sev;
    private int option2Sev;
    private int option3Sev;
    private int option4Sev;

    public QuizModel(String question, String option1, String option2, String option3, String option4, int option1Sev, int option2Sev, int option3Sev, int option4Sev) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option1Sev = option1Sev;
        this.option2Sev = option2Sev;
        this.option3Sev = option3Sev;
        this.option4Sev = option4Sev;
    }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getOption1() { return option1; }
    public void setOption1(String option1) { this.option1 = option1; }

    public String getOption2() { return option2; }
    public void setOption2(String option2) { this.option2 = option2; }

    public String getOption3() { return option3; }
    public void setOption3(String option3) { this.option3 = option3; }

    public String getOption4() { return option4; }
    public void setOption4(String option4) { this.option4 = option4; }

    public int getOption1Sev() { return option1Sev; }
    public void setOption1Sev(int option1Sev) { this.option1Sev = option1Sev; }

    public int getOption2Sev() { return option2Sev; }
    public void setOption2Sev(int option2Sev) { this.option2Sev = option2Sev; }

    public int getOption3Sev() { return option3Sev; }
    public void setOption3Sev(int option3Sev) { this.option3Sev = option3Sev; }

    public int getOption4Sev() { return option4Sev; }
    public void setOption4Sev(int option4Sev) { this.option4Sev = option4Sev; }
}
