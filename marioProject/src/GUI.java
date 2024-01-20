
import View.BackgroundImage;
import objects.Brick;
import objects.Brick2;
import objects.Hole;
import objects.Platform;
import objects.Mario;
import javax.swing.*;


import java.io.IOException;



public class GUI extends JFrame  {
        Brick brick = new Brick();
        Brick2 brick2 = new Brick2();
        Platform platform = new Platform();
        Hole hole = new Hole();
        Mario mario = new Mario();

    public GUI(Controller c){
        this.setSize(1000, 800);
        this.setTitle("Mario");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.addKeyListener(c);



        try {
            this.getContentPane().add(new BackgroundImage("src/grahpics/bakgrunn.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        this.setVisible(true);
    }


    public void drawMap(){
        mario.paintComponent(this.getGraphics());
        brick.paintComponent(this.getGraphics());
        brick2.paintComponent(this.getGraphics());
        platform.paintComponent(this.getGraphics());
        hole.drawMe(this.getGraphics());
    }

    public void moveLeft(){
        //mario.repaint();
        System.out.println("aa");
        mario.paintComponent(this.getGraphics());
        //mario.marioLeft();


    }
    public void moveRight(){
        //this.repaint();
        System.out.println("afgfgdfga");
        mario.paintComponent(this.getGraphics());
        //mario.marioRight();

    }
    public void jump(){
        //this.repaint();
        mario.paintComponent(this.getGraphics());
        //mario.marioJump();


    }



}
