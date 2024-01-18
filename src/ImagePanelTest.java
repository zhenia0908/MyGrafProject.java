import javax.swing.*;

public class ImagePanelTest extends JFrame {

    public ImagePanelTest(String name) {
        ImagePanel p = new ImagePanel(name);
       // p.add(new JLabel("Brest"));
        add(p);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

  /*  public static void main(String args[]) {
        new ImagePanelTest("src/krasnyj-kostel.jpg"); // argument - nazwa pliku graficznego (z
        // roboczego katalogu aplikacji)
        new ImagePanelTest("src/dostoprimechatelnosti-bresta.jpg");
        new ImagePanelTest("src/Screenshot_6779.jpg");
    }*/
}

