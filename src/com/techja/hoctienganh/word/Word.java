package com.techja.hoctienganh.word;

public class Word {
    private String word, vnMean;

    public Word(String word, String vnMean) {
        this.word = word;
        this.vnMean = vnMean;
    }

    public String getWord() {
        return word;
    }

    public String getVnMean() {
        return vnMean;
    }

    @Override
    public String toString() {
        return word + ": " + vnMean;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Word) {
            return ((Word) obj).word.equals(word);
        }

        return super.equals(obj);
    }
}
