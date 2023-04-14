package com.hbb.exceptions;

import java.util.Scanner;

/**
 * 多重catch，顺序捕获
 * 一旦捕获就不再看后面的exception
 * 可用Exception兜底，即先子类异常再父类
 *
 * JDK1.7后可用|连接多重异常
 */

public class Test03_multi_catch {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("inout num: ");
            int num = scanner.nextInt();
            return;
        }
        catch (ArithmeticException | NullPointerException ex){
            // 全限定路径（类名）
            ex.printStackTrace();

        }
        catch (Exception ex){
            // 全限定路径（类名）
            ex.printStackTrace();

        }
    }
}
