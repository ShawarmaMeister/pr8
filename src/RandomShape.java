import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShape {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Создаем массив фигур
        Shape[] shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(500);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            switch (random.nextInt(3)) {
                case 0:
                    shapes[i] = new Circle(color, x, y, random.nextInt(50) + 20);
                    break;
                case 1:
                    shapes[i] = new Rectangle(color, x, y, random.nextInt(100) + 20, random.nextInt(100) + 20);
                    break;
                case 2:
                    shapes[i] = new Triangle(color, x, y, random.nextInt(100) + 20, random.nextInt(100) + 20);
                    break;
            }
        }
        // Создаем панель для рисования
        DrawingPanel drawingPanel = new DrawingPanel(shapes);
        frame.add(drawingPanel);

        frame.setVisible(true);
    }

}