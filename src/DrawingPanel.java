import javax.swing.*;
import java.awt.*;
import java.util.Random;
class DrawingPanel extends JPanel {
    private Shape[] shapes;

    public DrawingPanel(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}