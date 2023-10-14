package Laptop;

public class Brand {
    private String brand;
    private String country;
    private String language;

    public Brand(String brand, String country, String language){
        this.brand = brand;
        this.country = country;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Brand [brand= " + brand + ", country= " + country + ", language= " + language + "]";
    }
}
