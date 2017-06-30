import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class OfficialDriverA
{
    public static void main(String[] args){
        ArrayList testTimes = new ArrayList();
        testTimes.add(72.51);
        testTimes.add(70.49);
        testTimes.add(70.86);
        testTimes.add(70.40);
        
        
        ArrayList testPlaces = new ArrayList();
        testPlaces.add(3);
        testPlaces.add(6);
        testPlaces.add(5);
        testPlaces.add(2);
        
        
        int testClassChange = 74;
        
        Horse testHorse = new Horse("Swiftbrookbdancing", "1", testClassChange, testTimes, testPlaces, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes2 = new ArrayList();
        testTimes2.add(71.96);
        testTimes2.add(72.52);
        testTimes2.add(71.11);
        testTimes2.add(71.74);
        
        
        ArrayList testPlaces2 = new ArrayList();
        testPlaces2.add(1);
        testPlaces2.add(7);
        testPlaces2.add(2);
        testPlaces2.add(2);
       
        
        int testClassChange2 = 84;
        
        Horse testHorse2 = new Horse("Dots in Style", "2", testClassChange2, testTimes2, testPlaces2, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes3 = new ArrayList();
        testTimes3.add(72.61);
        testTimes3.add(69.84);
        testTimes3.add(70.49);
        testTimes3.add(69.99);
        
        
        ArrayList testPlaces3 = new ArrayList();
        testPlaces3.add(1);
        testPlaces3.add(6);
        testPlaces3.add(1);
        testPlaces3.add(5);
        
        
        int testClassChange3 = 82;
        
        Horse testHorse3 = new Horse("Cart's Zenforus", "3", testClassChange3, testTimes3, testPlaces3, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes4 = new ArrayList();
        testTimes4.add(70.23);
        testTimes4.add(71.04);
        testTimes4.add(70.31);
        testTimes4.add(71.71);
        
        
        ArrayList testPlaces4 = new ArrayList();
        testPlaces4.add(6);
        testPlaces4.add(6);
        testPlaces4.add(4);
        testPlaces4.add(1);
        
        
        int testClassChange4 = 80;
        
        Horse testHorse4 = new Horse("Breezing Rain", "4", testClassChange4, testTimes4, testPlaces4, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes5 = new ArrayList();
        testTimes5.add(71.26);
        testTimes5.add(70.49);
        testTimes5.add(72.31);
        testTimes5.add(69.65);
        
        
        ArrayList testPlaces5 = new ArrayList();
        testPlaces5.add(2);
        testPlaces5.add(6);
        testPlaces5.add(1);
        testPlaces5.add(1);
        
        
        int testClassChange5 = 86;
        
        Horse testHorse5 = new Horse("Runningatem", "5", testClassChange5, testTimes5, testPlaces5, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes6 = new ArrayList();
        testTimes6.add(71.76);
        testTimes6.add(71.14);
        testTimes6.add(72.23);
        testTimes6.add(70.856);
        
        
        ArrayList testPlaces6 = new ArrayList();
        testPlaces6.add(3);
        testPlaces6.add(3);
        testPlaces6.add(2);
        testPlaces6.add(3);
        
        
        int testClassChange6 = 84;
        
        Horse testHorse6 = new Horse("Defiant Darling", "6", testClassChange6, testTimes6, testPlaces6, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes7 = new ArrayList();
        testTimes7.add(70.86);
        testTimes7.add(74.19);
        testTimes7.add(68.85);
        testTimes7.add(70.57);
        
        
        ArrayList testPlaces7 = new ArrayList();
        testPlaces7.add(3);
        testPlaces7.add(5);
        testPlaces7.add(2);
        testPlaces7.add(6);
        
        
        int testClassChange7 = 88;
        
        Horse testHorse7 = new Horse("Breathtakingbreeze", "7", testClassChange7, testTimes7, testPlaces7, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes8 = new ArrayList();
        testTimes8.add(73.32);
        testTimes8.add(71.57);
        testTimes8.add(72.45);
        testTimes8.add(70.65);
        
        
        ArrayList testPlaces8 = new ArrayList();
        testPlaces8.add(3);
        testPlaces8.add(3);
        testPlaces8.add(6);
        testPlaces8.add(9);
        
        
        int testClassChange8 = 69;
        
        Horse testHorse8 = new Horse("Luckie Lassie", "8", testClassChange8, testTimes8, testPlaces8, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        Race testRace = new Race(8);
        
        testRace.addHorse(testHorse);
        testRace.addHorse(testHorse2);
        testRace.addHorse(testHorse3);
        testRace.addHorse(testHorse4);
        testRace.addHorse(testHorse5);
        testRace.addHorse(testHorse6);
        testRace.addHorse(testHorse7);
        testRace.addHorse(testHorse8);
        
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