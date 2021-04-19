/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingstrings;

/**
 *
 * @author cjt1496
 */
import java.util.Scanner;

public class CompareStrings {
    
    
    
    Scanner input = new Scanner(System.in);
    
    String firstWord;
    String secondWord;
    int compareWords;
    
    public CompareStrings(String firstWord, String secondWord, int compareWords) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.compareWords = compareWords;
    }
    
    public CompareStrings(){
        
    }
    
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public int getCompareWords() {
        return compareWords;
    }

    public void setCompareWords(int compareWords) {
        this.compareWords = compareWords;
    }


    
    public void stringComparison(){
        System.out.println("Enter the first string to compare...");
        firstWord = input.nextLine();
        System.out.println("Enter the second string to compare...");
        secondWord = input.nextLine();
        
        compareWords = firstWord.compareTo(secondWord);
        
        System.out.printf("The comparison of %s and %s is %d %n", firstWord, secondWord, compareWords);
        
    }
    
}
