
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener  {

    GUI gui;
    public Controller(){
        gui = new GUI(this);
    }

    @Override
    public void keyTyped(KeyEvent e){}

    @Override
    public void keyPressed(KeyEvent e){

        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            gui.moveLeft();

        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            gui.moveRight();


        }
        else if (e.getKeyCode() == KeyEvent.VK_SPACE){
            gui.drawMap();
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP){
            gui.jump();
        }


    }

    @Override
    public void keyReleased(KeyEvent e){}

}

