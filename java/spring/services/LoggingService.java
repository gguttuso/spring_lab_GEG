package spring.services;

import iface.LoggingServiceFace;

public class LoggingService implements LoggingServiceFace {

    @Override
    public String getLogs() {
        return "Return logs to go here";
    }
}
