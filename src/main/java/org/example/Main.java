package org.example;

public class Main {
    public static void main(String[] args) {

        Calc calc=new Calc();
        String octalValue="347";
        int v= calc.octalToDec(octalValue);
        System.out.println(v);
    }
}