package Main;

import City.City;
import Datas.DataStore;
import Hotel.Hotel;
import Restaurant.Restaurant;
import TouristPlace.TouristPlace;
import Transport.Transport;
import mall.ShoppingMall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataStore.initializeData();
        while (true) {
            System.out.println("\n======= Smart City Guide =======");
            System.out.println("1. View City Information");
            System.out.println("2. View Hotels");
            System.out.println("3. View Restaurants");
            System.out.println("4. View Transport Options");
            System.out.println("5. View Shopping Malls");
            System.out.println("6. View Tourist Places");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (City city : DataStore.cities) {
                        city.displayCityInfo();
                    }
                    break;
                case 2:
                    for (Hotel hotel : DataStore.hotels) {
                        hotel.displayHotelInfo();
                    }
                    break;
                case 3:
                    for (Restaurant restaurant : DataStore.restaurants) {
                        restaurant.displayRestaurantInfo();
                    }
                    break;
                case 4:
                    for (Transport transport : DataStore.transports) {
                        transport.displayTransportInfo();
                    }
                    break;
                case 5:
                    for (ShoppingMall mall : DataStore.malls) {
                        mall.displayMallInfo();
                    }
                    break;
                case 6:
                    for (TouristPlace place : DataStore.touristPlaces) {
                        place.displayTouristInfo();
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using Smart City Guide! Goodbye.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}