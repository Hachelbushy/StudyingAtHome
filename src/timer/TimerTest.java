package timer;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

// Powyższy import ma na celu zapobiec konfliktowi z klasą java.util.Timer.

/**
 * @version 1.1 28.10.2019
 * @author Mateusz Zakrzewski
 */

public class TimerTest {
    public static void main(String[] args) {

        ActionListener listener = new TimePrinter();

        //Konstrukcja zegara wywołującego obiekt nasłuchujący co 10 sekund

        Timer t = new Timer(1000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Zamknąć program?");
        System.exit(0);

    }
}

class TimePrinter  implements ActionListener{

    public void  actionPerformed(ActionEvent event){

        System.out.println("Kiedy usłyszysz dźwięk, będzie godzina " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
