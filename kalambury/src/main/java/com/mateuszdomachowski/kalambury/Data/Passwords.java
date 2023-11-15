package com.mateuszdomachowski.kalambury.Data;

import java.util.ArrayList;
import java.util.List;

public class Passwords {


    private List<String> easyPasswordsList = new ArrayList<>();
    private List<String> mediumPasswordsList = new ArrayList<>();
    private List<String> hardPasswordsList = new ArrayList<>();
    private List<String> easyPasswordsQueue = new ArrayList<>();
    private List<String> mediumPasswordsQueue = new ArrayList<>();
    private List<String> hardPasswordsQueue = new ArrayList<>();


    public List<String> getEasyPasswordsList(){

        this.easyPasswordsList.add("pies");
        this.easyPasswordsList.add("dom");
        this.easyPasswordsList.add("kot");
        this.easyPasswordsList.add("deska");
        this.easyPasswordsList.add("jabłko");
        this.easyPasswordsList.add("słońce");
        this.easyPasswordsList.add("butelka");
        this.easyPasswordsList.add("długopis");
        this.easyPasswordsList.add("drzewo");
        this.easyPasswordsList.add("ziemniak");

        return this.easyPasswordsList;
    }
    public List<String> getMediumPasswordsList(){

        this.mediumPasswordsList.add("Książka kucharska");
        this.mediumPasswordsList.add("Skakanka");
        this.mediumPasswordsList.add("Łyżwy");
        this.mediumPasswordsList.add("Pociąg");
        this.mediumPasswordsList.add("Koszykówka");
        this.mediumPasswordsList.add("Parasolka");
        this.mediumPasswordsList.add("Wieża Eiffla");
        this.mediumPasswordsList.add("Wulkan");
        this.mediumPasswordsList.add("Statek piracki");
        this.mediumPasswordsList.add("Panczenista");

        return this.mediumPasswordsList;

    }
    public List<String> getHardPasswordsList(){

        this.hardPasswordsList.add("Złamane serce");
        this.hardPasswordsList.add("Mikroskop");
        this.hardPasswordsList.add("Cyfrowa rewolucja");
        this.hardPasswordsList.add("Bungee jumping");
        this.hardPasswordsList.add("Kryptonim");
        this.hardPasswordsList.add("Symfonia");
        this.hardPasswordsList.add("Teoria względności");
        this.hardPasswordsList.add("Kwintesencja");
        this.hardPasswordsList.add("Hologram");
        this.hardPasswordsList.add("Mikroprocesor");

        return this.hardPasswordsList;

    }


    public void setEasyPasswordsList(List<String> easyPasswordsList) {
        this.easyPasswordsList = easyPasswordsList;
    }
}
