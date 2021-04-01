package myInt;


import static myInt.Test.num1;

public class MyInt {
    private int myValue;    //initialise and store myValue;

    //Default  Constructor with no arguments

    /**
     * @param myValue myValue
     */
    // Constructor with parameter
    public MyInt(int myValue) {

        this.myValue = myValue;
    }


    // Get Value Method
    public int getMyValue() {//get myValue
        return myValue;
    }

    public void setMyValue(int myValue) {//set MyValue
        this.myValue = myValue;
    }

    // isOdd Method
    public boolean isOdd() {

        return myValue % 2== 1;// return true if odd numbers found
    }

    //isEven Method
    public boolean isEven() {
        return  (myValue %2==0 );// return true if even numbers found

    }

    // Prime number method
    public boolean isPrime() {
        //checking prime numbers
        return (myValue % 2 == 1);//return true if prime num2 is prime

    }


    // isEqual Method
    public boolean isEqual(MyInt MyInt) {

        // check equality
        return num1.getMyValue()==MyInt.getMyValue();// return true;
//return false
    }
}
