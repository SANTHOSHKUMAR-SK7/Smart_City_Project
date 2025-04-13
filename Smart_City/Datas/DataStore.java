package Datas;

import City.City;
import Hotel.Hotel;
import Restaurant.Restaurant;
import mall.ShoppingMall;
import TouristPlace.TouristPlace;
import Transport.Transport;
import java.util.ArrayList;
import java.util.List;

public class DataStore {
    public static List<City> cities = new ArrayList<>();
    public static List<Hotel> hotels = new ArrayList<>();
    public static List<Restaurant> restaurants = new ArrayList<>();
    public static List<ShoppingMall> malls = new ArrayList<>();
    public static List<TouristPlace> touristPlaces = new ArrayList<>();
    public static List<Transport> transports = new ArrayList<>();

    public static void initializeData() {
        cities.add(new City("Coimbatore", "Manchester of South India"));
        cities.add(new City("Chennai", "Capital city of Tamil Nadu"));
        cities.add(new City("Madurai", "Temple City"));

        hotels.add(new Hotel("Taj Vivanta", "Race Course Road, Coimbatore", "Coimbatore"));
        hotels.add(new Hotel("ITC Grand Chola", "Guindy, Chennai", "Chennai"));

        restaurants.add(new Restaurant("Sree Annapoorna", "South Indian", "Coimbatore"));
        restaurants.add(new Restaurant("Maaran poratta kadai", "Traditional Tamil", "Madurai"));

        malls.add(new ShoppingMall("Prozone Mall", "Coimbatore"));
        malls.add(new ShoppingMall("Express Avenue", "Chennai"));

        touristPlaces.add(new TouristPlace("Meenakshi Amman Temple", "Historic temple known for its stunning architecture", "Madurai"));
        touristPlaces.add(new TouristPlace("Marina Beach", "Longest urban beach in India", "Chennai"));

        transports.add(new Transport("Bus", "TNSTC government buses available frequently", "Madurai"));
        transports.add(new Transport("Metro", "Chennai Metro covers major areas", "Chennai"));
    }
}
