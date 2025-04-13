package TouristPlace;

public class TouristPlace {
    private String name;
    private String description;
    private String cityName;

    public TouristPlace(String name, String description, String cityName) {
        this.name = name;
        this.description = description;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void displayTouristInfo() {
        System.out.println("Tourist Place: " + name);
        System.out.println("About: " + description);
        System.out.println("------------------------");
    }
}
