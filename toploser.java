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

public class toploser extends JFrame{
    //NSE**NATIONAL STOCK EXCHANGE
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".PR>span.gld13.disin>a[href]").text();
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String lastprice = row.select(".red[width=45]").text();
                   
                   br.append("<font color=red>"+lastprice+"</font><br><br>");
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].30d").text();
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
 }public static String getData2() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].50d").text();
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more//";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].150d").text();
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].200d").text();
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].pe").text();
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].pb").text();
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
 public static String getData7() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].uc").text();
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
 public static String getData8() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].lc").text();
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
      String url="https://www.moneycontrol.com/stocks/marketstats/nse-loser/all-companies_-2/more/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].vwap").text();
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
 //BSE**BOMBAY STOCK EXCHANGE//
 public static String getData000() throws IOException
{
     StringBuffer br =new StringBuffer();
     br.append("<html>"+"<body>");
     br.append("<font color=yellow>BOMBAY STOCK EXCHANGE OF INDIA.LTD</font>");
     br.append("</body>"+"</html>");
    return br.toString();
}
 public static String getData10() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select(".PR>span.gld13.disin>a[href]").text();
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
 public static String getData11() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td.red[width=45]").text();
                   
                   br.append("<font color=red>"+name+"</font><br><br>"); 
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
 public static String getData12() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].30d").text();
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
 public static String getData13() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].50d").text();
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
 public static String getData14() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].150d").text();
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
 public static String getData15() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].200d").text();
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
 public static String getData16() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].pe").text();
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
 public static String getData17() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].pb").text();
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
 public static String getData18() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].uc").text();
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
 public static String getData19() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].lc").text();
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
 public static String getData20() throws IOException
 {
      StringBuffer br =new StringBuffer();
      br.append("<html>"+
      "<body>");
      String url="https://www.moneycontrol.com/stocks/marketstats/bse-loser/all-companies_-1/";
      Document doc= Jsoup.connect(url).get();
          try
          {
               for(Element row:doc.select(".bsr_table.hist_tbl_hm tr"))
               {
               if(row.select(".PR").text().equals("")){
                   continue;
               }else{
                   String name = row.select("td[width=130].vwap").text();
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
 public toploser() 
 {

     Container c = getContentPane();
     c.setLayout(null);
     Font f =new Font("Poppins",Font.BOLD,25);
     Font f1 =new Font("Poppins",Font.BOLD,30);
     Font f2 =new Font("Poppins",Font.BOLD,25);
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
    JLabel l1=new JLabel("TOPLOSER");
    l1.setIcon(img7);
    l1.setFont(f1);
    l1.setBounds(35, 0,300 ,100);
    l1.setBackground(new ColorUIResource(25,25,112));
    l1.setForeground(Color.GREEN);

    JLabel l2=new JLabel();
    l2.setFont(f);
    l2.setBounds(800, 0, 1000,100);
    c.add(l2);

    //TABLE DATA
    JTable table =new JTable();
    Object[] columns ={"Company Name","Last Price","30DMA","50DMA","150DMA","200DMA","P/E","P/B","UC limit","LC limit","VWAP"};
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
    pane.setBounds(310, 100, 1590, 955);
    c.add(pane);
    Object[] row =new Object[11];

    //BUTTONS
    //NSE
    ImageIcon img1=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
    JButton b1 = new JButton("NSE");
    b1.setIcon(img1);
    b1.setFont(f);
    b1.setFocusPainted(false);
    b1.setBounds(0, 150,150,100);
    b1.setMargin(new InsetsUIResource(0, 0, 0, 0));
    b1.setContentAreaFilled(false);
    b1.setBorderPainted(false);
    b1.setOpaque(false);
    b1.setForeground(Color.WHITE);
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            table.setRowHeight(14005);
            try {
                row[0]=getData();
                row[1]=getData0();
                row[2]=getData1();
                row[3]=getData2();
                row[4]=getData3();
                row[5]=getData4();
                row[6]=getData5();
                row[7]=getData6();
                row[8]=getData7();
                row[9]=getData8();
                row[10]=getData9();
                
              } catch (Exception e1) {   
                e1.printStackTrace();
              }
              try {
                l2.setText(getData00());
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
              model.addRow(row);
        }
        });
        ImageIcon img2=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
    JButton b2 = new JButton("BSE");
    b2.setIcon(img2);
    b2.setFont(f);
    b2.setFocusPainted(false);
    b2.setBounds(0, 250,150,100);
    b2.setMargin(new InsetsUIResource(0, 0, 0, 0));
    b2.setContentAreaFilled(false);
    b2.setBorderPainted(false);
    b2.setOpaque(false);
    b2.setForeground(Color.WHITE);
    b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            table.setRowHeight(1000);
            try {
                row[0]=getData10();
                row[1]=getData11();
                row[2]=getData12();
                row[3]=getData13();
                row[4]=getData14();
                row[5]=getData15();
                row[6]=getData16();
                row[7]=getData17();
                row[8]=getData18();
                row[9]=getData19();
                row[10]=getData20();
                
              } catch (Exception e1) {   
                e1.printStackTrace();
              }
              try {
                l2.setText(getData000());
            } catch (IOException e1)
            {
                e1.printStackTrace();
            }
              model.addRow(row);
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
     panel.add(l1);
     panel.add(b1);
     panel.add(b2);
     panel.add(delete);

}
    
}
