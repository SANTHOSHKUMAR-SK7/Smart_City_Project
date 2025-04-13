package City;

public class City {
    private String name;
    private String description;

    public City(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void displayCityInfo() {
        System.out.println("City: " + name);
        System.out.println("Description: " + description);
        System.out.println("------------------------");
    }
}
