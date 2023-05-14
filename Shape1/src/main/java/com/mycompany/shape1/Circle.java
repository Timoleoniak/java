

package com.mycompany.shape1;


public class Circle implements Shape {
    private double radius;
    private double area2;
  
    
    
    public Circle(double radius,double area2,pi = 3.14){
        this.area2 = area2;
        this.radius = radius;
        
        area2 = pi * radius * radius;
        
        System.out.println("Area of the Circle is "+area2);
        

    }

   
}    

