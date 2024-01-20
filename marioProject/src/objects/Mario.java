package objects;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Mario extends baseGraphic{

    public Mario(){
        width = 50;
        height = 50;
        posX = 10;
        posY = 600;


        try {
            image = ImageIO.read(new File("src/grahpics/marioRight.PNG"));
        } catch (IOException e) {
        }
    }


    /*
    public void marioLeft(){
        posX = posX - 50;
        try {
            image = ImageIO.read(new File("src/grahpics/marioLeft.PNG"));
        } catch (IOException e) {
        }


    }

    public void marioRight(){
        posX = posX + 50;
        try {
            image = ImageIO.read(new File("src/grahpics/marioRight.PNG"));
        } catch (IOException e) {
        }

    }

    public void marioJump(){

        posY = posY - 50;
    }
    */
}
