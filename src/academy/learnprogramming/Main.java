package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isDivisible(3,5));
    }
    public static String isDivisible (int a, int b){

        int countDivisible = 0;
        int sumOfNumbers = 0;
        for (int i = 1; i <= 1000; i++){
            if( (i % a == 0) && (i % b == 0)){
                System.out.println("Number " + i + " is divisible both by 3 and 5");
                countDivisible++;
                sumOfNumbers += i;
                if (countDivisible == 5){
                    break;
                }
            }
        }
        return "The sum of the numbers is " + sumOfNumbers;
    }


}
