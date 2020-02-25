package spring.beans;

import iface.Coach;

public class CoffeeCoach implements Coach {

    private String inventoryLevel;
    private String emailAddress;

    public CoffeeCoach() {

        System.out.println("there are 5 mugs left in inventory");
    }

    public String getInventoryLevel() {
        return inventoryLevel;
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