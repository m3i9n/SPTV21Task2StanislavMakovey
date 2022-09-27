package sptv21task2stanislavmakovey;

import java.util.Scanner;



/**
 *
 * @author fugas
 */
public class SPTV21Task2StanislavMakovey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трёхзначное число:");
        int number = scanner.nextInt();
    System.out.println("Cумма цифр:"+((number%10)+((number/10)%10)+((number/100)%10)));
    
            
    }
        
}
    