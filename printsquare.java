import java.util.Scanner;

public class printsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of square:");
        int n = sc.nextInt();
        System.out.println("enter the value of m:");
        int m = sc.nextInt();
        for(int i=1;i<=m  ; i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
