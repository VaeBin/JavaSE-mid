package com.hbb.exceptions;

import java.util.Scanner;

public class Test01_try_catch {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("inout num: ");
            int num = scanner.nextInt();
        }
        catch (Exception ex){
            // 全限定路径（类名）
            System.out.println(ex.toString());

            // 异常描述信息
            System.out.println(ex.getMessage());

            ex.printStackTrace();

            throw ex;
        }

    }



}
