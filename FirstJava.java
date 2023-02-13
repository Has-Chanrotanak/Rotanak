import java.util.*;
public class FirstJava{
    /**
     * @param arge
     */
    public static void main(String []arge){
        System.out.println("Hello Banaras Hindu Univesity!!");
        System.out.println("I'm Rotanak");
        System.out.println(Math.sqrt(64));
        System.out.println(Math.min(35,5));
        System.out.println(Math.max(20,40));
        //0 to100
        int randomNum= (int)(Math.random()*100);
        System.out.println(randomNum);
        // boolean yes/no , true/false ,ON/OFF
        int a=30;
        int b=90;
        System.out.println("Number A is : " + a);
        System.out.println("Number B is : " + b);
        System.out.println("Number A greater than B is :" + (a>b));
        //System.out.println(a>b);


        Scanner csMark= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String str= csMark.nextLine();              //reads string  
        System.out.print("You have entered: "+str);

        int x=19;
        if(x>=3){
            System.out.println("You are Parst");

        }

    }
}