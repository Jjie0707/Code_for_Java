package utils;

import java.util.Scanner;

public class ScannerSingleton {
    public static Scanner sc;

    public static Scanner getScanner(){
        if(sc==null){
            sc=new Scanner(System.in);
        }
        return sc;
    }
}
