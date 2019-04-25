package com.spartaglobal.alpari.helpers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

    public void closeReader(FileReader reader) {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
