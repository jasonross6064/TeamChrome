
public class Room {

    public enum RoomType{
        SUITE,KING,DOUBLE
    }

    private RoomType roomType;
    private int bedCount;
    private int roomNumber;
    private int roomLevel;
    private boolean checkedIn;


    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        if(bedCount <= 0){
            return;
        }
        this.bedCount = bedCount;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        if(roomNumber <= 0){
            return;
        }
        this.roomNumber = roomNumber;
    }

    public int getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(int roomLevel) {
        if(roomLevel <= 0){
            return;
        }
        this.roomLevel = roomLevel;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void checkIn(){
        this.checkedIn = true;
    }

    public void checkOut(){
        this.checkedIn = false;
    }




}
