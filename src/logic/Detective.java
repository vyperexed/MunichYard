package logic;

public class Detective extends PlayerCharacter {
    private int taxiTicketCount;
    private int busTicketCount;
    private int undergroundTicketCount;

    public int getTaxiTicketCount() {
        return taxiTicketCount;
    }

    public int getBusTicketCount() {
        return busTicketCount;
    }

    public int getUndergroundTicketCount() {
        return undergroundTicketCount;
    }

    public boolean moveTaxi(Station station) {
        if(!position.getTaxiConnections().contains(station) || taxiTicketCount <= 0)
            return false;
        position = station;
        taxiTicketCount--;
        return true;
    }

    public boolean moveBus(Station station) {
        if(!position.getBusConnections().contains(station) || busTicketCount <= 0)
            return false;
        position = station;
        busTicketCount--;
        return true;
    }

    public boolean moveUnderground(Station station) {
        if(!position.getUndergroundConnections().contains(station) || undergroundTicketCount <= 0)
            return false;
        position = station;
        undergroundTicketCount--;
        return true;
    }
}
