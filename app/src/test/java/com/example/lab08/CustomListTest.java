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

    @Test
    public void testDeleteCity(){
        City testCity = new City("Van","BC");
        CustomList testCities = new CustomList();
        testCities.addCity(testCity);

        assertEquals(testCities.countCities(), 1);
        assertTrue(testCities.deleteCity(testCity));
        assertEquals(testCities.countCities(), 0);
    }

    @Test
    public void testCountCities(){
        City testCity = new City("Van","BC");
        CustomList testCities = new CustomList();

        assertEquals(testCities.countCities(), 0);

        testCities.addCity(testCity);
        assertEquals(testCities.countCities(), 1);
    }


}
