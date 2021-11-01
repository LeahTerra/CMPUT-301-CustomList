import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestListCity {
    private CustomList list;


    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }
    @Test
    public void addCityTest() {
        createList();
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize +1);
    }

    @Test
    public void hasCityTest() {
        createList();
        list.addCity(new City("Edmonton", "AB"));
        assertTrue(list.hasCity("Edmonton"));
    }

    @Test
    public void deleteCityTest() {
        createList();
        City newCity = new City("Edmonton", "AB");
        list.addCity(newCity);
        int listSize = list.getCount();
        list.deleteCity(newCity);
        assertEquals(list.getCount(), listSize -1);
    }

    @Test
    public void countCitiesTest() {
        createList();
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Halifax", "NS"));
        int listSize = list.getCount();
        assertEquals(listSize, list.countCities());
    }
}
