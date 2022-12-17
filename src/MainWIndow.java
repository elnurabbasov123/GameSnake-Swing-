import javax.swing.*;

public class MainWIndow extends JFrame {

    public MainWIndow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWIndow mw=new MainWIndow();
    }
}
