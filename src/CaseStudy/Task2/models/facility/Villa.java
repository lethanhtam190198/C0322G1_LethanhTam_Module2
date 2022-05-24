package CaseStudy.Task2.models.facility;

import java.util.Scanner;

public class Villa extends Facility {
    String roomStandard;
    double swimmingPoolArea;
    int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, double acreage, double rentalCosts, int numberOfPeople, String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceName, acreage, rentalCosts, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public static String getrentalType() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Theo giờ\n" +
                    "2. Theo ngày\n" +
                    "3. Theo tháng\n" +
                    "4. Theo năm\n" +
                    "Your choose  ");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose >= 1 && choose <= 4) {
                switch (choose) {
                    case 1:
                        return "Theo giờ";
                    case 2:
                        return "Theo ngày";
                    case 3:
                        return "Theo tháng";
                    case 4:
                        return "Theo năm";

                }
                break;
            } else {
                System.out.println("Please Retype");
            }
        } while (true);
        return " ";
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
