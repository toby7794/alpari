package com.spartaglobal.alpari;

import com.spartaglobal.alpari.helpers.RatesFileReader;
import org.junit.*;

import java.io.File;
import java.io.IOException;

public class RatesTests {
    private File testFile;

    @Before
    public void createFile(){
        testFile = new File("c:\\Users\\TGoddard\\IdeaProjects\\alpari\\resources\\test.txt");
        try { testFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isEmptyFileInResources(){
        Assert.assertEquals(testFile.exists(), true);
    }

    /*@Test
    public void readSuccessful(){
        new RatesFileReader("c:\\Users\\TGoddard\\IdeaProjects\\alpari\\resources\\test.txt");
    }*/

    @After
    public void deleteFile(){
        testFile.delete();
    }
}
