package org.level1.exercise2;

public class DNICalculator {

    private final int dniNumber;
    private final int remainder;

    public DNICalculator(int dniNumber) {
        this.dniNumber = dniNumber;
        this.remainder = this.dniNumber % 23;
    }

    public int getDniNumber() {
        return this.dniNumber;
    }

    public char calculateDniLetter() {
        String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
        return LETTERS.charAt(remainder);
    }

    public String setDni() {
        return Integer.toString(dniNumber) + "-" + calculateDniLetter();
    }

}
