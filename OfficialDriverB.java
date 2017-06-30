import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class OfficialDriverB
{
    public static void main(String[] args){
        ArrayList testTimes = new ArrayList();
        testTimes.add(71.62);
        testTimes.add(69.88);
        testTimes.add(68.83);
        testTimes.add(68.92);
        
        
        ArrayList testPlaces = new ArrayList();
        testPlaces.add(4);
        testPlaces.add(2);
        testPlaces.add(6);
        testPlaces.add(12);
        
        
        int testClassChange = 71;
        
        Horse testHorse = new Horse("Toquinho", "1", testClassChange, testTimes, testPlaces, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes2 = new ArrayList();
        testTimes2.add(70.92);
        testTimes2.add(72.76);
        testTimes2.add(70.43);
        testTimes2.add(71.65);
        
        
        ArrayList testPlaces2 = new ArrayList();
        testPlaces2.add(7);
        testPlaces2.add(7);
        testPlaces2.add(5);
        testPlaces2.add(4);
       
        
        int testClassChange2 = 76;
        
        Horse testHorse2 = new Horse("Sweepy Bluff", "2", testClassChange2, testTimes2, testPlaces2, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes3 = new ArrayList();
        testTimes3.add(71.65);
        testTimes3.add(71.49);
        testTimes3.add(70.61);
        testTimes3.add(71.66);
        
        
        ArrayList testPlaces3 = new ArrayList();
        testPlaces3.add(3);
        testPlaces3.add(2);
        testPlaces3.add(1);
        testPlaces3.add(5);
        
        
        int testClassChange3 = 77;
        
        Horse testHorse3 = new Horse("Canadian Lynx", "3", testClassChange3, testTimes3, testPlaces3, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes4 = new ArrayList();
        testTimes4.add(71.54);
        testTimes4.add(70.18);
        testTimes4.add(69.22);
        testTimes4.add(69.30);
        
        
        ArrayList testPlaces4 = new ArrayList();
        testPlaces4.add(4);
        testPlaces4.add(5);
        testPlaces4.add(4);
        testPlaces4.add(6);
        
        
        int testClassChange4 = 66;
        
        Horse testHorse4 = new Horse("Aswaaq", "4", testClassChange4, testTimes4, testPlaces4, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes5 = new ArrayList();
        testTimes5.add(72.17);
        testTimes5.add(72.10);
        testTimes5.add(71.02);
        testTimes5.add(70.18);
        
        
        ArrayList testPlaces5 = new ArrayList();
        testPlaces5.add(3);
        testPlaces5.add(1);
        testPlaces5.add(6);
        testPlaces5.add(8);
        
        
        int testClassChange5 = 69;
        
        Horse testHorse5 = new Horse("Double Jump", "5", testClassChange5, testTimes5, testPlaces5, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes6 = new ArrayList();
        testTimes6.add(71.65);
        testTimes6.add(71.22);
        testTimes6.add(71.35);
        testTimes6.add(71.77);
        
        
        ArrayList testPlaces6 = new ArrayList();
        testPlaces6.add(1);
        testPlaces6.add(2);
        testPlaces6.add(3);
        testPlaces6.add(4);
        
        
        int testClassChange6 = 69;
        
        Horse testHorse6 = new Horse("Golden Bull", "6", testClassChange6, testTimes6, testPlaces6, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        Race testRace = new Race(6);
        
        testRace.addHorse(testHorse);
        testRace.addHorse(testHorse2);
        testRace.addHorse(testHorse3);
        testRace.addHorse(testHorse4);
        testRace.addHorse(testHorse5);
        testRace.addHorse(testHorse6);
        
        System.out.println("Now Printing Test Race Predicted Outcome");
        System.out.println();
        testRace.assignPoints();
        testRace.sortByPoints();
        for(int i = 0; i<testRace.getHorseList().size(); i++){
            System.out.println(testRace.getHorseList().get(i));
            System.out.println();
        }
        
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics G = panel.getGraphics();
        
        for(int i = 0; i<testRace.getHorseList().size(); i++){
            G.setColor(Color.BLACK);
            double points = testRace.getHorseList().get(i).getPoints();
            double width = (points/55);
            G.drawString(""+(testRace.getHorseList().get(i).getNumber()), 10, 50*(i+1));
            G.fillRect(50, (50*(i+1))-20, (int)(400*width), 40);
        }
    }
}