import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to order:");
        String OrdName = scanner.nextLine();
        if(OrdName.equals("Carbonara")){
            CarbonaraFac ord = new CarbonaraFac();
            ord.createPasta().prepare();
            System.out.println("Served!");
        }
        else if(OrdName.equals("Lasagna")){
            LasagnaFac ord = new LasagnaFac();
            ord.createPasta().prepare();
            System.out.println("Served!");
        }
        else{
            AlfredoFac ord = new AlfredoFac();
            ord.createPasta().prepare();
            System.out.println("Served!");
        }
    }
}