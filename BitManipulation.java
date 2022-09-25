public class BitManipulation {

    public static void checkBit(int num , int pos){
        int bitMask = 1<<pos;
        if ((bitMask & num)==0) {
            System.out.println(" Position ' "+ pos + " ' Bit is 0");
        }else{
            System.out.println(" Position ' "+ pos + " ' Bit is 1");
        }
    }


    public static void setBit(int num , int pos){
        int bitMask = 1<<pos;
        int newNum = num | bitMask;
        System.out.println("New number after set the bit position " + pos + " is " +newNum);
    }

    public static void clearBit(int num , int pos){
        int bitMask = 1<<pos;
        int negBitmask = ~(bitMask);
        int newNum = num & negBitmask;

        System.out.println("New number after clear the bit position " + pos + " is " +newNum);
    }

    public static void checkPowOfTwo(int num){
        int prevNum = num-1;

        if (num!=0 && (prevNum & num) == 0) {
            System.out.println("Number ' " + num + " ' is Power of 2");
        }else{
            System.out.println("Number ' " + num + " ' is not Power of 2");
        }
        
    }


    public static void main(String[] args) {
        int n = 16;
        int pos = 2;

        checkBit(n, pos);
        setBit(n, pos);
        clearBit(n, pos);
        checkPowOfTwo(n);
    }
}
