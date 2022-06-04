package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.models.facility.Booking;
import CaseStudy.Task2.models.facility.Facility;
import CaseStudy.Task2.models.facility.Villa;
import CaseStudy.Task2.models.person.Customer;
import CaseStudy.Task2.service.BookingComparator;
import CaseStudy.Task2.service.ServiceBooking;

import java.util.*;

public class BookingServiceImpl implements ServiceBooking {
    public static Scanner scanner = new Scanner(System.in);
    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("tam", "1998",
                "nam", 1, "11111",
                "tam@gmail.com", 111, "ssasaa"));
        customerList.add(new Customer("hhh", "1998",
                "nam", 2, "88888",
                "hhhh@gmail.com", 222, "bbbbbb"));

        facilityIntegerMap.put(new Villa("Villa", 20, 20, 4,
                "Diamond", "Đơn", 20, 3), 0);
        facilityIntegerMap.put(new Villa("Villa2", 30, 30, 3,
                "Diamond", "Đôi", 20, 3), 1);
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("nhập ngày bắt đầu thuê:");
        String startDate = scanner.nextLine();
        System.out.println("nhập ngày kết thúc thuê:");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);

        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void displayBooking() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }

    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng:");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("nhập id khách hàng:");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Ban nhập sai, mời nhập lại!!");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sách dịch vụ:");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("nhập id dịch vụ:");
        boolean check = true;
        String id = scanner.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getServiceName())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Ban nhập sai, mời nhập lại!!");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
