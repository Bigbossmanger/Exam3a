package myInt;

/*      College Delaware Community College
        Course :CSC 164-6C1 (Computer science II)
        Assigment :Exam 3a OOP
        Author : @Noel Martial Nguemechieu
        Due date:04/04/2021
        Description: This program create 2 objects named num1 and num2
        and then display if their numbers are  even , odd, prime and equal
 */

//Main class test
public class Test {

 static    MyInt num1=new MyInt(10);//create MyInt Object num1 with initial value 10
 static    MyInt num2=new MyInt(13);//create MyInt Object num1 with initial value 13

    //main method
    public  static  void main(String[] args){

        num1.setMyValue(10);//set num1 to 10

        num2.setMyValue(13);//set num2 to 13

        // Print results
        System.out.println("Is num1 even? "+num1.isEven());
        System.out.println("Is num1 odd? "+num1.isOdd());
        System.out.println("Is num1 prime?:"+num1.isPrime()+"\n");
        //Num2
        System.out.println("Is num2 even? "+num2.isEven());
        System.out.println("Is num2 odd? "+num2.isOdd());
        System.out.println("Is num2 prime?:"+num2.isPrime()+"\n");
        //Equality
        System.out.println("Is num1 = num2 ?:"+num1.isEqual(num2)+"\n");
        //Change myValue of num1 to 13
        num2.setMyValue(num1.getMyValue());
        System.out.println("Is num1 = num2 ?"+num1.isEqual(num2));

    }//main method end;

}
