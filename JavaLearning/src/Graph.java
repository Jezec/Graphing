import java.awt.*;
import javax.swing.*;

import static java.awt.geom.AffineTransform.getTranslateInstance;

public class Graph extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xAxisEnd = getWidth();
        int xAxisStart = 5;
        int yAxisEnd = getHeight();
        int yAxisStart = 5;
        int xScale = getWidth() / 30;
        int yScale = getHeight() / 30;
        int i;

        for (i = 0; i < getHeight(); i = i + yScale) {
            if (yAxisStart + i < yAxisEnd) {
                g.setColor(Color.BLACK);
                g.drawLine(xAxisStart, yAxisStart + i, xAxisEnd, yAxisStart + i);

                for (int z = 0; z < getWidth(); z = z + xScale) {
                    g.drawLine(xAxisStart + z, yAxisStart, xAxisStart + z, yAxisEnd);
                }

            }
        }

        for (i = 0; i < 50; i++) {
            g.setColor(Color.RED);
            double y = Math.sin(i) + 10;
            g.fillOval(i * xScale, (int) (getHeight() - y * yScale), 10, 10);
        }
    }
}
