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

public class crypto extends JFrame{
    public static String getData00() throws IOException
{
     StringBuffer br =new StringBuffer();
     br.append("<html>"+"<body>");
     br.append("<font color=yellow>NATIONAL STOCK EXCHANGE OF INDIA.LTD</font>");
     br.append("</body>"+"</html>");
    return br.toString();
}
public static String getData() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://finance.yahoo.com/cryptocurrencies?count=100&offset=0";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#scr-res-table tr"))
               {
               if(row.select("[aria-label=Name]").text().equals("")){
                   continue;
               }else{
                   String name = row.select("[aria-label=Name]").text();
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
      String url="https://finance.yahoo.com/cryptocurrencies?count=100&offset=0";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#scr-res-table tr"))
               {
               if(row.select("[aria-label=Price (Intraday)]").text().equals("")){
                   continue;
               }else{
                   String lastprice = row.select("[aria-label=Price (Intraday)]").text();
                   
                   br.append(lastprice+"<br><br>");
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
      String url="https://finance.yahoo.com/cryptocurrencies?count=100&offset=0";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#scr-res-table tr"))
               {
               if(row.select("[aria-label=Change]").text().equals("")){
                   continue;
               }else{
                   String name = row.select("[aria-label=Change]").text();
                   
                   br.append(name+"<br><br>"); 
               }
               }  
          }
          catch (Exception e1)
          {
              System.out.println("Error"+e1);
          }
          br.append("</body>"+"</html>");
     return br.toString();
 }public static String getData2() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://finance.yahoo.com/cryptocurrencies?count=100&offset=0";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#scr-res-table tr"))
               {
               if(row.select("[aria-label=% Change]").text().equals("")){
                   continue;
               }else{
                   String name = row.select("[aria-label=% Change]").text();
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
      String url="https://finance.yahoo.com/cryptocurrencies?count=100&offset=0";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#scr-res-table tr"))
               {
               if(row.select("[aria-label=Market Cap]").text().equals("")){
                   continue;
               }else{
                   String name = row.select("[aria-label=Market Cap]").text();
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
 public static String getData4() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://finance.yahoo.com/cryptocurrencies?count=100&offset=0";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#scr-res-table tr"))
               {
               if(row.select("[aria-label=Volume in Currency (24Hr)]").text().equals("")){
                   continue;
               }else{
                   String name = row.select("[aria-label=Volume in Currency (24Hr)]").text();
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
 public static String getData5() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://finance.yahoo.com/cryptocurrencies?count=100&offset=0";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select("#scr-res-table tr"))
               {
               if(row.select("[aria-label=Circulating Supply]").text().equals("")){
                   continue;
               }else{
                   String name = row.select("[aria-label=Circulating Supply]").text();
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
 

 //BONDS WINDOW LAYOUT
 public crypto() 
 {

     Container c = getContentPane();
     c.setLayout(null);
     Font f =new Font("Poppins",Font.BOLD,25);
     
     Font f2 =new Font("Poppins",Font.BOLD,25);
     Font f3 =new Font("Poppins",Font.BOLD,20);
     
     JPanel panel =new JPanel();
     panel.setLayout(null);
     panel.setBounds(0, 0, 1920, 100);
     panel.setBackground(new ColorUIResource(58,16,97));

     ImageIcon img8 =new ImageIcon("D:\\java\\project\\images\\icons8-menu-30.png");
        JLabel l4 =new JLabel();
        l4.setBounds(30, 100, 300,50);
        l4.setIcon(img8);
        panel.add(l4);

    JLabel l2=new JLabel();
    l2.setFont(f);
    l2.setBounds(800, 0, 1000,100);
    c.add(l2);

    //TABLE DATA
    JTable table =new JTable();
    Object[] columns ={" Name"," Price(Intraday)","Change","%Change","Market Cap","Volume in Currency(24Hr)","Circulating supply"};
    DefaultTableModel model = new DefaultTableModel();

    model.setColumnIdentifiers(columns);
    table.setModel(model);
    table.setBackground(Color.BLACK);
    table.setForeground(Color.WHITE);
    table.setFont(f2);
    
    table.setBounds(310, 100, 1590, 955);
    table.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
    //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table.getColumnModel().getColumn(0).setPreferredWidth(180);
    table.getColumnModel().getColumn(1).setPreferredWidth(100);
    table.setAutoCreateRowSorter(true);
    table.getTableHeader().setFont(f3);
    table.getTableHeader().setOpaque(true);
    
    //SCROLL PANE
    JScrollPane pane= new JScrollPane(table);
    pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    pane.setForeground(Color.RED);
    pane.setBounds(0, 100, 1920, 955);
    c.add(pane);
    Object[] row =new Object[11];

    //BUTTONS
    //NSE
    ImageIcon img1=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
    JButton b1 = new JButton("CRYPTOCURRENCY RESULT LIST");
    b1.setIcon(img1);
    b1.setFont(f);
    b1.setFocusPainted(false);
    b1.setBounds(0, 0,500,100);
    b1.setMargin(new InsetsUIResource(0, 0, 0, 0));
    b1.setContentAreaFilled(false);
    b1.setBorderPainted(false);
    b1.setOpaque(false);
    b1.setForeground(Color.WHITE);
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            table.setRowHeight(6700);
            try {
                row[0]=getData();
                row[1]=getData0();
                row[2]=getData1();
                row[3]=getData2();
                row[4]=getData3();
                row[5]=getData4();
                row[6]=getData5();
              } catch (Exception e1) {   
                e1.printStackTrace();
              }
              
              model.addRow(row);
        }
        });
       
  //delete button
    ImageIcon img3=new ImageIcon("D:\\java\\project\\images\\icons8-back-arrow-48.png");
    JButton delete = new JButton("BACK");
    delete.setFont(f);
    delete.setIcon(img3);
    delete.setFocusPainted(false);
    delete.setBounds(1720,0,150,100);
    delete.setMargin(new InsetsUIResource(0, 0, 0, 0));
    delete.setContentAreaFilled(false);
    delete.setBorderPainted(false);
    delete.setOpaque(false);
    delete.setForeground(Color.WHITE);
    delete.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        l2.setText(null);
        
        int i = table.getSelectedRow();
        if(i<=0){
          model.removeRow(i);
        }else{
          JOptionPane.showMessageDialog(c,"DeleteError");
        }
        }
        });

     c.add(panel);
     
     panel.add(b1);
     
     panel.add(delete);

}
}
