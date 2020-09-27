import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
       return ((int) ((Math.random()*6) +1)) ;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] rolls = new int[11];
        for(int i =0; i<n;i++){
            rolls[rollDie()+rollDie()-2]+=1;
        }
        return rolls;
    }


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("How many pair of dice would you like to roll?");
        int n = num.nextInt();
        int[] rolls = sumOfTwoDice(n);
        for(int b = 0; b<11;b++){
            System.out.println("% of rolls where sum == "+ (b+2)+ ": "+(((double) rolls[b])/n)*100);
        num.close();
        }

    }
}
