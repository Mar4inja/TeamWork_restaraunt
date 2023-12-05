package restaraunt.domain.interfaces;

public interface Tables {

    int getId();

    int getTableSeatingCapacity();

    boolean isReserved();

    String getTablePosition();
}
