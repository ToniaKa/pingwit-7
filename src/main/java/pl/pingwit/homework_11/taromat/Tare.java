package pl.pingwit.homework_11.taromat;

import java.util.Objects;

public class Tare {
    private String productName;
    private Material material;

    public Tare(String productName, Material material) {
        this.productName = productName;
        this.material = material;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tare tare = (Tare) o;
        return Objects.equals(productName, tare.productName) && material == tare.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, material);
    }

    @Override
    public String toString() {
        return "Tare{" +
                "productName='" + productName + '\'' +
                ", material=" + material +
                '}';
    }
}
