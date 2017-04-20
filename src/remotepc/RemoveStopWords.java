/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotepc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garvit Patel
 */
public class RemoveStopWords {

    private static final String FILENAME = "C:\\Users\\Garvit Patel\\Documents\\My_AI\\src\\my_ai\\english";

    public String removeStopWords(String input) throws Exception {
        input=input.toLowerCase();
        String inputWordsArray[] = input.split(" ");
        BufferedReader br = null;
        FileReader fr = null;
        List<String> stopWords = new ArrayList<>();
        List<String> inputWithoutStopWords = new ArrayList<>();
        
        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                stopWords.add(sCurrentLine);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            String ans="";
            for (String inputWordsArray1 : inputWordsArray) {
                if (stopWords.contains(inputWordsArray1)) {
                } else {
                    inputWithoutStopWords.add(inputWordsArray1);
                    ans+=inputWordsArray1+" ";
                }
            }
            ans=ans.trim();
            //ans=stem.stem(ans);
            //System.out.println(ans);
            try {

                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException ex) {
                System.out.println(ex);
            }
            return ans;
        }
        
    }
}
