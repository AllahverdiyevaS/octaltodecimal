package org.example;

public class Calc {
    public int octalToDec(String octalValue){int res=0;int count=octalValue.length();
        for (int i=0;i < count;i++)
        {res = res + Character.getNumericValue(octalValue.charAt(i))
                * (int) Math.pow(8, octalValue.length() - 1 - i);
    }
        return res;
}}
