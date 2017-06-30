import java.util.*;
public class PretendDriver
{
    public static void main(String[] args){
        ArrayList testTimes = new ArrayList();
        testTimes.add(10.45);
        testTimes.add(10.6);
        testTimes.add(11.8);
        testTimes.add(12.34);
        testTimes.add(10.34);
        
        ArrayList testPlaces = new ArrayList();
        testPlaces.add(2);
        testPlaces.add(3);
        testPlaces.add(4);
        testPlaces.add(6);
        testPlaces.add(1);
        
        int testClassChange = 3;
        
        Horse testHorse = new Horse("Horsee 1", "1", testClassChange, testTimes, testPlaces, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        
        ArrayList testTimes2 = new ArrayList();
        testTimes2.add(31.45);
        testTimes2.add(12.6);
        testTimes2.add(13.8);
        testTimes2.add(12.34);
        testTimes2.add(14.34);
        
        ArrayList testPlaces2 = new ArrayList();
        testPlaces2.add(3);
        testPlaces2.add(3);
        testPlaces2.add(5);
        testPlaces2.add(6);
        testPlaces2.add(7);
        
        int testClassChange2 = 2;
        
        Horse testHorse2 = new Horse("Horsee 2", "3", testClassChange2, testTimes2, testPlaces2, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        
        ArrayList testTimes3 = new ArrayList();
        testTimes3.add(9.45);
        testTimes3.add(13.6);
        testTimes3.add(15.8);
        testTimes3.add(13.34);
        testTimes3.add(12.34);
        
        ArrayList testPlaces3 = new ArrayList();
        testPlaces3.add(2);
        testPlaces3.add(3);
        testPlaces3.add(2);
        testPlaces3.add(3);
        testPlaces3.add(1);
        
        int testClassChange3 = 1;
        
        Horse testHorse3 = new Horse("Horsee 3", "3", testClassChange3, testTimes3, testPlaces3, 0);
        ///////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Now Printing TestHorse Test Stats....");
        System.out.println();
        
        //testHorse.calcRunTimeAverage();
        //testHorse.calcPlaceAverage();
        
        System.out.println("Avg Run Time: "+ testHorse.getAverageRunTime());
        System.out.println("Avg Place: "+ testHorse.getAveragePlace());
        System.out.println("Class Change: "+ testHorse.getClassChange());
        System.out.println();
        ///////////////////////////////////////////////////////////////////////////////
        
        Race testRace = new Race(3);
        
        testRace.addHorse(testHorse);
        testRace.addHorse(testHorse2);
        testRace.addHorse(testHorse3);
        
        System.out.println("Now Printing Test Horse List");
        System.out.println();
        System.out.println(testRace.getHorseList());
        System.out.println();
        
        testRace.sortByTimes();
        System.out.println("Now Printing Test Horse List Sorted By Best Times");
        System.out.println();
        System.out.println(testRace.getHorseList());
        System.out.println();

        testRace.sortByPlace();
        System.out.println("Now Printing Test Horse List Sorted By Best Places");
        System.out.println();
        System.out.println(testRace.getHorseList());
        System.out.println();
        ///////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Now Printing Test Race Predicted Outcome");
        System.out.println();
        testRace.assignPoints();
        testRace.sortByPoints();
        for(int i = 0; i<testRace.getHorseList().size(); i++){
            System.out.println((testRace.getHorseList().get(i).getName()) + ", Points: " + (testRace.getHorseList().get(i).getPoints()));
            System.out.println();
        }
        
        
    }
}