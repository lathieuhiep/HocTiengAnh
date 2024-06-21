package com.techja.hoctienganh.wordmanager;

import com.techja.hoctienganh.word.Word;

import java.util.ArrayList;
import java.util.Collections;

public class WordManager {
    private ArrayList<Word> listWord;
    private String category;

    public WordManager(String category) {
        this.category = category;
        listWord = new ArrayList<Word>();
    }

    public void addWord(String word, String vnMean) {
        Word wordObj = new Word(word, vnMean);

        if ( listWord.indexOf(wordObj) == -1 ) {
            listWord.add(wordObj);
            System.out.println("Word(" + word + "," + vnMean + " is added!");
            return;
        }

        System.err.println("Err: Word(" + word + "," + vnMean + " is existed!");
    }

    public Word[] getTwoWordRandom() {
        if (listWord.size() <=1) {
            return null;
        }

        Collections.shuffle(listWord);
        Word w1 = listWord.get(0);
        Word w2 = listWord.get(1);

        return new Word[] {w1, w2};
    }

    public void remove(String word) {
        int index = listWord.indexOf(new Word(word, null));

        if (index >= 0) {
            listWord.remove(index);
            System.out.println("Word(" + word + ") is removed !");
            return;
        }

        System.err.println("Err: Word(" + word + ") is not existed!");
    }

    public void printWord() {
        System.out.println("List words of" + category + ":\n" +  listWord);
    }

    public ArrayList<Word> getListWord() {
        return listWord;
    }
}
