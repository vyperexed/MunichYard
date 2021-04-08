import logic.Station;
import logic.StationType;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /* GUI-test */
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(0, 0, 800, 600);
        jf.setVisible(true);
        jf.setLayout(null);

        jf.add(new Station(1, StationType.Taxi, 100, 100, 50, 50));
        jf.add(new Station(2, StationType.TaxiBusUnderground, 300, 100, 50, 50));
    }
}
