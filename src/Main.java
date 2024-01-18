import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Main {
    public void painComponent(Graphics g){
        Image image = new ImageIcon("krasnyj-kostel.jpg").getImage();
        g.drawImage(image, 10, 19, null);
    }
    public  void display() throws IOException {
        BufferedImage image = ImageIO.read(new File("src/krasnyj-kostel.jpg"));
        ImageIcon image1 = new ImageIcon(image);
        JFrame frame = new JFrame("My first window");
        frame.setLayout(new FlowLayout());
        frame.setSize(700, 600);
        JLabel label = new JLabel();
        label.setIcon(image1);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)throws Exception {
        Main main = new Main();
        JFrame frame = new JFrame("My first window");//создание окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//штука, чтобы оно закрывалось
        frame.setSize(700, 600);//размер окна

        JButton button = new JButton("Push me!");//делает кнопку

       // JTextField result = new JTextField(100);//создает текстовое поле, в скобках количество символов, которое поле в себя вмещает
      //  result.setEditable(false);//значит, что не изменяется


        //button.addActionListener( e -&gt; JOptionPane.showMessageDialog(frame, "Кнопка нажата!"));
        frame.getContentPane().add(button, BorderLayout.SOUTH);//getContentPane()так и не поняла в чем прикол этой штуки
        button.setBackground(Color.YELLOW);// красит кнопку в желтый
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);




        frame.add(button, BorderLayout.SOUTH); // добавляет кнопку в окно (юг, это как я понимаю внизу)

        JLabel label = new JLabel("Zabytki architektury w różnych miastach Białorusi",  SwingConstants.CENTER);//текст делает
        frame.add(label, BorderLayout.NORTH);//ставит его вверх, FlowLayout- по краям или в центре BorderLayout-друг за другом
        Font font = new Font("Arial", Font.BOLD, 25);
        label.setFont(font);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
      //  JFormattedTextField textField = new JFormattedTextField(defaultFormatter);;
       // textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.setVisible(true);// штука, чтобы окно было видимым
        frame.paintComponents(frame.getGraphics());
    }
}
