package logic;

import gui.StationImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Station extends JPanel {
    private int number;

    private StationType type;

    private ArrayList<Station> taxiConnections;
    private ArrayList<Station> busConnections;
    private ArrayList<Station> undergroundConnections;
    private ArrayList<Station> ferryConnections;

    public Station(int number, StationType type, int x, int y, int width, int height) {
        this.number = number;
        this.type = type;
        setBounds(x, y, width, height);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("CLICKED ON: Station-" + number + " (" + type +")");
                /** TODO: implement */
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(StationImageLoader.getImage(type), 0, 0, this);
        g.drawString("" + number, 22, 29);
    }

    public int getNumber() {
        return number;
    }

    public StationType getType() {
        return type;
    }

    public ArrayList<Station> getTaxiConnections() {
        return taxiConnections;
    }

    public void addTaxiConnections(Station... stations) {
        for(Station st : stations)
            if(!taxiConnections.contains(st))
                taxiConnections.add(st);
    }

    public ArrayList<Station> getBusConnections() {
        return busConnections;
    }

    public void addBusConnections(Station... stations) {
        for(Station st : stations)
            if(!busConnections.contains(st))
                busConnections.add(st);
    }

    public ArrayList<Station> getUndergroundConnections() {
        return undergroundConnections;
    }

    public void addUndergroundConnections(Station... stations) {
        for(Station st : stations)
            if(!undergroundConnections.contains(st))
                undergroundConnections.add(st);
    }

    public ArrayList<Station> getFerryConnections() {
        return ferryConnections;
    }

    public void addFerryConnections(Station... stations) {
        for(Station st : stations)
            if(!ferryConnections.contains(st))
                ferryConnections.add(st);
    }

    public ArrayList<Station> getAllConnections() {
        ArrayList<Station> ret = new ArrayList<Station>();
        for(Station f : taxiConnections)
            if(!ret.contains(f))
                ret.add(f);
        for(Station f : busConnections)
            if(!ret.contains(f))
                ret.add(f);
        for(Station f : undergroundConnections)
            if(!ret.contains(f))
                ret.add(f);
        for(Station f : ferryConnections)
            if(!ret.contains(f))
                ret.add(f);
        return ret;
    }
}
