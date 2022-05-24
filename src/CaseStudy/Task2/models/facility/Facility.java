package CaseStudy.Task2.models.facility;

import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class Facility {
    String serviceName;
    double acreage;
    double rentalCosts;
    int numberOfPeople;
    String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double acreage, double rentalCosts, int numberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.rentalCosts = rentalCosts;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }


    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", acreage=" + acreage +
                ", rentalCosts=" + rentalCosts +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
