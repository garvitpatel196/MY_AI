/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotepc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Garvit Patel
 */
public class ExtractMeaning {

    private static TreeMap m1;
 
    public static String extractMeaning(String ques) throws IOException {
        
        String output = removeStopWords(ques);
        System.out.println(output);
        m1 = new TreeMap();
        m1.put("open c drive", "open c drive");
        m1.put("open d drive", "open d drive");
        m1.put("open notepad", "open notepad");
        
        return mappingResult(output);
    }

    public static String removeStopWords(String ques) throws IOException {
        String[] words = ques.split(" ");
        String line;
        //remove stop words
        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].replaceAll("[^\\w]", "");
            File file = new File("C:\\Users\\Garvit Patel\\Documents\\NetBeansProjects\\RemotePc\\src\\remotepc\\Stopwords.txt");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                while ((line = reader.readLine()) != null) {

                    if (words[i].equalsIgnoreCase(line)) {
                        words[i] = "";
                    }

                }

            }
        }
        String output = "";
        for (String word : words) {
            output += word + " ";
        }
        output = output.trim();
        return output;
    }

    public static String mappingResult(String output) {
        String action=null;
        List<Integer> percentage_match = new ArrayList<Integer>();
        int matching = 0;
        String temp = m1.keySet().toString();
        temp = temp.replace("[", "");
        temp = temp.replace("]", "");
        String keys[] = temp.split(",");
        for (String keys1 : keys) {
            ArrayList<String> qus_keywords = new ArrayList<String>();
            int cnt = 0;
            keys1 = keys1.trim();
            String qus_kb2 = keys1;
            String[] qus_kb3 = qus_kb2.split(" ");
            Collections.addAll(qus_keywords, qus_kb3);
            String out1[] = output.split(" ");
            for (int k = 0; k < out1.length; k++) {
                if (qus_keywords.contains(out1[k].toLowerCase())) {
                    cnt++;
                }

            }

            matching = (int) ((cnt / (float) out1.length) * 100);

            percentage_match.add((int) matching);
        }
        int max = Collections.max(percentage_match);
        int index = percentage_match.indexOf(max);
        if (max == 0) {
            
        }else {
            System.out.println(index);
            for(int j=0;j<keys.length;j++)
            {
                
                if (j == index) {
                    
                    action=m1.get(keys[j]).toString();
                    
                }
            }
        }
        return action;

    }

}
