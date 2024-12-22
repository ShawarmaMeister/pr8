import javax.swing.*;
import java.awt.*;

public class ImageDisplay {
    public static void main(String[] args) {
        // Проверяем, передан ли путь к изображению в аргументах командной строки
        if (args.length == 0) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        // Получаем путь к изображению из аргументов командной строки
        String imagePath = args[0];

        // Создаем окно
        JFrame frame = new JFrame("Просмотр изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Загружаем изображение
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        // Добавляем изображение в окно
        frame.add(imageLabel, BorderLayout.CENTER);

        // Отображаем окно
        frame.setVisible(true);
    }
}