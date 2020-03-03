package spring.beans;

import iface.Coach;
import spring.services.LoggingService;
import spring.services.ValidationService;

public class CoffeeCoach implements Coach {

    private String inventoryLevel;
    private String emailAddress;

    private LoggingService loggingService;
    private ValidationService validationService;

    public CoffeeCoach() {

        System.out.println("there are 5 mugs left in inventory");
    }

    public String getInventoryLevel() {
        return inventoryLevel;
    }

    public void setLoggingService(LoggingService loggingService) {
        System.out.println("in CoffeeCoach setter");
        this.loggingService = loggingService;
    }

    public void setInventoryLevel(String inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}