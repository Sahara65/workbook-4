package pluralsight.hotel;

public class Room {
    int number;
    boolean available;
    boolean isClean;
    RoomType roomType;

    public Room(int number, boolean available, boolean isClean, RoomType roomType) {
        this.number = number;
        this.available = available;
        this.isClean = isClean;
        this.roomType = roomType;
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isClean() {
        return isClean;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
