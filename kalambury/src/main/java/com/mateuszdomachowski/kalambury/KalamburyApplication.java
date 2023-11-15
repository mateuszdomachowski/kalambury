package com.mateuszdomachowski.kalambury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class KalamburyApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalamburyApplication.class, args);


		String[] easyPasswords = {"pies", "dom", "kot", "deska", "auto", "jabłko", "słońce", "butelka", "długopis", "drzewo"};
		String[] mediumPasswords = {"Książka kucharska", "Skakanka", "Łyżwy", "Pociąg", "Koszykówka", "Parasolka", "Wieża Eiffla", "Wulkan", "Statek piracki", "Panczenista"};
		String[] hardPasswords = {"Złamane serce", "Mikroskop", "Cyfrowa rewolucja", "Bungee jumping", "Kryptonim", "Symfonia", "Teoria względności", "Kwintesencja", "Hologram", "Mikroprocesor"};

		Random random = new Random();

		System.out.println(easyPasswords[random.nextInt(easyPasswords.length)]);
	}




}
