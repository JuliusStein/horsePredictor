import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;

public class LiveDriver{
    public static void main( String args[] ){
        System.out.println("How many Horses?");
        
        Scanner Sca = new Scanner(System.in);
        int numHorses = Sca.nextInt();
        
        Table mainFrame =  new Table(numHorses);
        //mainFrame.setColor(Color.BLACK);
        mainFrame.setVisible( true );
       
        //JButton button1 = new JButton("Run");
        //button1.setActionCommand("EXIT");
        //button1.addActionListener("this");
        
        Scanner Scan = new Scanner(System.in);
        String line = "";
        System.out.println("Type 'save' when data is properly inserted.");
        line = Scan.nextLine();
        while(!line.equalsIgnoreCase("save")){
            
        }
        
        Scanner Scanny = new Scanner(System.in);
        String file = "";
        System.out.println("Where would you like to save to?");
        file = Scanny.nextLine();
        
        
        try{
            mainFrame.writeCSVfile(mainFrame.table, file);
            System.out.println("File saved to '"+file+"'");
        }catch(IOException e){
            
        }
        
        System.out.println("How long is the Race in Furlongs?");
        
        Scanner Scany = new Scanner(System.in);
        double length = Scany.nextDouble();
        
        System.out.println("-------- Constructing Race --------\n");

        
        
        Race r = new Race(length);
        r.loadFromFile(file);

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
        
        
        System.out.println("Thank You For Using HorsePredictor2014");

    }
}