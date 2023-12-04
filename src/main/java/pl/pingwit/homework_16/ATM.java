package pl.pingwit.homework_16;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ATM {
    private String id;
    private String area;
    private String city;
    private String address_type;
    private String address;
    private String house;
    private String work_time;
    private String work_time_full;

    private String currency;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setAddress_type(String address_type) {
        this.address_type = address_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time;
    }

    public String getWork_time_full() {
        return work_time_full;
    }

    public void setWork_time_full(String work_time_full) {
        this.work_time_full = work_time_full;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "id='" + id + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", addressType='" + address_type + '\'' +
                ", address='" + address + '\'' +
                ", house='" + house + '\'' +
                ", workTime='" + work_time + '\'' +
                ", workTimeFull='" + work_time_full + '\'' +
                ", carrency='" + currency + '\'' +
                '}';
    }
}
