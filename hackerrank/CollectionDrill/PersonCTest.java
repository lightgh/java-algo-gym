package CollectionDrill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonCTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void checkNullablility(){
        PersonC personC = new PersonC("Chinaka", "Light" );
        assertEquals("Chinaka", personC.getSurname());
        assertEquals(false, personC.equals(null));
    }


    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}

