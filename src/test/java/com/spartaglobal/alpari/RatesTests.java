package com.spartaglobal.alpari;

import com.spartaglobal.alpari.helpers.RatesFileReader;
import org.junit.*;

import java.io.File;
import java.io.IOException;

public class RatesTests {
    private static File testFile;

    @BeforeClass
    public static void createFile(){
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

    @Test
    public void readSuccessful(){
        RatesFileReader read = new RatesFileReader("c:\\Users\\TGoddard\\IdeaProjects\\alpari\\resources\\test.txt");
        close;

    }

    @AfterClass
    public static void deleteFile(){
        testFile.delete();
    }
}
