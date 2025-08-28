package Transport;

public class Transport {
    private String type;
    private String description;
    private String cityName;

    public Transport(String type, String description, String cityName) {
        this.type = type;
        this.description = description;
        this.cityName = cityName;
    }
    

    public String getCityName() {
        return cityName;
    }

    public void displayTransportInfo() {
        
        System.out.println("Transport: " + type);
        System.out.println("Details: " + description);
        System.out.println("------------------------");
    }
}

