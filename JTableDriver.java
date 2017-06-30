import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.Color;

public class JTableDriver{
    public static void main( String args[] ){
        System.out.println("How many Horses?");
        
        Scanner S = new Scanner(System.in);
        int numHorses = S.nextInt();
        
        Table mainFrame =  new Table(numHorses);
        //mainFrame.setColor(Color.BLACK);
        mainFrame.setVisible( true );
       
        
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

    }
}