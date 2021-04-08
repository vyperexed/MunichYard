package gui;

import logic.StationType;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StationImageLoader {

    public static Image getImage(StationType type) {
        try {
            if(type == StationType.Taxi)
                return ImageIO.read(new File("./gfx/Station_Taxi.png"));
            if(type == StationType.TaxiBus)
                return ImageIO.read(new File("./gfx/Station_Taxi_Bus.png"));
            if(type == StationType.TaxiBusUnderground)
                return ImageIO.read(new File("./gfx/Station_Taxi_Bus_UnderGround.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
