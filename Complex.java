/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class Complex {
    private double realPart;
  private double imaginaryPart;
  
  // default constructor
  public Complex() {
    this.realPart = 0;
    this.imaginaryPart = 0;
  }
  
  // constructor with parameters
  public Complex(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }
  
  // method to add two complex numbers
  public Complex add(Complex otherNumber) {
    double abc = this.realPart + otherNumber.realPart;
    double xyz = this.imaginaryPart + otherNumber.imaginaryPart;
    return new Complex(abc, xyz);
  }
  
  // method to subtract two complex numbers
  public Complex subtract(Complex otherNumber) {
    double abc = this.realPart - otherNumber.realPart;
    double xyz = this.imaginaryPart - otherNumber.imaginaryPart;
    return new Complex(abc, xyz);
  }
  
  // method to multiply two complex numbers
  public Complex multiply(Complex otherNumber) {
    double abc = (this.realPart * otherNumber.realPart) - (this.imaginaryPart * otherNumber.imaginaryPart);
    double xyz = (this.realPart * otherNumber.imaginaryPart) + (this.imaginaryPart * otherNumber.realPart);
    return new Complex(abc, xyz);
  }
  
  // method to divide two complex numbers
  public Complex divide(Complex otherNumber) {
    double denominator = Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2);
    double abc = ((this.realPart * otherNumber.realPart) + (this.imaginaryPart * otherNumber.imaginaryPart)) / denominator;
    double xyz = ((this.imaginaryPart * otherNumber.realPart) - (this.realPart * otherNumber.imaginaryPart)) / denominator;
    return new Complex(abc, xyz);
  }
  
  // method to set the real part of the complex number
  public void setRealPart(double realPart) {
    this.realPart = realPart;
  }
  
  // method to set the imaginary part of the complex number
  public void setImaginaryPart(double imaginaryPart) {
    this.imaginaryPart = imaginaryPart;
  }
  
  // method to get the real part of the complex number
  public double getRealPart() {
    return this.realPart;
  }
  
  // method to get the imaginary part of the complex number
  public double getImaginaryPart() {
    return this.imaginaryPart;
  }
  
  // method to display the complex number in the format "a + bi"
  
  public String toString() {
    return this.realPart + " + " + this.imaginaryPart + "i";
  }
}
