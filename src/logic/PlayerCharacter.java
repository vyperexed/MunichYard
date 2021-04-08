package logic;

import java.util.ArrayList;

public abstract class PlayerCharacter {
    protected String name;
    protected Station position;

    public  String getName() {
        return name;
    }

    public Station getPosition() {
        return position;
    }

    public void setPosition(Station station) {
        position = station;
    }

    public ArrayList<Station> getConnectedStations() {
        return position.getAllConnections();
    }
}
