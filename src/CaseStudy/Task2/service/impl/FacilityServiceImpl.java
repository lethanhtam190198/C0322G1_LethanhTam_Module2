package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.models.facility.Facility;
import CaseStudy.Task2.models.facility.House;
import CaseStudy.Task2.models.facility.Room;
import CaseStudy.Task2.models.facility.Villa;
import CaseStudy.Task2.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static Scanner scanner = new Scanner(System.in);
    public static int count;
    public static LinkedHashMap<Integer, Facility> facilityService = new LinkedHashMap<>();

    static {
        facilityService.put(1, new Villa("villa", 150, 3000000, 15, "thue tron goi", "2DK", 45, 3));
        facilityService.put(2, new Room("room", 35, 150000, 6, "thue tron goi", "2DK"));
        facilityService.put(3, new House("house", 150, 3000000, 15, "thue tron goi", "3DK", 2));
        count = 4;

    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu");
        System.out.println("Nhập lựa chọn:");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("--------Add New House-------");
                System.out.println("Nhập Service Name:");
                String nameService = scanner.nextLine();
                System.out.println("Nhập acreage(diện tích):");
                double acreage = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập rentalCosts(chi phí thuê):");
                double rentalCosts = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập numberOfPeople:");
                int numberOfPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập rentalType(loại cho thuê)");
                String roomStandard = scanner.nextLine();
                System.out.println("Nhập swimmingPoolArea");
                double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập numberOfFloors");
                int numberOfFloors = Integer.parseInt(scanner.nextLine());
                facilityService.put(count, new Villa(nameService, acreage, rentalCosts, numberOfPeople, Villa.getrentalType(), roomStandard, swimmingPoolArea, numberOfFloors));
                count++;
        }
    }


    @Override
    public void display() {


    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }
}
