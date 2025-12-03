import java.util.*;
class AverageFuel{

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double fuel = sc.nextInt();

            double distance = sc.nextInt();

            if(fuel == 0.0 || distance == 0.0){
                  System.out.println("Invalid Input");
            }


            double litersPerhundredKilometers = 100*(1/7.5);

            System.out.printf("liters/100km : %.2f%n",litersPerhundredKilometers);

            double miles = distance*0.6214;

            double gallon = fuel*0.2642;

            double milesperGallon = miles/gallon;

            System.out.printf( "  miles Per gallon: %.2f " ,milesperGallon);



            
      }
}