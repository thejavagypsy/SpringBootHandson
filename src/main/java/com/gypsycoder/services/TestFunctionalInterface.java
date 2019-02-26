package com.gypsycoder.services;

@FunctionalInterface
interface Square 
{ 
    int calculate(int x); 
} 
  
class TestFunctionalInterface
{ 
    public static void main(String args[]) 
    { 
        int a = 5; 
  
        // lambda expression to define the calculate method 
        Square s = (int x)->x*6; 
  
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = s.calculate(a); 
        System.out.println(ans); 
    } 
}
