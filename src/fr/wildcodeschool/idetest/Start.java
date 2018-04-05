package fr.wildcodeschool.idetest;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Start {

    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        URL url = new URL("http://www.patagonia.com/static/on/demandware.static/-/Library-Sites-PatagoniaShared/default/dwb0ab6f9a/slots/newlocalism/subPages/411x618_TNL-JumboWild_Ogle_a_0232.jpg");
        jf.add(new JLabel(new ImageIcon(url)));
        jf.pack();
        jf.setVisible(true);
    }

}
