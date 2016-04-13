/**
 * Created by franks on 4/13/16.
 */
public class Fizzbuzz {
    public static void main(String[] args){

        for(int i = 1; i <=100; i++){

            Integer testValue = i;
            String testString = Integer.toString(testValue);


            if((i % 5 == 0 && i % 3 == 0) || testString.contains("3") && testString.contains("5")){
                System.out.println("Fizzbuzz ");
            }

            else if(i % 3 == 0 || testString.contains("3")){
                System.out.print("Fizz ");
            }

            else if(i % 5 == 0 || testString.contains("5")){
                System.out.print("Buzz ");
            }


            else {
                System.out.print(i + " ");
            }

        }
    }
}
