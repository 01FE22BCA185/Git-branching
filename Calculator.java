// The line `import java.util.Scanner;` is importing the `Scanner` class from the `java.util` package.
// The `Scanner` class is used to read input from the user in Java.
import java.util.Scanner;

public class calculator{
        public float Addtion(float num1, float num2)
        {
           float add=num1+num2;
            return add;
        }
        public float  Substraction(float num1, float num2)
        {
            float sub=num1-num2;
            return sub;
        }
        public float  Multiplication(float num1, float num2)
        {
            float multi=num1*num2;
            return multi;
        }
        public float  Division(float num1, float num2)
        {
            float div=num1/num2;
            return div;
        }
        public static void main(String[] args){
            float num1;
            float num2;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Two Numbers");
            System.out.print("Enter the first Number:");
            num1=sc.nextFloat();
            System.out.print("Enter the Second Number:");
            num2=sc.nextFloat();
            calculator c=new calculator();
            System.out.println("The addtion of two Numbers = "+c.Addtion(num1,num2));
            System.out.println("The substarction of two Numbers = "+c.Substraction(num1,num2));
            System.out.println("The multiplication of two Numbers = "+c.Multiplication(num1,num2));
            System.out.println("The division of two Numbers = "+c.Division(num1,num2));
      
        }

}
