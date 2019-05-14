package Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("nhap so nguyen to");
        x = sc.nextInt();
        if (soNguyenTo.isSoNguyenTo(x)) {
            System.out.println("là so nguyen to");
        } else {
            System.out.println("không phải số nguyên tố");
        }

//       Scanner cc =new Scanner(System.in);
//        int a;
//        a=cc.nextInt();
//        soNguyenTo.timSoNguyenTotieptheo(a);
//        System.out.println("số nguyên tố cần tìm :");
        int a [] = new int [10];
        soNguyenTo.sntlienke (a, 10);
        for (int i = 0; i <10; i ++){
            if (soNguyenTo.isSoNguyenTo (a [i])) System.out.println (a[i]);
        }


    }
}
