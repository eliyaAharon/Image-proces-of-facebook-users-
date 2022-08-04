import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class VisualHelpClass {

    // create custom button
    public  void createCustomButton(JButton button, int y, String tittle) {
        Font buttonFont = new Font("Arial", Font.BOLD, 17);
        button.setBackground(Color.YELLOW);
        button.setBounds(460, y, 175, 50);
        button.setText(tittle);
        button.setFont(buttonFont);
    }

    // Resize the bufferImage
    public BufferedImage resize(BufferedImage image, final Dimension size) {
        final BufferedImage resized = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_ARGB);
        final Graphics2D g = resized.createGraphics();
        g.drawImage(image, 0, 0, size.width, size.height, null);
        g.dispose();
        return resized;
    }
}
