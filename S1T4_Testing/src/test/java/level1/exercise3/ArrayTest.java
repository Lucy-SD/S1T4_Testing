package level1.exercise3;

import org.junit.jupiter.api.Test;
import org.level1.exercise3.ArrayManager;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    public void testInvalidIndex() {

        ArrayManager arrayManager = new ArrayManager();
        int[] array = {1, 1, 2, 3, 5, 8, 13};

        try {
            arrayManager.checkIndex(array, 13);
            fail("No se ha lanzado la excepción esperada = (");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("El índice solicitado no es válido.", e.getMessage());
        }

    }

    @Test
    public void testValidIndex() {

        ArrayManager arrayManager = new ArrayManager();
        int[] array = {1, 1, 2, 3, 5, 8, 13};

        try {

            arrayManager.checkIndex(array, 5);
            assertEquals(8, array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("El índice solicitado no es válido.", e.getMessage());
        }
    }
}