public class DriverForTests
{
    public static void main(String[] args){
       Race r = new Race(8);
       
       System.out.println("Test time...");
       
       r.loadFromFile("testSave.txt");
       for(int i = 0; i<r.getHorseList().size(); i++){
            System.out.println(r.getHorseList().get(i));
            System.out.println();
        }
    
    }
}
