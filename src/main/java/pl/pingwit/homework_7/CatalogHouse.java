package pl.pingwit.homework_7;
import java.util.Arrays;
public class CatalogHouse {
    private String city;
    private String area;
    private House[] housesList;
    public CatalogHouse(String city, String area, House[] housesList) {
        this.city = city;
        this.area = area;
        this.housesList = housesList;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public House[] getHousesList() {
        return housesList;
    }
    public void setHousesList(House[] housesList) {
        this.housesList = housesList;
    }
    @Override
    public String toString() {
        return "CatalogHouse{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", housesList=" + Arrays.toString(housesList) +
                '}';
    }
}

