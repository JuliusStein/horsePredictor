import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class CommandFactory
{
    private Race r;
    
    public CommandFactory(Race myRace){ 
        r = myRace;
    }
    
    public Command getCommand(String[] cmd){
        
        if(cmd[0].equalsIgnoreCase("load")){
            
            r.loadFromFile();
            
        }else if(cmd[0].equalsIgnoreCase("quit")){}
        else if(cmd[0].equalsIgnoreCase("print")){
            for(int i = 0; i<r.getHorseList().size(); i++){
                System.out.println(r.getHorseList().get(i));
                System.out.println();
            }
        }else if(cmd[0].equalsIgnoreCase("results")){
            System.out.println("Now Printing Test Race Predicted Outcome");
            System.out.println();
            r.assignPoints();
            r.sortByPoints();
            
            for(int i = 0; i<r.getHorseList().size(); i++){
                System.out.println(r.getHorseList().get(i));
                System.out.println();
            }
            
            DrawingPanel panel = new DrawingPanel(650,(60*(r.getHorseList().size())));
            Graphics G = panel.getGraphics();
            
            for(int i = 0; i<r.getHorseList().size(); i++){
                G.setColor(Color.BLACK);
                double points = r.getHorseList().get(i).getPoints();
                double width = (points/(r.getHorseList().get(0).getPoints()));
                G.drawString(""+(r.getHorseList().get(i).getName()+", "+(r.getHorseList().get(i).getNumber())), 10, 50*(i+1));
                G.fillRect(160, (50*(i+1))-20, (int)(400*width), 40);
            }
        }else if(cmd[0].equalsIgnoreCase("remove")){
            r.getHorseList().remove(((Integer.parseInt(cmd[1])-1)));
        }
        else{
            System.out.println("Sorry, I Don't understand: "+cmd[0]);
        }
        
        return  null;
        
    }
    
    
    
    
}