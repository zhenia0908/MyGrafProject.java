import javax.swing.*;
import java.awt.*;

class ImagePanel extends JPanel {

    Image img;
    boolean loaded = false; // czy obrazek został załadowany?

    public ImagePanel(String imgFileName) {
        loadImage(imgFileName);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null && loaded)
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        else
            g.drawString("Bez obrazka", 10, getHeight() - 10);
    }

    private void loadImage(String imgFileName) {
        img = Toolkit.getDefaultToolkit().getImage(imgFileName);// сохраняет картинку должным образом
        MediaTracker mt = new MediaTracker(this);//прослеживания процесса загрузки
        mt.addImage(img, 1) ;
        try {
            mt.waitForID(1);// wait for dowload img
        } catch (InterruptedException exc) {
        }
        int w = img.getWidth(this); // szerokość obrazka
        int h = img.getHeight(this); // wysokość obrazka
        if (w != -1 && w != 0 && h != -1 && h != 0) {
            loaded = true;
            setPreferredSize(new Dimension(w, h));// измерение
        } else
            setPreferredSize(new Dimension(200, 200));
    }

}

