package View;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

public class BackgroundImage extends JPanel {
    private Image backgrondImage;

    public BackgroundImage(String fileName) throws IOException{
        backgrondImage = ImageIO.read(new File(fileName));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(backgrondImage, 0, 0, this);
    }
}
