import java.util.*;
public class DistanceAdjustor
{
    public static void main(String[] args){
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("Enter Race Distance in Furlongs: ");
        double raceDist = (S.nextDouble());
        
        while(!(S.nextLine().equals("quit"))){
            System.out.println("Enter Race Time in Seconds: ");
            double time = (S.nextDouble());
            System.out.println("Enter Old Race Distance in Furlongs: ");
            double dist = (S.nextDouble());
            
            double newTime = ((time/(dist/raceDist)) - ((dist-raceDist)*2));
            
            System.out.println("The adjusted time is: "+newTime+"\n");
        }
        
        
        S.close();
        
        
        
        
    }
}