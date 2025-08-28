package Hotel;

public class Hotel {
    private String name;
    private String address;
    private String cityName;

    public Hotel(String name, String address, String cityName) {
        this.name = name;
        this.address = address;
        this.cityName = cityName;
    }
    public String getCityName() {
        return cityName;
    }

    public void displayHotelInfo() {
        System.out.println("Hotel: " + name);
        System.out.println("Address: " + address);
        System.out.println("------------------------");
    }
}

