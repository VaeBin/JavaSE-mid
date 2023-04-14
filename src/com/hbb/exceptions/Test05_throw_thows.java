 package com.hbb.exceptions;

 import java.util.Scanner;

 /**
 * 抛出异常throws，谁调用main谁解决该异常，这里是JVM
  *
  * throw：方法内部，后+异常对象，制造异常
  * throws“方法签名处，后+异常类名（可多个异常类名，”，“连接），告诉方法调用者可能出现异常提前处理要么再往外抛异常
 *
 */

public class Test05_throw_thows {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inout num: ");
        int num = scanner.nextInt();
        if (num==0){

            //制造运行时异常
//            throw  new RuntimeException();

            // 制造检查异常
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            // 自己不处理
            throw new Exception();
        }
    }
}
