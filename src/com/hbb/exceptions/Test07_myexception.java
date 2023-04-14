 package com.hbb.exceptions;

 /**
 * 自定义异常，别处可以直接用了。
 *
 */

public class Test07_myexception extends RuntimeException{
    public Test07_myexception(){}
    public Test07_myexception(String msg){
        super(msg);
    }

}
