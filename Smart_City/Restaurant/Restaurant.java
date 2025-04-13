package Restaurant;

public class Restaurant {
    private String name;
    private String cuisine;
    private String cityName;

    public Restaurant(String name, String cuisine, String cityName) {
        this.name = name;
        this.cuisine = cuisine;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void displayRestaurantInfo() {
        System.out.println("Restaurant: " + name);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("------------------------");
    }
}
