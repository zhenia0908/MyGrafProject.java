import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class MyGrafProject implements ActionListener{


    public static void main(String[] args) {

        JFrame frame = new JFrame("My class project");//создание окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//штука, чтобы оно закрывалось
        frame.setSize(650, 300);//размер окна


        LayoutManager lm = new FlowLayout();


        String names[] = {"Minsk", "Hrodna", "Brest"};
        JPanel p = new JPanel();
        p.setLayout(lm);
        JButton b  =  new JButton(names[0]);;
            b.addActionListener(null);
            b.setBackground(Color.YELLOW);
            p.add(b);

        JButton c  =  new JButton(names[1]);;
        c.addActionListener(null);
        c.setBackground(Color.YELLOW);
        p.add(c);

        JButton g  =  new JButton(names[2]);;
        g.addActionListener(null);
        g.setBackground(Color.YELLOW);
        p.add(g);

            frame.add(p);



        JLabel label = new JLabel("Zabytki architektury w różnych miastach Białorusi", SwingConstants.CENTER);
        frame.add(label, BorderLayout.NORTH);
        Font font = new Font("Arial", Font.BOLD, 25);
        label.setFont(font);
        label.setBorder(BorderFactory.createLineBorder(Color.black));


        frame.setVisible(true);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setBackground(Color.CYAN);
                new ImagePanelTest("src/krasnyj-kostel.jpg");
                JLabel l  = new JLabel("Cerkiew św. Szymona i św. Heleny w Mińsku.");
                frame.add(l,  BorderLayout.SOUTH) ;
                Font font1 = new Font("Arial", Font.BOLD, 15);
                l.setFont(font1);
                frame.setVisible(true);

            }
        });



        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.CYAN);
                new ImagePanelTest("src/Screenshot_6779.jpg");
                JLabel l  = new JLabel("Katedra św. Franciszka Ksawerego");
                Font font1 = new Font("Arial", Font.BOLD, 15);
                l.setFont(font1);


                frame.add(l,  BorderLayout.WEST) ;
                frame.setVisible(true);

            }
        });

        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.setBackground(Color.CYAN);
                new ImagePanelTest("src/dostoprimechatelnosti-bresta.jpg");
                JLabel l  = new JLabel("Twierdza Brzeska ");
                Font font1 = new Font("Arial", Font.BOLD, 15);
                l.setFont(font1);
                frame.add(l,  BorderLayout.EAST) ;
                frame.setVisible(true);

            }
        });
    }


}
