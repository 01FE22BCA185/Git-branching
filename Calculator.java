/**
 * The `Calculator` class contains methods for performing addition, subtraction, multiplication, and division operations on float numbers.
 */
class Calculator{
// The `addition` method in the `Calculator` class is performing the addition operation between two float numbers `a` and `b`. It adds `a` and `b` together and returns the result.
 float  addition(float a,float b){
    return (a+b);
 }
// The `float subtraction(float a,float b)` method in the `Calculator` class is performing the subtraction operation between two float numbers `a` and `b`. It subtracts `b` from `a` and returns the result.
float subtraction(float a,float b){
    return (a-b);
 }
// The `multiplication` method in the `Calculator` class is performing the multiplication operation between two float numbers `a` and `b`. It multiplies `a` by `b` and returns the result.
 float  multiplication(float a,float b){
    return (a*b) ;
 }
// The `division` method in the `Calculator` class is performing division operation between two float numbers `a` and `b`. It divides `a` by `b` and returns the result.
 float  division(float a,float b){
    return (a/b);
 }

public static void  main (String args[]){
   float a = 10;
   float b = 5;
  Calculator calc = new Calculator();
  float add_result = calc.addition(a,b);
  System.out.println("Result of addition is :"+add_result);

  float sub_result = calc.subtraction(a,b);
  System.out.println("Result of Subtraction is :"+sub_result);

  float mul_result = calc.multiplication(a,b);
  System.out.println("Result of Multiplication is :"+mul_result);
  
  float div_result = calc.division(a,b);
  System.out.println("Result of division is :"+div_result);


}
}

