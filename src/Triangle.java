import javax.swing.*;
import java.awt.*;
import java.util.Random;
class Triangle extends Shape {
    private int[] xPoints, yPoints;

    public Triangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        xPoints = new int[]{x, x + width / 2, x + width};
        yPoints = new int[]{y + height, y, y + height};
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}