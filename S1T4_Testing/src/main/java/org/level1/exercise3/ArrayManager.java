package org.level1.exercise3;

public class ArrayManager {

    public void checkIndex(int [] array, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("El índice solicitado no es válido.");
        }
    }
}
