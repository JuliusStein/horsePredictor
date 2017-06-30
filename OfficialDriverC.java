import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class OfficialDriverC
{
    public static void main(String[] args){
        int raceDistance = 8;
        Race r = new Race(8);
        //adjustTime(time, dist, RaceDist)
        
        
        ArrayList testTimes = new ArrayList();
        testTimes.add(r.adjustTime(98.84,8));
        testTimes.add(r.adjustTime(112.56,9));
        testTimes.add(r.adjustTime(105.33,8.5));
        testTimes.add(r.adjustTime(107.08,8.5));
        
        
        ArrayList testPlaces = new ArrayList();
        testPlaces.add(7);
        testPlaces.add(6);
        testPlaces.add(5);
        testPlaces.add(3);
        
        
        int testClassChange = 79;
        
        Horse testHorse = new Horse("Bosco Rules", "1", testClassChange, testTimes, testPlaces, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes2 = new ArrayList();
        testTimes2.add(r.adjustTime(97.95,8));
        testTimes2.add(r.adjustTime(96.57,8));
        testTimes2.add(r.adjustTime(95.73,8));
        testTimes2.add(r.adjustTime(103.87,8));
        
        
        ArrayList testPlaces2 = new ArrayList();
        testPlaces2.add(1);
        testPlaces2.add(5);
        testPlaces2.add(3);
        testPlaces2.add(3);
       
        
        int testClassChange2 = 80;
        
        Horse testHorse2 = new Horse("G L Kiwi", "2", testClassChange2, testTimes2, testPlaces2, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes3 = new ArrayList();
        testTimes3.add(r.adjustTime(102.47,8.5));
        testTimes3.add(r.adjustTime(105.87,8.5));
        testTimes3.add(r.adjustTime(113.63,9));
        testTimes3.add(r.adjustTime(101.59,8.5));
        
        
        ArrayList testPlaces3 = new ArrayList();
        testPlaces3.add(6);
        testPlaces3.add(3);
        testPlaces3.add(1);
        testPlaces3.add(4);
        
        
        int testClassChange3 = 86;
        
        Horse testHorse3 = new Horse("Fast Promises", "3", testClassChange3, testTimes3, testPlaces3, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes4 = new ArrayList();
        testTimes4.add(r.adjustTime(114.77,9));
        testTimes4.add(r.adjustTime(97.11,8));
        testTimes4.add(r.adjustTime(99.31,8));
        testTimes4.add(r.adjustTime(76.61,6.5));
        
        
        ArrayList testPlaces4 = new ArrayList();
        testPlaces4.add(3);
        testPlaces4.add(2);
        testPlaces4.add(4);
        testPlaces4.add(7);
        
        
        int testClassChange4 = 82;
        
        Horse testHorse4 = new Horse("Miles and Miles", "4", testClassChange4, testTimes4, testPlaces4, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes5 = new ArrayList();
        testTimes5.add(r.adjustTime(84.95,7));
        testTimes5.add(r.adjustTime(112.36,9));
        testTimes5.add(r.adjustTime(98.92,8));
        testTimes5.add(r.adjustTime(100.05,8));
        
        
        ArrayList testPlaces5 = new ArrayList();
        testPlaces5.add(5);
        testPlaces5.add(7);
        testPlaces5.add(3);
        testPlaces5.add(4);
        
        
        int testClassChange5 = 62;
        
        Horse testHorse5 = new Horse("Star Vector", "5", testClassChange5, testTimes5, testPlaces5, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes6 = new ArrayList();
        testTimes6.add(r.adjustTime(97.11,8));
        testTimes6.add(r.adjustTime(96.75,8));
        testTimes6.add(r.adjustTime(106.72,8.5));
        testTimes6.add(r.adjustTime(100.69,8));
        
        
        ArrayList testPlaces6 = new ArrayList();
        testPlaces6.add(6);
        testPlaces6.add(6);
        testPlaces6.add(1);
        testPlaces6.add(5);
        
        
        int testClassChange6 = 73;
        
        Horse testHorse6 = new Horse("Pedestal", "6", testClassChange6, testTimes6, testPlaces6, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes7 = new ArrayList();
        testTimes7.add(r.adjustTime(97.33,8));
        testTimes7.add(r.adjustTime(106.48,8.5));
        testTimes7.add(r.adjustTime(106.11,8.5));
        testTimes7.add(r.adjustTime(106.61,8.5));
        
        
        ArrayList testPlaces7 = new ArrayList();
        testPlaces7.add(6);
        testPlaces7.add(1);
        testPlaces7.add(2);
        testPlaces7.add(3);
        
        
        int testClassChange7 = 79;
        
        Horse testHorse7 = new Horse("Cruzatte", "7", testClassChange7, testTimes7, testPlaces7, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        ArrayList testTimes8 = new ArrayList();
        testTimes8.add(r.adjustTime(97.11,8));
        testTimes8.add(r.adjustTime(84.95,7));
        testTimes8.add(r.adjustTime(112.51,9));
        testTimes8.add(r.adjustTime(114.28,9));
        
        
        ArrayList testPlaces8 = new ArrayList();
        testPlaces8.add(3);
        testPlaces8.add(4);
        testPlaces8.add(6);
        testPlaces8.add(4);
        
        
        int testClassChange8 = 77;
        
        Horse testHorse8 = new Horse("Judith's Lake", "8", testClassChange8, testTimes8, testPlaces8, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        //Race testRace = new Race(8);
        
        r.addHorse(testHorse);
        r.addHorse(testHorse2);
        r.addHorse(testHorse3);
        r.addHorse(testHorse4);
        r.addHorse(testHorse5);
        r.addHorse(testHorse6);
        r.addHorse(testHorse7);
        r.addHorse(testHorse8);
        
        System.out.println("Now Printing Test Race Predicted Outcome");
        System.out.println();
        r.assignPoints();
        r.sortByPoints();
        
        for(int i = 0; i<r.getHorseList().size(); i++){
            System.out.println(r.getHorseList().get(i));
            System.out.println();
        }
        
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics G = panel.getGraphics();
        
        for(int i = 0; i<r.getHorseList().size(); i++){
            G.setColor(Color.BLACK);
            double points = r.getHorseList().get(i).getPoints();
            double width = (points/55);
            G.drawString(""+(r.getHorseList().get(i).getNumber()), 10, 50*(i+1));
            G.fillRect(50, (50*(i+1))-20, (int)(400*width), 40);
        }
    }
}