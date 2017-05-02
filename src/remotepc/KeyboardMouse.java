/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotepc;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 *
 * @author Garvit Patel
 */
public class KeyboardMouse {

    static Robot robot;

    public static void mouse(String line) throws IOException {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            System.out.println("Error in creating robot instance");
        }
        if (line.contains(",")) {
            int start_x = (int) Float.parseFloat(line.split(",")[0]);
            int start_y = (int) Float.parseFloat(line.split(",")[1]);
            int widthx = (int) Float.parseFloat(line.split(",")[2]);
            int widthy = (int) Float.parseFloat(line.split(",")[3]);
            Dimension dem = Toolkit.getDefaultToolkit().getScreenSize();
            int scaleX = (int) (dem.getWidth() / widthx);
            int scaleY = (int) (dem.getHeight() / widthy);
            //System.out.println(dem.getWidth() + "  " + dem.getHeight());
            Point point = MouseInfo.getPointerInfo().getLocation();
            robot.mouseMove((point.x + (start_x * scaleX)), (point.y + (start_y * scaleY)));
        } else if (line.equals("leftclick")) {
            System.out.println(line);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            System.out.println("pressed");
        } else if (line.equals("rightclick")) {
            System.out.println(line);
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            System.out.println("pressed");
        } else if (line.equals("esc")) {

            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);

        } else if (line.equals("f1")) {

            robot.keyPress(KeyEvent.VK_F1);
            robot.keyRelease(KeyEvent.VK_F1);

        } else if (line.equals("f2")) {

            robot.keyPress(KeyEvent.VK_F2);
            robot.keyRelease(KeyEvent.VK_F2);

        } else if (line.equals("f3")) {

            robot.keyPress(KeyEvent.VK_F3);
            robot.keyRelease(KeyEvent.VK_F3);

        } else if (line.equals("f4")) {

            robot.keyPress(KeyEvent.VK_F4);
            robot.keyRelease(KeyEvent.VK_F4);

        } else if (line.equals("f5")) {

            robot.keyPress(KeyEvent.VK_F5);
            robot.keyRelease(KeyEvent.VK_F5);

        } else if (line.equals("f6")) {
            robot.keyPress(KeyEvent.VK_F6);
            robot.keyRelease(KeyEvent.VK_F6);
        } else if (line.equals("f7")) {

            robot.keyPress(KeyEvent.VK_F7);
            robot.keyRelease(KeyEvent.VK_F7);
        } else if (line.equals("f8")) {
            robot.keyPress(KeyEvent.VK_F8);
            robot.keyRelease(KeyEvent.VK_F8);
        } else if (line.equals("f9")) {
            robot.keyPress(KeyEvent.VK_F9);
            robot.keyRelease(KeyEvent.VK_F9);
        } else if (line.equals("f10")) {
            robot.keyPress(KeyEvent.VK_F10);
            robot.keyRelease(KeyEvent.VK_F10);
        } else if (line.equals("f11")) {
            robot.keyPress(KeyEvent.VK_F11);
            robot.keyRelease(KeyEvent.VK_F11);
        } else if (line.equals("f12")) {

            robot.keyPress(KeyEvent.VK_F12);
            robot.keyRelease(KeyEvent.VK_F12);
        } else if (line.equals("prtsc")) {
            robot.keyPress(KeyEvent.VK_PRINTSCREEN);
            robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
        } else if (line.equals("home")) {
            robot.keyPress(KeyEvent.VK_HOME);
            robot.keyRelease(KeyEvent.VK_HOME);
        } else if (line.equals("shift")) {
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_SHIFT);
        } else if (line.equals("alt")) {
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyRelease(KeyEvent.VK_ALT);
        } else if (line.equals("pgup")) {
            robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
        } else if (line.equals("pgdown")) {
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        } else if (line.equals("ins")) {
            robot.keyPress(KeyEvent.VK_INSERT);
            robot.keyRelease(KeyEvent.VK_INSERT);
        } else if (line.equals("end")) {
            robot.keyPress(KeyEvent.VK_END);
            robot.keyRelease(KeyEvent.VK_END);
        } else if (line.equals("ctrl+c")) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } else if (line.equals("ctrl+v")) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } else if (line.equals("ctrl+x")) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_X);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } else if (line.equals("ctrl+z")) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_Z);
            robot.keyRelease(KeyEvent.VK_Z);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } else if (line.equals("ctrl+a")) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } else if (line.equals("ctrl+s")) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } else if (line.equals("tab")) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        } else if (line.equals("up")) {
            robot.keyPress(KeyEvent.VK_UP);
            robot.keyRelease(KeyEvent.VK_UP);
        } else if (line.equals("del")) {
            robot.keyPress(KeyEvent.VK_DELETE);
            robot.keyRelease(KeyEvent.VK_DELETE);
        } else if (line.equals("backspace")) {
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        } else if (line.equals("space")) {
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
        } else if (line.equals("left")) {
            robot.keyPress(KeyEvent.VK_LEFT);
            robot.keyRelease(KeyEvent.VK_LEFT);
        } else if (line.equals("down")) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        } else if (line.equals("right")) {
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
        } else if (line.equals("enter")) {
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } else {
            line = line.replace("keyboard", "");
            byte[] bytes;
            bytes = line.getBytes();
            for (byte b : bytes) {
                int code = b;
                if (code == KeyEvent.VK_SPACE) {
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.keyRelease(KeyEvent.VK_SPACE);
                } else {
                    code = code - 32;
                    robot.keyPress(code);
                    robot.keyRelease(code);
                }
            }
        }
    }
}
