package baitaptonghop.service;

import baitaptonghop.models.StaffPerson;

import java.util.Comparator;

public class SapXepTheoTen implements Comparator<StaffPerson> {

    @Override
    public int compare(StaffPerson o1, StaffPerson o2) {
        if (o1.getNameStaff().compareTo(o2.getNameStaff()) < 0) {
            return -1;
        } else if (o1.getNameStaff().compareTo(o2.getNameStaff()) > 0) {
            return 1;
        }
        return 0;
    }
}
