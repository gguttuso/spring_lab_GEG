package spring.services;

import iface.ValidationServiceFace;

public class ValidationService implements ValidationServiceFace {
    @Override
    public String getValidation() {
        return "validation to go here";
    }
}
