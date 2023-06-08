import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class Enter extends JFrame {
    public Enter(){
        Container c=getContentPane();
        c.setLayout(null);
        Font f =new Font("Poppins",Font.BOLD,20);
        Font f1 =new Font("Poppins",Font.BOLD,25);
        Font f2 =new Font("Poppins",Font.BOLD,40);
        setUndecorated(true);
        JLabel l1 =new JLabel("WELCOME");
        l1.setBounds(50,300,200,20);
        l1.setForeground(Color.WHITE);
        l1.setFont(f1);
        c.add(l1);
        JLabel l2 =new JLabel("TO");
        l2.setBounds(50,330,200,20);
        l2.setForeground(Color.WHITE);
        l2.setFont(f1);
        c.add(l2);
        //ImageIcon img5 =new ImageIcon("D:\\java\\project\\images\\oie_575127LFaDLsR.png");
        JLabel l3 =new JLabel("STOCK MARKET");
        l3.setBounds(50,360,350,35);
        //l3.setIcon(img5);
        l3.setForeground(Color.YELLOW);
        l3.setFont(f2);
        c.add(l3);

        JButton b1 =new JButton("ENTER");
        b1.setBounds(800,500, 150,50);
        b1.setFocusPainted(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.setFont(f);

        b1.setOpaque(false);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
        Stockframe root = new Stockframe();

        root.setTitle("STOCK DATA");
        root.setSize(1920,1080);
        root.setVisible(true);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setLayout(null);
         dispose();
            }
        });
        c.add(b1);
        ImageIcon img =new ImageIcon("D:\\REAL TIME DATA EXTRACTION\\images\\istockphoto-1304628896-170667a.jpg");
        JLabel label =new JLabel();
        label.setBounds(0, 0, 1000, 600);
        label.setIcon(img);
        c.add(label);

    }

}
