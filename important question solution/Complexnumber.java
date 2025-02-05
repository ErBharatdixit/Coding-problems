

public class Complexnumber {
      int real,image;

      public Complexnumber(int r , int i){
            this.real = r;
            this.image = i;
      }

      public void showC(){
            System.out.println(this.real + "+i" + this.image);
      }

      public static Complexnumber add(Complexnumber n1, Complexnumber n2){
            Complexnumber res = new Complexnumber(0, 0);

            res.real = n1.real + n2.real;
            res.image = n1.image + n2.image;

            return res;
      }
      
      public static void main(String[] args) {
            Complexnumber c1 = new Complexnumber(4, 5);
            Complexnumber c2 = new Complexnumber(3, 4);
            System.out.println("first Complex number: ");
            c1.showC();

            System.out.println("second Complex number: ");
            c2.showC();

            Complexnumber res = add(c1,c2);

            System.out.println("Addition is : ");
            res.showC();

            
      }
      
}
