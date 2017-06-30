import java.util.*;
public class UI
{
    public static void main(String[] args){
        System.out.println("How long is the Race in Furlongs?");
        
        Scanner Scanny = new Scanner(System.in);
        double length = Scanny.nextDouble();
        
        System.out.println("-------- Constructing Race --------\n");

        
        
        Race R = new Race(length);

        Scanner S = new Scanner(System.in);
        String newLine = "";
        CommandFactory CF = new CommandFactory(R);
        
        while(!newLine.equals("quit")){
                System.out.println("ENTER COMMAND:");
                newLine = S.nextLine();
                String[] tokens = newLine.split(" ");
                Command com = CF.getCommand(tokens);
           if(com!=null){
               com.run();
           }
            
            
        }
        System.out.println("Thank You For Using HorsePredictor2014");
    }
}