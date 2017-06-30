import java.util.*;
public class Horse extends Object
{
    
    private String name;
    private String number;
    
    private double avRunTime;
    private int classChange;
    private double avPlace;
    
    private ArrayList runTimes;
    private ArrayList places;
    
    private double points;
    
    private int jockeyScore;
    
    public Horse(String n, String num, int change, ArrayList times, ArrayList place, int numPlaces){
        
        name = n;
        number = num; 
        
        runTimes = times;
        places = place;
        classChange = change;
    
        calcRunTimeAverage();
        calcPlaceAverage();
        
        jockeyScore = numPlaces;
    }
    
    //public String toString(){
    //    String line = number + ", " + name +" Time: "+ avRunTime +" Class Change: "+ classChange +" Place: "+ avPlace;
    //    return line;
    //}
    
    public String getName(){ return name; }
    public String getNumber(){ return number; }
    
    
    public double getAverageRunTime(){ return avRunTime; }
    public void calcRunTimeAverage(){
        double sum = 0;
        for(int i=0; i<runTimes.size(); i++){
            sum += (double)(runTimes.get(i));
        }
        avRunTime = sum/runTimes.size();
    }
    
    
    public double getAveragePlace(){ return avPlace; }
    public void calcPlaceAverage(){
        int sum = 0;
        for(int i=0; i<places.size(); i++){
            sum += (int)(places.get(i));
        }
        avPlace = ((double)sum/places.size());
    }
    
    
    public int getClassChange(){ return classChange; }
    public void setClass(int change){ classChange = change; }
    
    public int getJockeyScore(){ return jockeyScore; }
    public void setjockeyScore(int change){ jockeyScore = change; }
    
    public void setPoints(double pts){ points = pts;}
    public void addPoints(double pts){ points += pts;}
    public double getPoints(){ return points;}
    
    public double adjustTime(double time, double dist, double raceDist){
        double newTime = ((time/(dist/raceDist)) - ((dist-raceDist)*2));
        return newTime;
    }
    
    public String toString(){
        StringBuffer buf = new StringBuffer();
        Formatter F = new Formatter(buf);
        
        F.format("%3s %16s %3.2f", number, name, getPoints());
        
        String line = buf.toString();
        return line;
    }
    
}
