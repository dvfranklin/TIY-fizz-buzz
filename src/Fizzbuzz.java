/**
 * Created by franks on 4/13/16.
 */
public class Fizzbuzz {
    public static void main(String[] args){
        for(int i = 1; i <=100; i++){

            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("Fizzbuzz ");
            }

            else if(i % 5 == 0){
                System.out.print("Buzz ");
            }

            else if(i % 3 == 0){
                System.out.print("Fizz ");
            }

            else {
                System.out.print(i + " ");
            }

        }
    }
}
