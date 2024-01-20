import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class HighScore {

    Timer timer;
    Int count = 1000;
    Arraylist records<scores> = new Arraylist;
    timer = new Timer(100, this);
        timer.start();
        if (e.getsource == timer){
        count--;
        //pseudo code
        if(mario.intersect(coin){
            count += 10;}
        //if functionforvillandeath();{
        // count + = 20;}
    }


    public void LoadHighscores(ArrayList<String> Highscores) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("Highscores.txt"));
        try {
            while (s.hasNext()){
                records.add(s.next());
            }
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void Wingame(String playername)
    {
        records.append(playername + count);
        for (int i = 0; i < records.size(); i++)
        {
            Scores = (records.get(i)+"\n").toString);
        }
        FileWriter saving = new FileWriter("Highscores.txt");
        saving.writer(Scores);
        saving.close();
        view.JoptionPane.ShowmessageDialog(view, modell.records);


    }
}
