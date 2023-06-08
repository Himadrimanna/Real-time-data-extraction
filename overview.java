import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import org.jsoup.Jsoup;
//import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
//import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
//import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.JComboBox;

public class overview extends JFrame
{

    public static String getData(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
          Elements elements=doc.select("#mainprice");
          elements.forEach((e) ->
          {
            String text=elements.select("h1").text();
              String text2=e.select(".inid_name>span").text();
              String text3=e.select("#nsecp.inprice1.nsecp").text();
              String text4=e.select("#nsechange.pricupdn.nsechange.grn").text();
              String text5=e.select("#nsechange.pricupdn.nsechange.red").text();
              String text6=e.select(".nseasondate").text();
              br.append("<b><b><font size 50 color=yellow>"+text+"</font></b></b>");
              //br.append("<br><font color=white>------------------------------------------</font>");
              br.append("<br><font color=white>"+text2+"</font>");
              br.append("<br><font color=white>Open price:"+text3+"</font>");
              br.append("<br> <font color=green>"+text4+"</font><font color=red>"+text5+"</font>");

              br.append("<br><font color=white>"+text6+"</font>");
              br.append("<br><font color=white>------------------------------------------</font>");
              br.append("<br><font color=white>Overview </font>");
          });
            br.append("</body>"+"</html>");
            return br.toString();
    }
    public static String getData1(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseopn.bseopn").text().equals("")){
                    continue;
                  }else{
                    String open = row.select(".nseopn.bseopn").text();
                    br.append("<br><font color=white> <b>"+open+"</font></b>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData2(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseprvclose.bseprvclose").text().equals("")){
                    continue;
                  }else{
                    String previousClose = row.select(".nseprvclose.bseprvclose").text();
                    br.append("<br><font color=white>"+previousClose+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData3(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nsevol.bsevol").text().equals("")){
                    continue;
                  }else{
                    String Volume = row.select(".nsevol.bsevol").text();
                    br.append("<br><font color=white> "+Volume+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData4(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nsevalue.bsevalue").text().equals("")){
                    continue;
                  }else{
                    String ValueLacs= row.select(".nsevalue.bsevalue").text();
                    br.append("<br><font color=white>"+ValueLacs+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData5(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                 for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nsevwap.bsevwap").text().equals("")){
                    continue;
                  }else{
                    String VWAP= row.select(".nsevwap.bsevwap").text();
                    br.append("<br><font color=white>"+VWAP+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData6(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                 for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nsebeta").text().equals("")){
                    continue;
                  }else{
                    String Beta = row.select(".nsebeta").text();
                    br.append("<br><font color=white> "+Beta+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData7(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                 for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseHP.bseHP").text().equals("")){
                    continue;
                  }else{
                    String High = row.select(".nseHP.bseHP").text();
                    br.append("<br><font color=white>"+High+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData8(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                 for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseLP.bseLP").text().equals("")){
                    continue;
                  }else{
                    String Low = row.select(".nseLP.bseLP").text();
                    br.append("<br><font color=white>"+Low+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData9(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseupper_circuit_limit.bseupper_circuit_limit").text().equals("")){
                    continue;
                  }else{
                    String UClimit = row.select(".nseupper_circuit_limit.bseupper_circuit_limit").text();
                    br.append("<br><font color=white> "+UClimit+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData10(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nselower_circuit_limit.bselower_circuit_limit").text().equals("")){
                    continue;
                  }else{
                    String LClimit = row.select(".nselower_circuit_limit.bselower_circuit_limit").text();
                    br.append("<br><font color=white>"+LClimit+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData11(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseH52.bseH52").text().equals("")){
                    continue;
                  }else{
                    String weekhigh = row.select(".nseH52.bseH52").text();
                    br.append("<br><font color=white>"+weekhigh+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData12(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseL52.bseL52").text().equals("")){
                    continue;
                  }else{
                    String weeklow= row.select(".nseL52.bseL52").text();
                    br.append("<br><font color=white> "+weeklow+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData13(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                {
                  if(row.select(".nseceps.bseceps").text().equals("")){
                    continue;
                  }else{
                    String TTMEPS = row.select(".nseceps.bseceps").text();
                    br.append("<br><font color=white>"+TTMEPS+"</font>");}}
                  }catch (Exception e1)
                  {
                    System.out.println("Error"+e1);
                  }
                  br.append("</body>"+"</html>");
                  return br.toString();
    }
    public static String getData14(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                    {
                      if(row.select(".nsepe.bsepe").text().equals("")){
                        continue;
                      }else{
                        String TTMPE = row.select(".nsepe.bsepe").text();
                        br.append("<br><font color=white> "+TTMPE+"</font>");}}
                      }catch (Exception e1)
                      {
                        System.out.println("Error"+e1);
                      }
                      br.append("</body>"+"</html>");
                      return br.toString();
        }
        public static String getData15(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                for(Element row:doc.select(".oview_table tr"))
                    {
                      if(row.select(".nsesc_ttm.bsesc_ttm").text().equals("")){
                        continue;
                      }else{
                        String sectorpe = row.select(".nsesc_ttm.bsesc_ttm").text();
                        br.append("<br><font color=white>"+sectorpe+"</font>");}}
                      }catch (Exception e1)
                      {
                        System.out.println("Error"+e1);
                      }
                      br.append("</body>"+"</html>");
                      return br.toString();
        }
        public static String getData16(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                 for(Element row:doc.select(".oview_table tr"))
                    {
                      if(row.select(".nsebv.bsebv").text().equals("")){
                        continue;
                      }else{
                        String bvps= row.select(".nsebv.bsebv").text();
                        br.append("<br><font color=white>"+bvps+"</font>");}}
                      }catch (Exception e1)
                      {
                        System.out.println("Error"+e1);
                      }
                      br.append("</body>"+"</html>");
                      return br.toString();
        }
        public static String getData17(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                  for(Element row:doc.select(".oview_table tr"))
                    {
                      if(row.select(".nsepb.bsepb").text().equals("")){
                        continue;
                      }else{
                        String pb = row.select(".nsepb.bsepb").text();
                        br.append("<br><font color=white>"+pb+"</font>");}}
                      }catch (Exception e1)
                      {
                        System.out.println("Error"+e1);
                      }
                      br.append("</body>"+"</html>");
                      return br.toString();
        }
        public static String getData18(String stock) throws IOException
    {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/india/stockpricequote/auto-2-3-wheelers/bajajauto/"+stock+"";
          Document doc=Jsoup.connect(url).get();
              try{
                  for(Element row:doc.select(".oview_table tr"))
                    {
                      if(row.select(".nsefv.bsefv").text().equals("")){
                        continue;
                      }else{
                        String facevalue = row.select(".nsefv.bsefv").text();
                        br.append("<br><font color=white>"+facevalue+"</font>");}}
                      }catch (Exception e1)
                      {
                        System.out.println("Error"+e1);
                      }
                      br.append("</body>"+"</html>");
                      return br.toString();
        }
      public overview(){
        Container c=getContentPane();
        c.setLayout(null);
        Font f =new Font("Poppins",Font.BOLD,30);
        Font f2 =new Font("Poppins",Font.BOLD,20);
        Font f3 =new Font("Poppins",Font.BOLD,35);

        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1920,150);
        panel.setBackground(new ColorUIResource(58,16,97));
        c.add(panel);

        //JTextField field =new JTextField();
        //field.setBounds(810,74,300,45);
        //panel.add(field);
        //field.setFont(f);

        String[] values ={"AP31","AB16","BA10","BAF","BF04","BPC","BA08","BI","C","CI11","DL03","DRL","EM","GI01","HCL02","HDF01","MS24","IT","JSW01","HSL01","HHM","HI","HDF","ICI02","IOC","IIB","ITC","KMB","LT","MM","NI"};
        JComboBox cx = new JComboBox(values);
        cx.setSelectedItem(null);
        cx.setBounds(810, 74, 300, 40);
        cx.setFont(f2);
        cx.setEditable(true);
       // AutoCompleteDecorator.decorate(cx);

        panel.add(cx);

        JLabel datalabel=new JLabel();
         datalabel.setFont(f3);
         datalabel.setBounds(100, 160, 1920, 500);
         c.add(datalabel);

      JLabel field2=new JLabel("Search:");
         field2.setFont(f);
         field2.setForeground(Color.WHITE);
         field2.setBounds(690,74,120,50);
         panel.add(field2);

         JTable table =new JTable();
         Object[] columns ={"Open","Previous close","Volume","Value(lacks)","VWAP","Beta","High","Low","UC Limit"};
         DefaultTableModel model = new DefaultTableModel();
         model.setColumnIdentifiers(columns);
         table.setModel(model);
         table.setBackground(Color.BLACK);
         table.setForeground(Color.WHITE);
         table.setFont(f);
         table.setRowHeight(130);
         table.setBounds(100, 600, 1820, 150);
         table.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
         table.setAutoCreateRowSorter(true);
         table.getTableHeader().setFont(f2);
         table.getTableHeader().setOpaque(true);


         //SCROLL PANE
         JScrollPane pane= new JScrollPane(table);
         pane.setForeground(Color.RED);
         pane.setBackground(Color.BLACK);
         pane.setBounds(100, 600, 1720, 150);
         c.add(pane);
         Object[] row =new Object[9];

         JTable table2 =new JTable();
         Object[] columns2 ={"LC Limit","52 week High","52 week Low","TTM EPS","TTM PE","Sector PE","Book value per share","P/B","Face value"};

         DefaultTableModel model1 = new DefaultTableModel();

         model1.setColumnIdentifiers(columns2);
         table2.setModel(model1);
         table2.setBackground(Color.BLACK);
         table2.setForeground(Color.WHITE);
         table2.setFont(f);
         table2.setRowHeight(130);
         table2.setBounds(100, 760, 1820, 150);
         table2.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
        table2.setAutoCreateRowSorter(true);
        table2.getTableHeader().setFont(f2);
        table2.getTableHeader().setOpaque(true);

         //SCROLL PANE
         JScrollPane pane1= new JScrollPane(table2);
         pane1.setForeground(Color.RED);
         pane1.setBackground(Color.BLACK);
         pane1.setBounds(100, 760, 1720, 150);
         c.add(pane1);
         Object[] row2 =new Object[9];

         ImageIcon icon =new ImageIcon("D:\\java\\project\\images\\icons8-search-48.png");
         JButton button =new JButton("");
         button.setFont(f);
         button.setIcon(icon);
         button.setBounds(1115,74,50,45);
         button.setFocusPainted(false);
         button.setMargin(new InsetsUIResource(0, 0, 0, 0));
         button.setContentAreaFilled(false);
         button.setBorderPainted(false);
         button.setOpaque(false);
         button.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
          try
          {String maindata=(String)cx.getSelectedItem();
            String result=getData(maindata);
            datalabel.setText(result);

            String result1=getData1(maindata);
            row[0]=result1;
            String result2=getData2(maindata);
            row[1]=result2;
            String result3=getData3(maindata);
            row[2]=result3;
            String result4=getData4(maindata);
            row[3]=result4;
            String result5=getData5(maindata);
            row[4]=result5;
            String result6=getData6(maindata);
            row[5]=result6;
            String result7=getData7(maindata);
            row[6]=result7;
            String result8=getData8(maindata);
            row[7]=result8;
            String result9=getData9(maindata);
            row[8]=result9;
            String result10=getData10(maindata);
            row2[0]=result10;
            String result11=getData11(maindata);
            row2[1]=result11;
            String result12=getData12(maindata);
            row2[2]=result12;
            String result13=getData13(maindata);
            row2[3]=result13;
            String result14=getData14(maindata);
            row2[4]=result14;
            String result15=getData15(maindata);
            row2[5]=result15;
            String result16=getData16(maindata);
            row2[6]=result16;
            String result17=getData17(maindata);
            row2[7]=result17;
            String result18=getData18(maindata);
            row2[8]=result18;
          }catch(Exception e1)
          {
              System.out.println("Error"+e1);
          }
          model.addRow(row);
          model1.addRow(row2);
          }

        });
        //delete button
        JButton delete = new JButton("BACK");
        delete.setFont(f);
        delete.setFocusPainted(false);
        delete.setBounds(5,900,150,150);
        delete.setMargin(new InsetsUIResource(0, 0, 0, 0));
        delete.setContentAreaFilled(false);
        delete.setBorderPainted(false);
        delete.setOpaque(false);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
            datalabel.setText(null);

            int i = table.getSelectedRow();
            if(i>=0){
              model.removeRow(i);
              model1.removeRow(i);
            }else{
              JOptionPane.showMessageDialog(c,"DeleteError");
            }
            }
            });
         panel.add(button);
         c.add(delete);
      }


}
