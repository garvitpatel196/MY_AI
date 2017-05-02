/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotepc;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Functionality {

    Keyboard keyboard = new Keyboard();

    public static void openCDrive() throws IOException, InstantiationException {

        TextToSpeech.speak("Ok opening C drive");
        Runtime.getRuntime().exec("cmd /c start C:");

    }

    public static void openDDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening D drive");
        Runtime.getRuntime().exec("cmd /c start D:");
    }

    public static void openEDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening E drive");
        Runtime.getRuntime().exec("cmd /c start E:");
    }

    public static void openFDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening F drive");
        Runtime.getRuntime().exec("cmd /c start F:");
    }

    public static void openGDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening G drive");
        Runtime.getRuntime().exec("cmd /c start G:");
    }

    public static void openHDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening H drive");
        Runtime.getRuntime().exec("cmd /c start H:");
    }

    public static void openIDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening I drive");
        Runtime.getRuntime().exec("cmd /c start I:");
    }

    public static void openJDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening J drive");
        Runtime.getRuntime().exec("cmd /c start J:");
    }

    public static void openKDrive() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening K drive");
        Runtime.getRuntime().exec("cmd /c start K:");
    }

    public static void openPictures() throws InstantiationException {
        try {
            TextToSpeech.speak("Ok opening Pictures folder");
            String userHomePath = System.getProperty("user.home");
            File userHome = new File(userHomePath);
            File pictures = new File(userHome, "Pictures");
            Desktop.getDesktop().open(pictures);
        } catch (IOException ex) {
            Logger.getLogger(Functionality.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void playMusic() throws InstantiationException {
        try {
            TextToSpeech.speak("Ok opening Music folder");
            String userHomePath = System.getProperty("user.home");
            File userHome = new File(userHomePath);
            File music = new File(userHome, "Music");
            Desktop.getDesktop().open(music);
        } catch (IOException ex) {
            Logger.getLogger(Functionality.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void playVideos() {

        try {
            TextToSpeech.speak("Ok opening Videos folder");
            String userHomePath = System.getProperty("user.home");
            File userHome = new File(userHomePath);
            File videos = new File(userHome, "Videos");
            Desktop.getDesktop().open(videos);
        } catch (IOException | InstantiationException ex) {
            Logger.getLogger(Functionality.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void openControlPannel() throws IOException {
        try {
            TextToSpeech.speak("Ok opening control pannel");
        } catch (InstantiationException ex) {
            Logger.getLogger(Functionality.class.getName()).log(Level.SEVERE, null, ex);
        }
        Runtime.getRuntime().exec("cmd /c start control");
    }

    public static void openWifiSettings() throws IOException {
        try {
            TextToSpeech.speak("Ok opening wifi setting");
        } catch (InstantiationException ex) {
            Logger.getLogger(Functionality.class.getName()).log(Level.SEVERE, null, ex);
        }
        Runtime.getRuntime().exec("cmd /c start ms-settings-wifi:");
    }

    public static void openNotepad() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening Notepad");
        Runtime.getRuntime().exec("notepad.exe");
    }

    public static void openCmd() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening cmd");
        Runtime.getRuntime().exec("cmd.exe /c start");
    }

    public static void openWord() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening word");
        Runtime.getRuntime().exec("cmd /c start Winword.exe");
    }

    public static void openPowerPoint() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening power point");
        Runtime.getRuntime().exec("cmd /c start POWERPNT.exe");
    }

    public static void openBrowser() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening browser");
        Runtime.getRuntime().exec("cmd /c start http://www.google.com");
    }

    public static void openGmail() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening Gmail account");
        Runtime.getRuntime().exec("cmd /c start http://www.gmail.com");
    }

    public static void openYoutube() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening youtube");
        Runtime.getRuntime().exec("cmd /c start https://www.youtube.com");
    }

    public static void openFacebook() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening facebook");
        Runtime.getRuntime().exec("cmd /c start http://www.facebook.com");
    }

    public static void openTwitter() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening twitter");
        Runtime.getRuntime().exec("cmd /c start https://www.twitter.com");
    }

    public static void openInstagram() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening instagram");
        Runtime.getRuntime().exec("cmd /c start https://www.instagram.com");
    }

    public static void openLinkedIn() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening linkedin");
        Runtime.getRuntime().exec("cmd /c start https://www.linkedin.com");
    }

    public static void shutDown() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok shutting down");
        Runtime.getRuntime().exec("cmd /c shutdown -s");
    }

    public static void sleep() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok sleep mode on");
        Runtime.getRuntime().exec("cmd /c rundll32.exe powrprof.dll,SetSuspendState 0,1,0");
    }

    public static void lockScreen() throws IOException, InstantiationException {
        TextToSpeech.speak("Ohkay locking screen");
        Runtime.getRuntime().exec("cmd /c rundll32.exe user32.dll,LockWorkStation");
    }

    public static void restart() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok restarting");
        Runtime.getRuntime().exec("cmd /c shutdown -r");
    }

    public static void hibernet() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok hiberneting");
        Runtime.getRuntime().exec("cmd /c shutdown -h");
    }

    public static void personalize() throws IOException, InstantiationException {
        TextToSpeech.speak("Ok opening personlize settings");
        Runtime.getRuntime().exec("cmd /c start ms-settings:personalization");
    }

    public static void close() throws AWTException, InstantiationException {
        TextToSpeech.speak("Ok Closing");
        Keyboard.close();
    }

    public static void type(String Command) throws AWTException {
        switch (Command) {
            case "enter":
            case "next line":
                Keyboard.enter();
                break;
            case "tab":
                Keyboard.tab();
                break;
            case "space":
                Keyboard.space();
                break;
            case "bold":
                Keyboard.bold();
                break;
            case "italic":
                Keyboard.italic();
                break;
            case "underline":
                Keyboard.underline();
                break;
            default:
                Keyboard.type(Command);
                break;
        }
    }

    public static void hotspotOn() throws IOException {
        Runtime.getRuntime().exec("cmd /c start netsh wlan start hostednetwork");
    }

    public static void hotspotOff() throws IOException {
        Runtime.getRuntime().exec("cmd /c start netsh wlan stop hostednetwork");
    }

    public static void read() {
        try {
            Keyboard.read();
        } catch (InstantiationException | AWTException | UnsupportedFlavorException | IOException ex) {
            System.out.println(ex);
        }
    }

    public static void pauseReading() {
        try {
            TextToSpeech.Pause();
        } catch (InstantiationException | InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public static void resumeReading() {
        TextToSpeech.Resume();
    }

    public static void stop() {
        TextToSpeech.Stop();
    }

    public static void takeNote() throws IOException {
        Runtime.getRuntime().exec("cmd /c start StikyNot.exe");
    }

    public static void remainder(String Command) throws IOException {
//        String com="powershell [Reflection.Assembly]::LoadWithPartialName(\"\"\"System.Windows.Forms\"\"\");[Windows.Forms.MessageBox]::show(\"\"\""+Command+"\"\"\", \"\"\"My PopUp Message Box\"\"\")";
//        Runtime.getRuntime().exec("cmd /c "+com);
//        

    }

    public static void time() throws IOException, InstantiationException {
        java.util.Date date = new java.util.Date();
        System.out.println(date);
        TextToSpeech.speak(date.toString());
    }

    public static void weather() throws IOException, ScriptException {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        String script="alert('hello world')";
        engine.eval(script);
    }

    public static void search(String result) throws IOException, InstantiationException {
        WebCrawling.webCrawling(result);
    }

    public static void next() {

    }

    public static void previous() {

    }

    public static void pause() {

    }

    public static void play() {

    }

    public static void takeSnapshot() throws AWTException {
        Keyboard.snapShot();
    }

    public static void universalRemote() {

    }

    public static void cricketScore() {

    }

    public static void recentNews() throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        Elements newsHeadlines = doc.select("#mp-itn b a");
        System.out.println(newsHeadlines);
    }

    public static void batteryStatus() {

    }

    public static void scanPc() {

    }
}
