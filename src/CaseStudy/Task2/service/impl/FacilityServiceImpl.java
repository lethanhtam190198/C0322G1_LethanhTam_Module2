package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.models.facility.Facility;
import CaseStudy.Task2.models.facility.House;
import CaseStudy.Task2.models.facility.Room;
import CaseStudy.Task2.models.facility.Villa;
import CaseStudy.Task2.models.person.Employee;
import CaseStudy.Task2.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static Scanner scanner = new Scanner(System.in);
    public static int count;
    public static Map<Facility, Integer> facilityService = new LinkedHashMap<>();

    static {
        facilityService.put( new Villa("villa", 150, 3000000, 15, "thue tron goi", "DK", 45, 3),1);
        facilityService.put( new Room("room", 35, 150000, 6, "thue tron goi", "DK"),2);
        facilityService.put( new House("house", 150, 3000000, 15, "thue tron goi", "DK", 2),3);
    }


    public static String getRentalType() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Kiểu thuê------\n" +
                    "1. Theo giờ\n" +
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
                    default:
                        System.out.println("Vui lòng nhập lại trong khoảng từ 1->4");

                }
                break;
            } else {
                System.out.println("Please Retype");
            }
        } while (true);
        return " ";
    }


    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu");
        System.out.println("Nhập lựa chọn:");
        int choose = 0;
        try {
           choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhap lai!!!!");
        }
        switch (choose) {
            case 1:
                System.out.println("--------Add New Villa-------");
                System.out.println("Nhập Service Name:");
                String nameService = scanner.nextLine();
                System.out.println("Nhập acreage(diện tích):");
                double acreage = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập rentalCosts(chi phí thuê):");
                double rentalCosts = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập numberOfPeople:");
                int numberOfPeople = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập roomStandard");
                String roomStandard = scanner.nextLine();
                System.out.println("Nhập swimmingPoolArea");
                double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập numberOfFloors");
                int numberOfFloors = Integer.parseInt(scanner.nextLine());
                facilityService.put( new Villa(nameService, acreage, rentalCosts, numberOfPeople, getRentalType(), roomStandard, swimmingPoolArea, numberOfFloors),0);
                count++;
                break;
            case 2:
                System.out.println("--------Add New House-------");
                System.out.println("Nhập Service Name:");
                String nameService1 = scanner.nextLine();
                System.out.println("Nhập acreage(diện tích):");
                double acreage1 = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập rentalCosts(chi phí thuê):");
                double rentalCosts1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập numberOfPeople:");
                int numberOfPeople1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập roomStandard");
                String roomStandard1 = scanner.nextLine();
                System.out.println("Nhập numberOfFloors");
                int numberOfFloors1 = Integer.parseInt(scanner.nextLine());
                facilityService.put( new House(nameService1, acreage1, rentalCosts1, numberOfPeople1, getRentalType(), roomStandard1, numberOfFloors1),0);
                count++;
                break;
            case 3:
                System.out.println("--------Add New Room-------");
                System.out.println("Nhập Service Name:");
                String nameService2 = scanner.nextLine();
                System.out.println("Nhập acreage(diện tích):");
                double acreage2 = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập rentalCosts(chi phí thuê):");
                double rentalCosts2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập numberOfPeople:");
                int numberOfPeople2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập freeService(DV miễn phí đi kèm):");
                String freeService = scanner.nextLine();
                facilityService.put( new Room(nameService2, acreage2, rentalCosts2, numberOfPeople2, getRentalType(), freeService),0);
                count++;
                break;
        }
    }


    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> item : facilityService.entrySet()) {
            System.out.println( item.getValue()+" " +item.getKey() );
        }

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
