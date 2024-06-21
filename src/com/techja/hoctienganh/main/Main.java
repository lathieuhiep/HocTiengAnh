package com.techja.hoctienganh.main;

import com.techja.hoctienganh.word.Word;
import com.techja.hoctienganh.wordmanager.WordManager;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager("Sport");

        wordManager.addWord("Sport", "Thể thao");
        wordManager.addWord("Soccer", "Bóng đá");
        wordManager.addWord("Football", "Bóng đá");
        wordManager.addWord("Leg", "chân");
        wordManager.addWord("Defender", "Hậu Vệ");

        Word[] words = wordManager.getTwoWordRandom();
//        System.out.println("Two words: " + Arrays.toString(words));
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int index = -1;

        while (words != null && wordManager.getListWord().size() > 0) {
            index ++;
            System.out.println(index + "." + words[0].getWord() + " is: ");
            String answer = sc.nextLine();

            int tmpScore = 0;
            if (answer.equalsIgnoreCase(words[0].getVnMean())) {
                System.out.println("=> Correct!");
                tmpScore ++;
                wordManager.remove(words[0].getWord());
            } else {
                System.err.println("=> Wrong answer!");
            }

            index ++;
            System.out.println(index + "." + words[1].getWord() + " is: ");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase(words[1].getVnMean())) {
                System.out.println("=> Correct!");
                tmpScore ++;
                wordManager.remove(words[1].getWord());
            } else {
                System.err.println("=> Wrong answer!");
            }

            if (tmpScore == 0) {
                break;
            }

            score += tmpScore;
            System.out.println("Good job, Next!...");
            words = wordManager.getTwoWordRandom();
        }

        System.out.println("You got " + score + ": points!");
    }
}