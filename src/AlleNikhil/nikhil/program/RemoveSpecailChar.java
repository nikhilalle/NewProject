package com.matrix.nikhil.program;

public class RemoveSpecailChar
{
    public static void main(String[] args) {
        String str="@$*J!AV&A@";
        String plain=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plain);
}}
