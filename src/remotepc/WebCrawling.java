/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotepc;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class WebCrawling {

    public static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";
    static String basicSearch;
    static String firstlink;
    static String GoogleSearch;

    public String currtemp() {
        double ans = 0;
        try {
            String url = "https://www.yahoo.com/news/weather";
            Document document = Jsoup.connect(url).get();
            String question = document.select(".now span").text();
            String temp[] = question.split(" ");
            ans = Double.parseDouble(temp[0]);
            ans = (5.0 / 9.0) * (ans - 32);
            //System.out.println("Its around " + Math.round(ans) + "\u00b0 C");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Cant connect to internet");
        }
        String reply = Double.toString(Math.round(ans)) + " degree centigrate";
        return reply;
    }

    public static void webCrawling(String searchTerm) throws IOException, InstantiationException {
        int num;
        System.out.println("Search Term:"+searchTerm);
        GoogleSearch = searchTerm;

        //System.out.println("Please enter the number of results. Example: 5 10 20");
        num = 1;//scanner.nextInt();
        String searchURL = GOOGLE_SEARCH_URL + "?q=" + searchTerm + "&num=" + num;
        Document doc = Jsoup.connect(searchURL).userAgent("Mozilla/5.0").get();
        Elements results = doc.select("h3.r > a");
        Elements results1 = doc.select("span.st");
        results.stream().forEach((Element result) -> {
            final String linkHref = result.attr("href");
            firstlink = linkHref.substring(7, linkHref.indexOf("&"));
        });
        results1.stream().map((result) -> result.text()).map((linkText) -> {
            
            GUI.jSearchResult.setText(linkText);
            basicSearch = linkText;
            return linkText;
        }).forEach((linkText) -> {
            System.out.println("Main out put Text::" + linkText);
        });
        TextToSpeech.speak(basicSearch);
    }
}
