import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.InsetsUIResource;
//import  org.kordamp.ikonli.swing.FontIcon;
//import org.kordamp.ikonli.antdesignicons.AntDesignIconsFilled;
//import org.kordamp.ikonli.antdesignicons.AntDesignIconsOutlined;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.*;

public class Stockframe extends JFrame  {
    JPanel panel;

    public Stockframe(){


        Container c=getContentPane();
        c.setLayout(null);
        Font f =new Font("Poppins",Font.BOLD,25);
        Font f2 =new Font("Poppins",Font.BOLD,20);
        //panel design
        ImageIcon img3 =new ImageIcon("D:\\java\\project\\images\\icons8-menu-30.png");
        JLabel l5 =new JLabel();
        l5.setBounds(30, 30, 300,50);
        l5.setIcon(img3);

        ImageIcon img5 =new ImageIcon("D:\\java\\project\\images\\oie_575127LFaDLsR.png");
        JLabel dLabel2 =new JLabel("STOCK MARKET");//STOCK MARKET
         dLabel2.setFont(f);
         dLabel2.setIcon(img5);
         dLabel2.setForeground(Color.WHITE);
         dLabel2.setBounds(5, 0, 300, 100);
         dLabel2.setBackground(new ColorUIResource(128,0,128));

         ImageIcon img1 =new ImageIcon("D:\\java\\project\\images\\icons8-home-30.png");

         JLabel dLabel3 =new JLabel("HOME");//HOMEPAGE
         dLabel3.setFont(f2);
         dLabel3.setIcon(img1);
         dLabel3.setForeground(Color.WHITE);
         dLabel3.setBounds(30, 100, 300, 50);
         dLabel3.setBackground(new ColorUIResource(148,0,211));

         ImageIcon img2=new ImageIcon("D:\\java\\project\\images\\icons8-bull-market-30.png");
         JButton market =new JButton("\t\t\nMARKET");
         market.setFont(f2);
        market.setFocusPainted(false);
        market.setIcon(img2);
        market.setBounds(-60,140,300,100);
        market.setMargin(new InsetsUIResource(0, 0, 0, 0));
        market.setContentAreaFilled(false);
        market.setBorderPainted(false);
        market.setOpaque(false);
        market.setForeground(Color.WHITE);
        ActionListener listener =new Action();
        market.addActionListener(listener);

        ImageIcon img11=new ImageIcon("D:\\java\\project\\images\\icons8-bank-35.png");
        JButton funds =new JButton("MUTUAL FUNDS");
        funds.setFont(f2);
        funds.setFocusPainted(false);
        funds.setIcon(img11);
        funds.setBounds(-25,210,300,100);
        funds.setMargin(new InsetsUIResource(0, 0, 0, 0));
        funds.setContentAreaFilled(false);
        funds.setBorderPainted(false);
        funds.setOpaque(false);
        funds.setForeground(Color.WHITE);
        ActionListener listener1 =new Action1();
        funds.addActionListener(listener1);

        ImageIcon img4=new ImageIcon("D:\\java\\project\\images\\icons8-currency-35.png");
        JButton currency =new JButton("CURRENCIES");
        currency.setFont(f2);
        currency.setFocusPainted(false);
        currency.setIcon(img4);
        currency.setBounds(-35,280,300,100);
        currency.setMargin(new InsetsUIResource(0, 0, 0, 0));
        currency.setContentAreaFilled(false);
        currency.setBorderPainted(false);
        currency.setOpaque(false);
        currency.setForeground(Color.WHITE);
        ActionListener listener6 =new Action6();
        currency.addActionListener(listener6);

        ImageIcon img12=new ImageIcon("D:\\java\\project\\images\\icons8-btc,-bitcoin-cryptocurrency-electronic-cash-logotype-layout-30.png");
        JButton crypto =new JButton("CRYPTOCURRENCY");
        crypto.setFont(f2);
        crypto.setFocusPainted(false);
        crypto.setIcon(img12);
        crypto.setBounds(-10,350,300,100);
        crypto.setMargin(new InsetsUIResource(0, 0, 0, 0));
        crypto.setContentAreaFilled(false);
        crypto.setBorderPainted(false);
        crypto.setOpaque(false);
        crypto.setForeground(Color.WHITE);
        ActionListener listener7 =new Action7();
        crypto.addActionListener(listener7);


        ImageIcon img10=new ImageIcon("D:\\java\\project\\images\\icons8-overview-40.png");
        JButton Overviw=new JButton("GET OVERVIEW");
        Overviw.setFont(f2);
        Overviw.setFocusPainted(false);
        Overviw.setIcon(img10);
        Overviw.setBounds(1600,0,300,100);
        Overviw.setContentAreaFilled(false);
        Overviw.setBorderPainted(false);
        Overviw.setOpaque(false);
        Overviw.setForeground(Color.WHITE);
        Overviw.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                overview ov=new overview();
                ov.setVisible(true);
                ov.setBounds(0,0,1920,1080);
                Color c =new Color(0,0,0);
        Container con= ov.getContentPane();
        con.setBackground(c);
            }

         });

        ImageIcon img6=new ImageIcon("D:\\java\\project\\images\\button (1) (1).png");
        JButton active =new JButton();
        active.setFont(f);
        active.setFocusPainted(false);
        active.setIcon(img6);
        active.setBounds(384, 700,300,200);
        active.setMargin(new InsetsUIResource(0, 0, 0, 0));
        active.setBackground(new ColorUIResource(156,194,229));
        active.setForeground(Color.WHITE);
        active.setContentAreaFilled(false);
        active.setOpaque(false);
        active.setBorderPainted(false);
        ActionListener listener2 =new Action2();
        active.addActionListener(listener2);

        ImageIcon img7=new ImageIcon("D:\\java\\project\\images\\button (2) (1).png");
        JButton topgain =new JButton();
        topgain.setFont(f);
        topgain.setIcon(img7);
        topgain.setFocusPainted(false);
        topgain.setBounds(768, 700,300,200);
        topgain.setMargin(new InsetsUIResource(0, 0, 0, 0));
        topgain.setBackground(new ColorUIResource(156,194,229));
        topgain.setForeground(Color.WHITE);
        topgain.setContentAreaFilled(false);
        topgain.setOpaque(false);
        topgain.setBorderPainted(false);
        ActionListener listener3 =new Action3();
        topgain.addActionListener(listener3);

        ImageIcon img8=new ImageIcon("D:\\java\\project\\images\\button (3) (1).png");
        JButton toploser =new JButton();
        toploser.setFont(f);
        toploser.setIcon(img8);
        toploser.setFocusPainted(false);
        toploser.setBounds(1152, 700,300,200);
        toploser.setMargin(new InsetsUIResource(0, 0, 0, 0));
        toploser.setBackground(new ColorUIResource(156,194,229));
        toploser.setForeground(Color.WHITE);
        toploser.setContentAreaFilled(false);
        toploser.setOpaque(false);
        toploser.setBorderPainted(false);
        ActionListener listener4 =new Action4();
        toploser.addActionListener(listener4);

        ImageIcon img9=new ImageIcon("D:\\java\\project\\images\\button (4).png");
        JButton bond =new JButton();
        bond.setFont(f);
        bond.setIcon(img9);
        bond.setFocusPainted(false);
        bond.setBounds(1536, 700,300,200);
        bond.setMargin(new InsetsUIResource(0, 0, 0, 0));
        bond.setBackground(new ColorUIResource(156,194,229));
        bond.setForeground(Color.WHITE);
        bond.setContentAreaFilled(false);
        bond.setOpaque(false);
        bond.setBorderPainted(false);
        ActionListener listener5 =new Action5();
        bond.addActionListener(listener5);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,100,300,1080);
        panel.setBackground(new ColorUIResource(58,16,97));
        //panel.add(dLabel2);
        panel.add(dLabel3);
        panel.add(market);
        panel.add(funds);
        panel.add(currency);
        panel.add(crypto);
        panel.add(l5);
        c.add(panel);
        c.add(Overviw);
        c.add(active);
        c.add(topgain);
        c.add(toploser);
        c.add(bond);


        JPanel panel2 =new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(300, 0, 1620, 100);
        panel2.setBackground(new ColorUIResource(106,90,205));
        c.add(panel2);

        JPanel panel4 =new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(0, 0, 300, 100);
        panel4.setBackground(new ColorUIResource(45,11,56));
        c.add(panel4);
        panel4.add(dLabel2);

        ImageIcon img=new ImageIcon("gettyimages-998895472_1200xx4000-2250-0-0.jpg");

        JLabel l3=new JLabel();
        l3.setBounds(0, 0, 1620, 980);
        l3.setIcon(img);

        JPanel panel3 =new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(300, 100, 1620, 980);
        panel3.setBackground(new ColorUIResource(0,0,0));
        c.add(panel3);
        panel3.add(l3);
        //panel3.add(dLabel2);
    }

    static class Action implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        market mk;
        try {
            mk = new market();
            mk.setVisible(true);
        mk.setBounds(0, 0, 1280, 720);
        Color c =new Color(0,0,0);
   Container con= mk.getContentPane();
    con.setBackground(c);
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }
}
    static class Action1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        mutualfunds mf;
        mf = new mutualfunds();
        mf.setVisible(true);
      mf.setBounds(0, 0, 1280, 720);
      Color c =new Color(0,0,0);
   Container con= mf.getContentPane();
   con.setBackground(c);

    }
}

    static class Action2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             mostactive mv;
            try {
                mv = new mostactive();
                mv.setVisible(true);
             mv.setBounds(0, 0, 1280, 720);
             Color c =new Color(0,0,0);
             Container con= mv.getContentPane();
             con.setBackground(c);
            } catch (IOException e1) {

                e1.printStackTrace();
            }

        }

    }
    static class Action3 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             topgainers tg=new topgainers();
             tg.setVisible(true);
             tg.setBounds(0, 0, 1280, 720);
             Color c =new Color(0,0,0);
             Container con= tg.getContentPane();
             con.setBackground(c);
        }

    }
    static class Action4 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             toploser tl=new toploser();
             tl.setVisible(true);
             tl.setBounds(0, 0, 1280, 720);
             Color c =new Color(0,0,0);
             Container con= tl.getContentPane();
             con.setBackground(c);
        }

    }
    static class Action5 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
             bond bd = new bond();
             bd.setVisible(true);
             bd.setBounds(0, 0, 1280, 720);
             Color c =new Color(0,0,0);
             Container con= bd.getContentPane();
             con.setBackground(c);
        }
    }
    static class Action6 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
             currencies cr;
            try {
                cr = new currencies();
                cr.setVisible(true);
             cr.setBounds(0, 0, 1280, 720);
             Color c =new Color(0,0,0);
             Container con= cr.getContentPane();
             con.setBackground(c);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }
    }
    static class Action7 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
             crypto cy = new crypto();
             cy.setVisible(true);
             cy.setBounds(0, 0, 1280, 720);
             Color c =new Color(0,0,0);
             Container con= cy.getContentPane();
             con.setBackground(c);
        }
    }

}
