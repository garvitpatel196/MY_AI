/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotepc;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garvit Patel
 */
public class Functionality {

    public static void openCDrive() {

    }

    public static void openDDrive() {

    }

    public static void openEDrive() {

    }

    public static void openFDrive() {

    }

    public static void openGDrive() {

    }

    public static void openHDrive() {

    }

    public static void openIDrive() {

    }

    public static void openJDrive() {

    }

    public static void openKDrive() {

    }
    public static void openPictures() {
        try {
            String userHomePath = System.getProperty("user.home");
            File userHome = new File(userHomePath);
            File pictures = new File(userHome, "Pictures");
            Desktop.getDesktop().open(pictures);
        } catch (IOException ex) {
            Logger.getLogger(Functionality.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void playMusic() {
        try {
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
            String userHomePath = System.getProperty("user.home");
            File userHome = new File(userHomePath);
            File videos = new File(userHome, "Videos");
            Desktop.getDesktop().open(videos);
        } catch (IOException ex) {
            Logger.getLogger(Functionality.class.getName()).log(Level.SEVERE, null, ex);
        }
                                        
    }

    public static void openControlPannel() throws IOException {
        Runtime.getRuntime().exec("cmd /c start control");
    }

    public static void openWifiSettings() throws IOException {
        Runtime.getRuntime().exec("cmd /c start ms-settings-wifi:");
    }

    public static void openNotepad() throws IOException {
        Runtime.getRuntime().exec("notepad.exe");
    }

    public static void openCmd() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c start");
    }

    public static void openWord() {

    }

    public static void openPowerPoint() {

    }

    public static void openBrowser() throws IOException {
        Runtime.getRuntime().exec("cmd /c start http://www.google.com");
    }

    public static void openGmail() throws IOException {
        Runtime.getRuntime().exec("cmd /c start http://www.gmail.com");
    }

    public static void openYoutube() throws IOException {
        Runtime.getRuntime().exec("cmd /c start https://www.youtube.com");
    }

    public static void openFacebook() throws IOException {
        Runtime.getRuntime().exec("cmd /c start http://www.facebook.com");
    }

    public static void openTwitter() throws IOException {
        Runtime.getRuntime().exec("cmd /c start https://www.twitter.com");
    }

    public static void openInstagram() throws IOException {
        Runtime.getRuntime().exec("cmd /c start https://www.instagram.com");
    }

    public static void openLinkedIn() throws IOException {
        Runtime.getRuntime().exec("cmd /c start https://www.linkedin.com");
    }

    public static void shutDown() throws IOException {
        Runtime.getRuntime().exec("cmd /c shutdown -s");

    }

    public static void sleep() throws IOException {
        Runtime.getRuntime().exec("cmd /c rundll32.exe powrprof.dll,SetSuspendState 0,1,0");
    }

    public static void lockScreen() throws IOException {
        Runtime.getRuntime().exec("cmd /c rundll32.exe user32.dll,LockWorkStation");
    }

    public static void restart() throws IOException {
        Runtime.getRuntime().exec("cmd /c shutdown -r");
    }

    public static void hibernet() {

    }

    public static void personalize() throws IOException {
        Runtime.getRuntime().exec("cmd /c start ms-settings:personalization");
    }

    public static void close() {

    }

    public static void type() {

    }

    public static void increaseVolume() {

    }

    public static void decreseVolume() {

    }

    public static void hotspotOn() {

    }

    public static void hotspotOff() {

    }

    public static void read() {

    }

    public static void takeNote() {

    }

    public static void remainder() {

    }

    public static void time() {

    }

    public static void weather() {

    }

    public static void search() {

    }

    public static void copy() {

    }

    public static void paste() {

    }

    public static void enter() {

    }

    public static void tab() {

    }

    public static void erase() {

    }

    public static void space() {

    }

    public static void increaseBrightnes() {

    }

    public static void decreaseBrightness() {

    }

    public static void pageUp() {

    }

    public static void pageDown() {

    }

    public static void next() {

    }

    public static void previous() {

    }

    public static void pause() {

    }

    public static void play() {

    }

    public static void home() {

    }

    public static void end() {

    }

    public static void takeSnapshot() {

    }

    public static void webCamera() {

    }

    public static void mouse() {

    }

    public static void keyboard() {

    }

    public static void universalRemote() {

    }

    public static void cricketScore() {

    }

    public static void recentNews() {

    }

    public static void batteryStatus() {

    }

    public static void scanPc() {

    }
}
