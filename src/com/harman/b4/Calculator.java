package com.harman.b4;

public class Calculator {
    public static void main(String[] args) {
        substraction subc=new substraction();
        int x = 7, y=4, z;
        z=x+y;
        System.out.println(z);
        int result = subc.sub(x,y);
        System.out.println(result);

    }
}
