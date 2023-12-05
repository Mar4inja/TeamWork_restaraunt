package restaraunt.domain;

import restaraunt.domain.interfaces.Tables;

import java.util.Objects;

public class CommonTables implements Tables {

    private int id;
    private int tableSeatingCapacity;

    private boolean isReserved;

    private  String tablePosition;

    public CommonTables(int tableSeatingCapacity, String tablePosition) {
        this.tableSeatingCapacity = tableSeatingCapacity;
        this.tablePosition = tablePosition;
        this.isReserved = false;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getTableSeatingCapacity() {
        return tableSeatingCapacity;
    }

    @Override
    public boolean isReserved() {
        return isReserved;
    }

    @Override
    public String getTablePosition() {
        return tablePosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonTables that = (CommonTables) o;

        if (id != that.id) return false;
        if (tableSeatingCapacity != that.tableSeatingCapacity) return false;
        if (isReserved != that.isReserved) return false;
        return Objects.equals(tablePosition, that.tablePosition);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tableSeatingCapacity;
        result = 31 * result + (isReserved ? 1 : 0);
        result = 31 * result + (tablePosition != null ? tablePosition.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommonTables{" +
                "id=" + id +
                ", tableSeatingCapacity=" + tableSeatingCapacity +
                ", isReserved=" + isReserved +
                ", tablePosition='" + tablePosition + '\'' +
                '}';
    }
}
