public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 2;
        long Fibonacci1=1,Fibonacci2=1,temp=0;
        System.out.print(Fibonacci1 +" "+Fibonacci2+" ");
        for (int i = 2; i < x; i++) {
            temp = Fibonacci2;
            Fibonacci2 += Fibonacci1;
            Fibonacci1=temp;
            System.out.print(Fibonacci2);
            if (Fibonacci2 % 2 == 1 ){
                numOdd++;
            } 
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
