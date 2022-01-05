import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print("Enter a positive integer : ");
        while (true) {
            try {
                i = scanner.nextInt();
                if(i > 0){
                    break;
                }else{
                    System.out.print("Enter a positive integer : ");
                }
            } catch (Exception e) {
                System.out.print("Enter a positive integer : ");
            }
        }
        int[] fibonacci = new int[i];
        if(i == 1){
            System.out.println(0);
        }else if(i == 2){
            System.out.println(0 + "\n" + 1);
        }else if(i == 3){
            System.out.println(0 + "\n" + 1 + "\n");
        }else{
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            fibonacci[2] = 1;
            for(int j = 3; j < i; j++){
                fibonacci[j] = fibonacci[j-1] + fibonacci[j-2];
            }
            for (int number : fibonacci) {
                System.out.println(number);
            }
        }
    }
}
