import java.util.*;


public class Function {

    //Enter 3 numbers from the user & make a function to print their average.
    public static void averageNumber(int a , int b , int c){
        float result = (a+b+c)/3;
        System.out.println("Average is "+result);
    }

    // Write a program to enter the numbers till the user wants and at the end it should 
    // display the count of positive, negative and zeros entered. 
    public static void countNumberSign(Scanner sc){
        int n=0 ;
        int pos=0;
        int neg=0;
        int neutral=0;
        do{
            n = sc.nextInt();
            if (n>0) {
                pos++;
            }else if (n<0) {
                neg++;
            }else{
                neutral++;
            }
        }while(n!= 8);

        System.out.println("Positive " + pos + " AND Negative " + neg + " AND Zero "+neutral);
    }

    public static int GCD(int a , int b){
        int mid=0 , gcd=0;

        if (a>b) {
            mid = a/2;
        }else{
            mid = b/2;
        }

        for(int i=1;i<=mid;i++){
            if (a%i==0 &&  b%i==0 && gcd < i) {
                gcd=i;
            }
        }

        return gcd;
    }

    public static void fibonacci(int n){
        int prevNum =0;
        int nextNum =1;
        if (n >=0) {
            System.out.print(prevNum + " ");
            
        }
       


        for(int i=1;i<=n;i++){
            System.out.print(nextNum + " ");
            int temp = nextNum;
            nextNum = nextNum+prevNum;
            prevNum = temp;     
        }
        System.out.println();
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // averageNumber(a, b, c);

        // countNumberSign(sc);

        // System.out.println("Greatest common divisor is " + GCD(a,b));

        fibonacci(sc.nextInt());

        sc.close();
    }
}
