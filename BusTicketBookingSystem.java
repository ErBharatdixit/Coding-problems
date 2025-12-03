import java.util.*;
 class BusTicketBookingSystem  {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();

            int q = sc.nextInt();

            boolean[] bks = new boolean[N+1];
            
            


             for(int i = 0; i<q; i++){
                  int n = sc.nextInt();
                  if(!bks[n]){
                        bks[n] = true;
                        System.out.println("booked");
                  }

                  
                        
                  else{
                        System.out.println("already booked");
                  }




                  

             }
            
      }
      
}
