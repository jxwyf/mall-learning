package com.lhalj.malllearning.component;

/**
 * 描述:
 */
public class Test1 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("2121213213");
        //buffer.deleteCharAt(buffer.length()-1);
        buffer.delete(1,2);
        System.out.println(buffer);
    }
}
