import javax.swing.JFrame;

import java.awt.Container;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mutualfunds extends JFrame {
     /**
       **  TOP PERFORMING CATEGORIES !
      */
    
      //LONG TERM
public static String getData() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table1.mctable1 tr"))
               {
               if(row.select("td[width=40%]>span.robo_medium>span.mob-hide>a[href]").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=40%]>span.robo_medium>span.mob-hide>a[href]").text();
                   br.append("  "+" "+name+"<br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData0() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table1.mctable1 tr"))
               {
               if(row.select(".tbl_greentxt").text().equals("")){
                   continue;
               }else{
                   String lastprice = row.select(".tbl_greentxt").get(0).text();
                   //String lastprice1 = row.select(".tbl_redtxt").text();
                   
                   br.append("<font color=green>"+lastprice+"</font><br><br>");
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData1() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table1.mctable1 tr"))
               {
               if(row.select(".tbl_greentxt").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".tbl_greentxt").get(1).text();
                   br.append("<font color=green>"+name+"</font><br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 //SHORT TERM
 public static String getData2() throws IOException
 {
    StringBuffer br =new StringBuffer();
    br.append("<html>"+
    "<body>");
    String url="https://www.moneycontrol.com/mutualfundindia/";
    Document doc= Jsoup.connect(url).get();
        try
        {
             for(Element row:doc.select("#table2.mctable1 tr"))
             {
             if(row.select("td[width=40%]>span.robo_medium>a[href]").text().equals("")){
                 continue;
             }else{
                 String name = row.select("td[width=40%]>span.robo_medium>a[href]").text();
                 br.append("  "+" "+name+"<br><br>"); 
             }
             }  
        }
        catch (Exception e1)
        {
            System.out.println("Error"+e1);
        }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData3() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table1.mctable1 tr"))
               {
               if(row.select(".tbl_greentxt").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".tbl_greentxt").get(1).text();
                   br.append("<font color=red> "+name+"</font><br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData4() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table2.mctable1 tr"))
               {
               if(row.select(".tbl_greentxt").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".tbl_greentxt").get(0).text();
                   br.append("<font color=green> "+name+"</font><br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 /**
  * 
  * INDICES PERFORMACES
  * 
  */
 public static String getData5() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table3.mctable1 tr"))
               {
               if(row.select(".robo_medium").text().equals("")){
                   continue;
               }else{
                   String name = row.select("a[href]").text();
                   br.append("  "+" "+name+"<br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData6() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table3.mctable1 tr"))
               {
               if(row.select(".tbl_greentxt").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".tbl_greentxt").get(0).text();
                   br.append("<font color=green> "+name+"</font><br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData7() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table3.mctable1 tr"))
               {
               if(row.select(".tbl_greentxt").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".tbl_greentxt").get(1).text();
                   br.append("<font color=green> "+name+"</font><br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 //SHORT TERM
 public static String getData8() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table4.mctable1 tr"))
               {
               if(row.select(".robo_medium").text().equals("")){
                   continue;
               }else{
                   String name = row.select("a[href]").text();
                   br.append("  "+" "+name+"<br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData9() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table4.mctable1 tr"))
               {
               if(row.select(".tbl_redtxt").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".tbl_redtxt").get(0).text();
                   br.append("<font color=red> "+name+"</font><br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 public static String getData10() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/mutualfundindia/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#table4.mctable1 tr"))
               {
               if(row.select(".tbl_greentxt").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".tbl_greentxt").get(0).text();
                   br.append("<font color=green> "+name+"</font><br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }
 

 //BONDS WINDOW LAYOUT
 public mutualfunds() 
 {

     Container c = getContentPane();
     c.setLayout(null);
     Font f =new Font("Poppins",Font.BOLD,25);
     Font f1 =new Font("Poppins",Font.BOLD,30);
     Font f2 =new Font("Poppins",Font.BOLD,18);
     Font f3 =new Font("Poppins",Font.BOLD,20);
     
     JPanel panel =new JPanel();
     panel.setLayout(null);
     panel.setBounds(0, 0, 300, 1080);
     panel.setBackground(new ColorUIResource(58,16,97));

     ImageIcon img8 =new ImageIcon("D:\\java\\project\\images\\icons8-menu-30.png");
        JLabel l4 =new JLabel();
        l4.setBounds(30, 100, 300,50);
        l4.setIcon(img8);
        panel.add(l4);


    ImageIcon img7=new ImageIcon("D:\\java\\project\\images\\icons8-youtube-live-48.png");
    JLabel l1=new JLabel("MUTUAL FUNDS");
    l1.setIcon(img7);
    l1.setFont(f1);
    l1.setBounds(10, 0,300 ,100);
    l1.setBackground(new ColorUIResource(25,25,112));
    l1.setForeground(Color.GREEN);

    JLabel l2=new JLabel("TOP PERFORMING CATEGORIES");
    l2.setFont(f1);
    l2.setForeground(Color.YELLOW);
    l2.setBounds(900, 0, 1000,50);
    c.add(l2);

    JLabel l3=new JLabel("LONG TERM");
    l3.setFont(f);
    l3.setForeground(Color.WHITE);
    l3.setBounds(650, 60, 790,50);
    c.add(l3);

    JLabel l5=new JLabel("SHORT TERM");
    l5.setFont(f);
    l5.setForeground(Color.WHITE);
    l5.setBounds(1450, 60, 790,50);
    c.add(l5);

    JLabel l6=new JLabel("LONG TERM");
    l6.setFont(f);
    l6.setForeground(Color.WHITE);
    l6.setBounds(650, 600, 790,50);
    c.add(l6);

    JLabel l7=new JLabel("SHORT TERM");
    l7.setFont(f);
    l7.setForeground(Color.WHITE);
    l7.setBounds(1450, 600, 790,50);
    c.add(l7);

    JLabel l8=new JLabel("INDICES PERFORMANCES");
    l8.setFont(f1);
    l8.setForeground(Color.YELLOW);
    l8.setBounds(950, 550, 1000,50);
    c.add(l8);

    //TABLE DATA 
    /**
     * LONG TERM TABLES
     */
    JTable table =new JTable();
    Object[] columns ={"Company Name","2 Year","5 Year"};
    DefaultTableModel model = new DefaultTableModel();

    model.setColumnIdentifiers(columns);
    table.setModel(model);
    table.setBackground(Color.BLACK);
    table.setForeground(Color.WHITE);
    table.setFont(f2);
    
    table.setBounds(310, 100, 790, 400);
    table.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
    //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table.getColumnModel().getColumn(0).setPreferredWidth(500);
    table.getColumnModel().getColumn(1).setPreferredWidth(100);
    table.setAutoCreateRowSorter(true);
    table.getTableHeader().setFont(f3);
    table.getTableHeader().setOpaque(true);
    
    //SCROLL PANE
    JScrollPane pane= new JScrollPane(table);
    pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    pane.setForeground(Color.RED);
    pane.setBounds(310, 105, 790, 400);
    c.add(pane);
    Object[] row =new Object[3];

    JTable table2 =new JTable();
    Object[] columns2 ={"Company Name","2 Year","5 Year"};
    DefaultTableModel model2 = new DefaultTableModel();

    model2.setColumnIdentifiers(columns2);
    table2.setModel(model2);
    table2.setBackground(Color.BLACK);
    table2.setForeground(Color.WHITE);
    table2.setFont(f2);
    
    table2.setBounds(310, 100, 790, 400);
    table2.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
    //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table2.getColumnModel().getColumn(0).setPreferredWidth(500);
    table2.getColumnModel().getColumn(1).setPreferredWidth(100);
    table2.setAutoCreateRowSorter(true);
    table2.getTableHeader().setFont(f3);
    table2.getTableHeader().setOpaque(true);
    
    //SCROLL PANE
    JScrollPane pane2= new JScrollPane(table2);
    pane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    pane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    pane2.setForeground(Color.RED);
    pane2.setBounds(310, 650, 790, 400);
    c.add(pane2);
    Object[] row2 =new Object[3];
 
    

    //BUTTONS
    //LONG TERM BUTTON
    ImageIcon img1=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
    JButton b1 = new JButton("LONGTERM");
    b1.setIcon(img1);
    b1.setFont(f);
    b1.setFocusPainted(false);
    b1.setBounds(20, 150,200,100);
    b1.setMargin(new InsetsUIResource(0, 0, 0, 0));
    b1.setContentAreaFilled(false);
    b1.setBorderPainted(false);
    b1.setOpaque(false);
    b1.setForeground(Color.WHITE);
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            table.setRowHeight(1500);
            table2.setRowHeight(600);
            try {
                row[0]=getData();
                row[1]=getData0();
                row[2]=getData1();
                row2[0]=getData5();
                row2[1]=getData6();
                row2[2]=getData7();
              } catch (Exception e1) {   
                e1.printStackTrace();
              }
              model.addRow(row);
              model2.addRow(row2);
        }
        });
    // SHORT TERN TABLE
    JTable table1 =new JTable();
    Object[] columns1 ={"Company Name","1 Month","6 Month"};
    DefaultTableModel model1 = new DefaultTableModel(); 

    model1.setColumnIdentifiers(columns1);
    table1.setModel(model1);
    table1.setBackground(Color.BLACK);
    table1.setForeground(Color.WHITE);
    table1.setFont(f2);
    
    table1.setBounds(1100, 150, 790, 400);
    table1.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
    //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table1.getColumnModel().getColumn(0).setPreferredWidth(500);
    table1.getColumnModel().getColumn(1).setPreferredWidth(100);
    table1.setAutoCreateRowSorter(true);
    table1.getTableHeader().setFont(f3);
    table1.getTableHeader().setOpaque(true);
    
    //SCROLL PANE
    JScrollPane pane1= new JScrollPane(table1);
    pane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    pane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    pane1.setForeground(Color.RED);
    pane1.setBounds(1100, 105, 790, 400);
    c.add(pane1);
    Object[] row1 =new Object[3];

    JTable table3 =new JTable();
    Object[] columns3 ={"Company Name","1 Month","6 Month"};
    DefaultTableModel model3 = new DefaultTableModel();

    model3.setColumnIdentifiers(columns3);
    table3.setModel(model3);
    table3.setBackground(Color.BLACK);
    table3.setForeground(Color.WHITE);
    table3.setFont(f2);
    
    table3.setBounds(1100, 150, 790, 400);
    table3.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
    //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table3.getColumnModel().getColumn(0).setPreferredWidth(500);
    table3.getColumnModel().getColumn(1).setPreferredWidth(100);
    table3.setAutoCreateRowSorter(true);
    table3.getTableHeader().setFont(f3);
    table3.getTableHeader().setOpaque(true);
    
    //SCROLL PANE
    JScrollPane pane3= new JScrollPane(table3);
    pane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    pane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    pane3.setForeground(Color.RED);
    pane3.setBounds(1100, 650, 790, 400);
    c.add(pane3);
    Object[] row3 =new Object[3];

    // SHORT TERM BUTTON
    ImageIcon img2=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
    JButton b2 = new JButton("SHORTTERM");
    b2.setIcon(img2);
    b2.setFont(f);
    b2.setFocusPainted(false);
    b2.setBounds(30, 250,200,100);
    b2.setMargin(new InsetsUIResource(0, 0, 0, 0));
    b2.setContentAreaFilled(false);
    b2.setBorderPainted(false);
    b2.setOpaque(false);
    b2.setForeground(Color.WHITE);
    b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            table1.setRowHeight(1500);
            table3.setRowHeight(600);
            try {
                row1[0]=getData2();
                row1[1]=getData3();
                row1[2]=getData4(); 
                row3[0]=getData8();
                row3[1]=getData9();
                row3[2]=getData10();
              } catch (Exception e1) {   
                e1.printStackTrace();
              }
              model1.addRow(row1);
              model3.addRow(row3);
        }
        });
  //delete button
    ImageIcon img3=new ImageIcon("D:\\java\\project\\images\\icons8-back-arrow-48.png");
    JButton delete = new JButton("");
    delete.setFont(f);
    delete.setIcon(img3);
    delete.setFocusPainted(false);
    delete.setBounds(-10,900,150,150);
    delete.setMargin(new InsetsUIResource(0, 0, 0, 0));
    delete.setContentAreaFilled(false);
    delete.setBorderPainted(false);
    delete.setOpaque(false);
    delete.setForeground(Color.WHITE);
    delete.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        int i = table.getSelectedRow();
        if(i<=0){
          model.removeRow(i);
          model1.removeRow(i);
          model2.removeRow(i);
          model3.removeRow(i);
        }else{
          JOptionPane.showMessageDialog(c,"DeleteError");
        }
        }
        });

     c.add(panel);
     panel.add(l1);
     panel.add(b1);
     panel.add(b2);
     panel.add(delete);

}
    
}
