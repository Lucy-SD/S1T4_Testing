package org.level1.exercise2;

public class Main {

    public static void main(String[] args){

        DNICalculator dni1 = new DNICalculator(12345678);
        DNICalculator dni2 = new DNICalculator(23456789);
        DNICalculator dni3 = new DNICalculator(34567891);
        DNICalculator dni4 = new DNICalculator(45678912);
        DNICalculator dni5 = new DNICalculator(56789123);
        DNICalculator dni6 = new DNICalculator(67891234);
        DNICalculator dni7 = new DNICalculator(78912345);
        DNICalculator dni8 = new DNICalculator(89123456);
        DNICalculator dni9 = new DNICalculator(91234567);
        DNICalculator dni10 = new DNICalculator(10234057);

        System.out.println("La letra correspondiente al DNI " + dni1.getDniNumber() + " es: " + dni1.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni2.getDniNumber() + " es: " + dni2.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni3.getDniNumber() + " es: " + dni3.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni4.getDniNumber() + " es: " + dni4.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni5.getDniNumber() + " es: " + dni5.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni6.getDniNumber() + " es: " + dni6.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni7.getDniNumber() + " es: " + dni7.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni8.getDniNumber() + " es: " + dni8.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni9.getDniNumber() + " es: " + dni9.calculateDniLetter() + ".");
        System.out.println("La letra correspondiente al DNI " + dni10.getDniNumber() + " es: " + dni10.calculateDniLetter() + ".");

    }
}