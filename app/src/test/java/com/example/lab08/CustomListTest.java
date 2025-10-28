package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity(){
        City testCity = new City("Van","BC");
        CustomList testCities = new CustomList();
        testCities.addCity(testCity);

        assertTrue(testCities.hasCity(testCity));
    }

}
