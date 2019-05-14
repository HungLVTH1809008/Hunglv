package Assignment1;

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap n");
        n = scanner.nextInt();

        System.out.println("cac so nguyen to nho hon "+n+" la:");
        for (int i=1;i<n; i++)
        {
            int dem=0;
            for(int j=1;j<=i;j++)
            {
                if (i % j == 0)
                {
                    dem++;
                }
            }
            if(dem==2)
            {
                System.out.print(" "+i);
            }

        }
    }
}
