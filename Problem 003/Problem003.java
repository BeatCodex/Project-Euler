/*
 * Largest Prime Factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Solution: 6857
 */

public class Problem003 {

    public Problem003(){
        long i = 1;
        long val = 600851475143L;
        long largest = 0;
        while(i < (val / 2)){
            if(val % i == 0){
                if(isPrime(i)){
                    largest = i;
                    System.out.println(largest);
                }
            }
            i++;
        }
    }
    
    public static void main(String[] args) {
        new Problem003();
    }

    public boolean isPrime(long n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
