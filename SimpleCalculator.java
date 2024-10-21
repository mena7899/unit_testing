/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testing_project;

/**
 *
 * @author First
 */
public class SimpleCalculator {
    public int add (int num1,int num2){    
    return num1+num2;
    }
    public int subtract (int num1,int num2){
    return num1-num2;
    }
    public int multiply (int num1,int num2){
    return num1*num2;
    }
    public int divide (int num1,int num2){
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    return num1/num2;
    }
}
