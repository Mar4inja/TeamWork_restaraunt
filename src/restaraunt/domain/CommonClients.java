package restaraunt.domain;

import restaraunt.domain.interfaces.Clients;

import java.util.Objects;

public class CommonClients implements Clients {

   private int id;
    private  String name;
    private  boolean isActiv;

    public CommonClients(String name) {
        this.name = name;
        this.isActiv = true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isActiv() {
        return isActiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonClients that = (CommonClients) o;

        if (id != that.id) return false;
        if (isActiv != that.isActiv) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isActiv ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommonClients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActiv=" + isActiv +
                '}';
    }
}