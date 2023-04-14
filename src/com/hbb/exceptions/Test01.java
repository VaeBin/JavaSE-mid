package com.hbb.exceptions;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("inout num: ");
            int num = scanner.nextInt();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

    }



}
