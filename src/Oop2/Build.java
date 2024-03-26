package Oop2;

public class Build {

    private int floor;
    private int room;
    private String loc;
   // SetValue(int floor, int room, String loc);

    public Build (int floor, int room, String loc){

    }



    public int getFloor(int floor) {

        return  floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoom(int room) {

        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getLoc(String loc) {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Build{" +
                "floor=" + floor +
                ", room=" + room +
                ", loc='" + loc + '\'' +
                '}';
    }
}
