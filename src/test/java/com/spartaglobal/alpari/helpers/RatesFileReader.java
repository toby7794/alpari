package com.spartaglobal.alpari.helpers;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesFileReader {

    private FileReader ratesFile;

    public RatesFileReader(String filelocation){
        try{
            ratesFile = new FileReader(filelocation);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public FileReader getRatesFile(){
        return ratesFile;
    }




}
