package pl.pingwit.homework_7;

public class House {
    private String type;
    private int floors;
    private int tenants;    //ЖИЛЬЦЫ
    private boolean isHeating;
    public House(String type, int floors, int tenants, boolean isHeating) {
        this.type = type;
        this.floors = floors;
        this.tenants = tenants;
        this.isHeating = isHeating;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public int getTenants() {
        return tenants;
    }
    public void setTenants(int tenants) {
        this.tenants = tenants;
    }
    public boolean isHeating() {
        return isHeating;
    }
    public void setHeating(boolean heating) {
        isHeating = heating;
    }
    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", floors=" + floors +
                ", tenants=" + tenants +
                ", isHeating=" + isHeating +
                '}';
    }
}
