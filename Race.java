import java.util.*;
import java.io.*;
import javax.swing.*;
public class Race{
    public ArrayList<Horse> horseList;
    private String teamName;
    public double raceDist;
    
    
    public Race(double distance){
        teamName = "Race";
        horseList = new ArrayList();
        raceDist = distance;
        
    }
    
    public double adjustTime(double time, double dist){
        double newTime = ((time/(dist/raceDist)) - ((dist-raceDist)*2));
        return newTime;
    }
    
    public String toString(){
        String stats="";
        for(int i=0; i<horseList.size(); i++){
            stats += "\n" + horseList.get(i).toString();
        } 
        
        return stats;
        
    }
    
    public void addHorse(Horse h){
        horseList.add(h);
    }
    
    public String getName(){ return teamName; }
    
    public void loadFromFile(){ 
        JFileChooser chooser = new JFileChooser();
        String filename=null;
        
        if(chooser.showOpenDialog(new JFrame()) == JFileChooser.APPROVE_OPTION){
            filename= chooser.getSelectedFile().getAbsolutePath();
        }
        
        loadFromFile(filename);
    }
    
    public void loadFromFile(String filename){
        
        Scanner S;
       
        try{
            S= new Scanner(new File(filename));
        }catch(Exception e){
            System.out.println("Error. "+e);
            return;
        }
        
        while(S.hasNext()){
            String[] line = S.nextLine().split(", ");
            
            ArrayList runTimes = new ArrayList();
            runTimes.add(adjustTime(Double.parseDouble((line[3])),Double.parseDouble((line[4]))));
            runTimes.add(adjustTime(Double.parseDouble((line[6])),Double.parseDouble((line[7]))));
            runTimes.add(adjustTime(Double.parseDouble((line[9])),Double.parseDouble((line[10]))));
            runTimes.add(adjustTime(Double.parseDouble((line[12])),Double.parseDouble((line[13]))));
            
            ArrayList places = new ArrayList();
            places.add(Integer.parseInt((line[5])));
            places.add(Integer.parseInt((line[8])));
            places.add(Integer.parseInt((line[11])));
            places.add(Integer.parseInt((line[14])));
            
            
            Horse temp = new Horse((line[0]), (line[1]), Integer.parseInt((line[2])), runTimes, places, Integer.parseInt((line[15])));
            horseList.add(temp);
            //S.nextLine();
        }
        
        S.close();
        return;
        
    }
    
    public void sortByTimes(){
        for(int k=0; k<(horseList.size())/2; k++){
            for(int i=0; i<horseList.size()-1; i++){
                double first = (horseList.get(i).getAverageRunTime());
                double second = (horseList.get(i+1).getAverageRunTime());
                if(first > second){
                    Horse temp = horseList.get(i);
                    horseList.set(i, horseList.get(i+1));
                    horseList.set(i+1, temp);
                }
            }
        }
    }
    
    public void sortByPlace(){
        for(int k=0; k<(horseList.size())/2; k++){
            for(int i=0; i<horseList.size()-1; i++){
                double first = (horseList.get(i).getAveragePlace());
                double second = (horseList.get(i+1).getAveragePlace());
                if(first > second){
                    Horse temp = horseList.get(i);
                    horseList.set(i, horseList.get(i+1));
                    horseList.set(i+1, temp);
                }
            }
            
        }
    }
    
    public void sortByPoints(){
        for(int k=0; k<(horseList.size())/2; k++){
            for(int i=0; i<horseList.size()-1; i++){
                double first = (horseList.get(i).getPoints());
                double second = (horseList.get(i+1).getPoints());
                if(first < second){
                    Horse temp = horseList.get(i);
                    horseList.set(i, horseList.get(i+1));
                    horseList.set(i+1, temp);
                }
            }
            
            
        }
    }
    
    public void sortByClass(){
        for(int k=0; k<(horseList.size())/2; k++){
            for(int i=0; i<horseList.size()-1; i++){
                double first = (horseList.get(i).getClassChange());
                double second = (horseList.get(i+1).getClassChange());
                if(first < second){
                    Horse temp = horseList.get(i);
                    horseList.set(i, horseList.get(i+1));
                    horseList.set(i+1, temp);
                }
            }
            
            
        }
    }
    
    public ArrayList<Horse> getHorseList(){
        return horseList;
    }
    
    public void assignPoints(){
        //add points based on times
        sortByTimes();
        double bestTime = horseList.get(0).getAverageRunTime();
        for(int j=0; j<horseList.size(); j++){
            double time = horseList.get(j).getAverageRunTime();
            double difference = time-bestTime;
            double pointsToAdd = (15-difference)*1;
            //double pointsToAdd = (18-difference)*1;
            horseList.get(j).addPoints(pointsToAdd);
        }
        
        //add points based on score
        sortByPlace();
        double bestPlace = horseList.get(0).getAveragePlace();
        for(int k=0; k<horseList.size(); k++){
            double place = horseList.get(k).getAveragePlace();
            double difference = place-bestPlace;
            double pointsToAdd = (7-difference)*3;
            //double pointsToAdd = (8-difference)*3;
            //double pointsToAdd = (15-difference);
            horseList.get(k).addPoints(pointsToAdd);
        }
        
        //add points based on class change
        sortByClass();
        int bestClass = horseList.get(0).getClassChange();
        for(int i=0; i<horseList.size(); i++){
            int classChange = horseList.get(i).getClassChange();
            int change = bestClass-classChange;
            int pointsToAdd = (24-change)/2;
            //int pointsToAdd = (26-change)/2;
            horseList.get(i).addPoints(pointsToAdd);
        }
        
        //add points by jockey score
        for(int l=0; l<horseList.size(); l++){
            int jockeySc = horseList.get(l).getJockeyScore();
            double pointsToAdd = 1.5*jockeySc;
            horseList.get(l).addPoints(pointsToAdd);
        }
    }
}