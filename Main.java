public class Main
{
      // calculate power x^n with stack height (logn)
    public static int calc(int x, int n){
        if(n == 0)  return 1;
        if(x == 0) return 0;
        
        if(n % 2 == 0){
            return calc(x,n/2) * calc(x,n/2);
        }else{
            return  calc(x,n/2)* calc(x,n/2)*x;
        }
        
    }
	public static void main(String[] args) {
	    
	    int x = 2, n = 5;
	    
	    int result = calc(3,5);
		System.out.println(result);
	}
}
