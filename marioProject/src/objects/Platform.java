package objects;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Platform extends baseGraphic{

    public Platform(){
        posX = 225;
        posY = 585;
        width = 30;
        height = 30;
        try {
            image = ImageIO.read(new File("src/grahpics/metal_box.PNG"));
        } catch (IOException e) {
        }
    }

}
