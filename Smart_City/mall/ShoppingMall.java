package mall;

public class ShoppingMall {
    private String name;
    private String cityName;

    public ShoppingMall(String name, String cityName) {
        this.name = name;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void displayMallInfo() {
        System.out.println("Shopping Mall: " + name);
        System.out.println("------------------------");
    }
}
