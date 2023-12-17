package pl.pingwit.homework_18;

import java.util.Objects;

public class VisitData {
    private String name;// нет причин не сделать поля final
    private String site;

    public VisitData(String name, String site) {
        this.name = name;
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public String getSite() {
        return site;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitData visitData = (VisitData) o;
        return Objects.equals(name, visitData.name) && Objects.equals(site, visitData.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, site);
    }

    @Override
    public String toString() {
        return "VisitData{" +
                "name='" + name + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
