package Oop2;

public class House {
    public static void main(String[] args) {
        Build brick = new Build(3,3,"town");
          brick.setFloor(3);
          brick.setRoom (3);
          brick.setLoc ("town");
        System.out.println(brick);
        Build cement = new Build(2,4,"suburb");

//        cement.floor = 2;
//        cement.room = 4;
//        cement.loc = "suburb";

        Build wood = new Build(1,1,"village");

//        wood.floor = 1;
//        wood.room = 1;
//        wood.loc = "village";
        //System.out.println();
    }
}
