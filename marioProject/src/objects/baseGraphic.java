package objects;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;


public class baseGraphic extends JPanel {
    int posX, posY, width, height;
    Color color;
    BufferedImage image;
    private ImageObserver ob;


    public void drawMe(Graphics g){
        g.setColor(color);
        g.fillRect(posX, posY, width, height);
        g.drawImage(image, posX, posY, width, height, ob);

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, posX, posY, height, width, ob);

        /*
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.clearRect(posX, posY, width, height);
        g2d.drawRect(posX, posY, width, height);

        g2d.setRenderingHint(
                RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC
        );
        g2d.drawImage(image, posX, posY, width, height, ob);
        g2d.dispose();
        */

    }



}


