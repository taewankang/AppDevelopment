package com.example.app;

public class Dictionary {
    private String id;
    private String English;
    private String korean;
    public Dictionary(String id, String english, String korean) {
        this.id = id;
        English = english;
        this.korean = korean;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getKorean() {
        return korean;
    }

    public void setKorean(String korean) {
        this.korean = korean;
    }
}
