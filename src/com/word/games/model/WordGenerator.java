/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.word.games.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.word.games.model.WordModel;
import java.util.List;


/**
 *
 * @author user
 */
public final class WordGenerator {
    
    public static List<WordModel> wordGenerator() {
        List<WordModel> words = new ArrayList<>();
        try {
     
        Scanner scan = new Scanner(new File("C:\\Java\\Latihan\\soalTempat.txt"));
            while(scan.hasNextLine()){
                String hasil = scan.nextLine();
                
                String[] data= hasil.split(",");
                WordModel word = new WordModel(data[0], data[1].trim());
                words.add(word);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return words;
    }
    
}
