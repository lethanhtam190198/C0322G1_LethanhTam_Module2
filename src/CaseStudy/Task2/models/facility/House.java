package CaseStudy.Task2.models.facility;

public class House extends Facility{
    String roomStandard;
    int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, double acreage, double rentalCosts, int numberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, acreage, rentalCosts, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return
                "House[" + super.toString()+
                ", roomStandard='" + roomStandard +
                ", numberOfFloors=" + numberOfFloors +
                ']';
    }
}
