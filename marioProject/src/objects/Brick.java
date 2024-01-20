package objects;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class Brick extends baseGraphic {

    public Brick (){

        posX = 380;
        posY = 470;
        width = 20;
        height = 20;

        try {
            image = ImageIO.read(new File("src/grahpics/box.PNG"));
        } catch (IOException e) {
        }

    }
}
