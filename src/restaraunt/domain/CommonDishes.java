package restaraunt.domain;

import restaraunt.domain.interfaces.Dishes;

import java.util.Objects;

public class CommonDishes implements Dishes {

    private int id;
    private String name;
    private double price;
    private boolean isActive;


    public CommonDishes(String name, double price) {
        this.name = name;
        this.price = price;
        this.isActive = true;
    }

    public void setId(int id) {
        this.id = id;
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
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDishes that = (CommonDishes) o;

        if (id != that.id) return false;
        if (Double.compare(price, that.price) != 0) return false;
        if (isActive != that.isActive) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Product: ID - %d, name - %s, price - %.2f, is active? - %s.",  id, name, price, isActive ? "Yes" : "No");
    }
}

