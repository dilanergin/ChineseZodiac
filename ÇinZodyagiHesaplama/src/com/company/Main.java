package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
 0 ➜ Maymun 1 ➜ Horoz 2 ➜ Köpek 3 ➜ Domuz 4 ➜ Fare 5 ➜ Öküz 6 ➜ Kaplan 7 ➜ Tavşan 8 ➜ Ejderha 9 ➜ Yılan 10 ➜ At 11 ➜ Koyun */
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Doğduğunuz yılı giriniz: ");
        int year = scan.nextInt();
        n = year % 12;
        switch (n) {
            case 0:
                System.out.println("Çin zodyağı burcunuz: MAYMUN");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz: HOROZ");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz: KÖPEK");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz: DOMUZ");
                break;
            case 4:
                System.out.println("Çin zodyağı burcunuz: FARE");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz: ÖKÜZ");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz: KAPLAN");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz: TAVŞAN");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz: EJDERHA");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz: YILAN");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz: AT");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz: KOYUN");
                break;
        }


    }
}
