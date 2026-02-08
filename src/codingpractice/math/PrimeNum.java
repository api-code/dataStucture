package codingpractice.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum {
    public static Boolean isPrime(int n){
        if(n<1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //to get the primes in a range
    public static List<Integer> getPrimes(int a, int b) {
        List<Integer> primes = new ArrayList<>();
        // Loop through the range from a to b
        for (int i = a; i <= b; i++) {
            // If i is prime, add to result
            if (isPrime(i))
                primes.add(i);
        }
        return primes;
    }

    public static void print(List<Integer> list){
        for(int i:list){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        //a number will be prime or not
        int n=11;
        boolean answer= isPrime(n);
        System.out.println(answer);

        //the prime number in a range
        int a=20,b=100;

        System.out.println(getPrimes(a,b));

    }
}
