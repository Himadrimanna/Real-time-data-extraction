
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.JTableHeader;
public class market extends JFrame{
    
     //NIFTY 50 
     public static String getData0() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/";
          Document doc=Jsoup.connect(url).get();
          Elements elements=doc.select(".niftyinfobar");
          elements.forEach((e) ->
          {
            String text=e.select("a[href]").text();
            String text1=e.select("#ltp_inNSX").text();
            String text2=e.select("#perChg_inNSX.flaturate.red").text();
            String text3=e.select("#perChg_inNSX.flaturate.green").text();
            br.append("<b><font color=yellow>"+text+"</font><font color=white> :  "+text1+"</font><font color=red>  "+text2+"</font><font color=green>  "+text3+"</font>");
          });
              br.append("</body>"+"</html>");
         return br.toString();
     }
     //NIFTY 50 TABLE NAME
     public static String getData() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
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
     // NIFTY 50 DATA
     public static String getData1() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt.-1").text();
                       String ltp2 = row.select(".greentxt.1").text();
                       String ltp3 = row.select(".0").text(); 
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"<br><br>"); 
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
     public static String getData2() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt").text();
                       String ltp2 = row.select(".greentxt").text();
                       String ltp3 = row.select(".black").text();
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"</font><br><br>"); 
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
     public static Object getData3() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("5,063.00<br><br>3,178.00<br><br>7,252.00<br><br>4,550.00<br><br>4,419.00<br><br>7,369<br><br>17,645<br><br>-23,327.00<br><br>1,849<br><br>2,401<br><br>12,705.00<br><br>1,984.00<br><br>1,903.00<br><br>1,315<br><br>6,560.00<br><br>11,169.00<br><br>31,857.00<br><br>1,360.00<br><br>2,982.00<br><br>5,177.00<br><br>8,000.00<br><br>13,566.00<br><br>20,220.00<br><br>20,565<br><br>2,930.00<br><br>19,423<br><br>13,389.00<br><br>7,872.00<br><br>9,903.00<br><br>4,668.00<br><br>2,425.00<br><br>4,220.00<br><br>2,082.00<br><br>14,285.00<br><br>20,324.00<br><br>11,821.00<br><br>53,223.00<br><br>1,455.00<br><br>2,289.00<br><br>22,912.00<br><br>2,284.00<br><br>32,562.00<br><br>993.00<br><br>-13.016<br><br>7,862<br><br>4,351.00<br><br>979.00<br><br>5,316.00<br><br>3,453.00<br><br>10,855.00<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     public static Object getData4() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("28.59<br><br>77.53<br><br>28.83<br><br>21.86<br><br>69.99<br><br>34.42<br><br>5.23<br><br>-18.36<br><br>46.82<br><br>27.33<br><br>6.32<br><br>48.47<br><br>38.38<br><br>52.82<br><br>22.12<br><br>23.93<br><br>25.81<br><br>103.29<br><br>19.95<br><br>20.87<br><br>71.45<br><br>23.66<br><br>21.35<br><br>3.90<br><br>23.84<br><br>29.99<br><br>20.42<br><br>14.23<br><br>34.69<br><br>17.20<br><br>48.70<br><br>47.21<br><br>0.00<br><br>7.17<br><br>7.91<br><br>7.03<br><br>26.23<br><br>60.50<br><br>46.51<br><br>14.51<br><br>49.40<br><br>36.65<br><br>68.70<br><br>-8.16<br><br>12.73<br><br>19.58<br><br>142.16<br><br>35.58<br><br>17.63<br><br>21.67<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     //NIFTY MIDCAP 
     public static String getData001() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-100-companies-list/27?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
          Elements elements=doc.select(".niftyinfobar");
          elements.forEach((e) ->
          {
            String text=e.select("a[href]").text();
            String text1=e.select("#ltp_inccx").text();
            String text2=e.select("#perChg_inccx.flaturate.red").text();
            String text3=e.select("#perChg_inccx.flaturate.green").text();
            br.append("<b><font color=yellow>"+text+"</font><font color=white> :  "+text1+"</font><font color=red>  "+text2+"</font><font color=green>  "+text3+"</font>");
          });
              br.append("</body>"+"</html>");
         return br.toString();
     }
     //NIFTY MIDCAP TABLE NAME
     public static String getData5() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-100-companies-list/27?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
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
     //NIFTY MIDCAP DATA
     public static Object getData8() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("535.00<br><br>471.00<br><br>837.00<br><br>-735.00<br><br>653.00<br><br>1,114.00<br><br>646.00<br><br>350<br><br>-313.00<br><br>1,171<br><br>1,177<br><br>1,454<br><br>2,199<br><br>-89.00<br><br>2,069<br><br>-96.00<br><br>-2,743<br><br>1,542<br><br>2,702.00<br><br>582<br><br>1,362<br><br>1,521.00<br><br>593.00<br><br>466.00<br><br>469.00<br><br>1,323<br><br>616.00<br><br>521.00<br><br>1,243<br><br>775.00<br><br>-229.00<br><br>159.00<br><br>296.00<br><br>458.00<br><br>519.00<br><br>872.00<br><br>803.00<br><br>1,647.00<br><br>-103.00<br><br>1,649<br><br>-3.082<br><br>297.00<br><br>3.00<br><br>-73.00<br><br>1,275<br><br>2,153.00<br><br>3,234<br><br>7,980<br><br>1,067.00<br><br>483.00<br><br>1,201<br><br>282.00<br><br>-694.00<br><br>1,148<br><br>189.00<br><br>5,526<br><br>805.00<br><br>948.00<br><br>666.00<br><br>983.00<br><br>2,714.00<br><br>619.00<br><br>740.00<br><br>1,724<br><br>559.00<br><br>1,110<br><br>1,216<br><br>442.00<br><br>247.00<br><br>649.00<br><br>736.00<br><br>3,617<br><br>340.00<br><br>497.00<br><br>733.00<br><br>886.00<br><br>15,709<br><br>1,577<br><br>529.00<br><br>8,380<br><br>477.00<br><br>2,487.00<br><br>1,198<br><br>3,850<br><br>1,531<br><br>404.00<br><br>410.00<br><br>368.00<br><br>611.00<br><br>763.00<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     public static Object getData9() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("21.93<br><br>228.33<br><br>25.55<br><br>-24.45<br><br>15.87<br><br>22.55<br><br>39.38<br><br>-106.07<br><br>32.15<br><br>27.72<br><br>10.67<br><br>-202.33<br><br>14.51<br><br>-219.91<br><br>-6.29<br><br>20.97<br><br>7.96<br><br>0.00<br><br>0.59<br><br>0.00<br><br>19.42<br><br>39.19<br><br>72.75<br><br>17.08<br><br>39.93<br><br>40.14<br><br>24.20<br><br>-40.41<br><br>133.58<br><br>76.62<br><br>47.51<br><br>39.41<br><br>13.98<br><br>19.27<br><br>9.09<br><br>-137.34<br><br>7.96<br><br>-5.25<br><br>32.06<br><br>54.90<br><br>-188.07<br><br>29.60<br><br>9.60<br><br>10.27<br><br>14.45<br><br>11.55<br><br>63.30<br><br>7.09<br><br>80.48<br><br>-18.32<br><br>21.13<br><br>148.02<br><br>9.64<br><br>9.64<br><br>18.15<br><br>21.35<br><br>41.91<br><br>19.72<br><br>7.68<br><br>18.64<br><br>28.46<br><br>7.31<br><br>59.23<br><br>30.90<br><br>27.26<br><br>34.11<br><br>52.95<br><br>32.13<br><br>28.29<br><br>3.77<br><br>99.29<br><br>41.60<br><br>45.24<br><br>25.30<br><br>2.56<br><br>8.41<br><br>21.29<br><br>3.09<br><br>0.00<br><br>14.02<br><br>26.32<br><br>8.45<br><br>12.15<br><br>53.38<br><br>74.73<br><br>45.56<br><br>32.57<br><br>29.49<br><br>15.78<br><br>-182.74<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     public static String getData6() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-100-companies-list/27?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt.-1").text();
                       String ltp2 = row.select(".greentxt.1").text();
                       String ltp3 = row.select(".0").text();
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"<br><br>"); 
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
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-100-companies-list/27?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt").text();
                       String ltp2 = row.select(".greentxt").text();
                       String ltp3 = row.select(".black").text();
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"</font><br><br>"); 
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
     //NIFTY NEXT 50
     public static String getData0001() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsenext-50-companies-list/6?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
          Elements elements=doc.select(".niftyinfobar");
          elements.forEach((e) ->
          {
            String text=e.select("a[href]").text();
            String text1=e.select("#ltp_incjn").text();
            String text2=e.select("#perChg_incjn.flaturate.red").text();
            String text3=e.select("#perChg_incjn.flaturate.green").text();
            br.append("<b><font color=yellow>"+text+"</font><font color=white> :  "+text1+"</font><font color=red>  "+text2+"</font><font color=green>  "+text3+"</font>");
          });
              br.append("</body>"+"</html>");
         return br.toString();
     }
     //NIFTY NEXT 50 NAME
     public static String getData10() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsenext-50-companies-list/6?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
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
     // NIFTY NEXT 50 DATA
     public static String getData11() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsenext-50-companies-list/6?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt.-1").text();
                       String ltp2 = row.select(".greentxt.1").text();
                       String ltp3 = row.select(".0").text(); 
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"<br><br>"); 
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
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsenext-50-companies-list/6?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt").text();
                       String ltp2 = row.select(".greentxt").text();
                       String ltp3 = row.select(".black").text();
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"</font><br><br>"); 
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
     public static Object getData13() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("699.00<br><br>1,421<br><br>746.00<br><br>176.00<br><br>1,289<br><br>1,617<br><br>3,092<br><br>136.00<br><br>5,389<br><br>1,033<br><br>208.00<br><br>2,205<br><br>725.00<br><br>925.00<br><br>480.00<br><br>2,137<br><br>1,035<br><br>1,695<br><br>477.00<br><br>4,428<br><br>997.00<br><br>1,720<br><br>1,044<br><br>1,325<br><br>10,524<br><br>1,473<br><br>956<br><br>1,046<br><br>2,912<br><br>1,620<br><br>-5.806<br><br>230.00<br><br>1,938<br><br>1,226<br><br>1,201<br><br>1,277<br><br>3,818<br><br>6,247<br><br>2,920<br><br>1,122<br><br>1,074<br><br>651.00<br><br>2,152<br><br>984.00<br><br>769.00<br><br>1,251<br><br>113.00<br><br>363.00<br><br>15,033<br><br>-3,489<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     public static Object getData14() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("46.10<br><br>0.00<br><br>122.90<br><br>1,624<br><br>100.71<br><br>20.89<br><br>0.00<br><br>270.27<br><br>9.68<br><br>168.48<br><br>10.04<br><br>24.74<br><br>103.24<br><br>65.53<br><br>86.43<br><br>21.16<br><br>40.96<br><br>56.42<br><br>64.94<br><br>9.96<br><br>39.29<br><br>43.35<br><br>62.97<br><br>46.87<br><br>3.32<br><br>44.22<br><br>66.91<br><br>30.59<br><br>13.98<br><br>38.39<br><br>-10.82<br><br>165.87<br><br>36.53<br><br>38.02<br><br>45.30<br><br>0.00<br><br>12.72<br><br>6.54<br><br>11.47<br><br>81.28<br><br>31.20<br><br>0.00<br><br>13.88<br><br>88.57<br><br>0.00<br><br>34.40<br><br>290.06<br><br>102.84<br><br>7.30<br><br>-9.45<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     //NIFTY MIDCAP 50
     public static String getData00001() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-50-companies-list/31?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
          Elements elements=doc.select(".niftyinfobar");
          elements.forEach((e) ->
          {
            String text=e.select("a[href]").text();
            String text1=e.select("#ltp_inmfy").text();
            String text2=e.select("#perChg_inmfy.flaturate.red").text();
            String text3=e.select("#perChg_inmfy.flaturate.green").text();
            br.append("<b><font color=yellow>"+text+"</font><font color=white> :  "+text1+"</font><font color=red>  "+text2+"</font><font color=green>  "+text3+"</font>");
          });
              br.append("</body>"+"</html>");
         return br.toString();
     }
     //NIFTY MIDCAP 50 NAME 
     public static String getData15() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-50-companies-list/31?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
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
     // NIFTY MIDCAP 50 DATA
     public static String getData16() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-50-companies-list/31?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt.-1").text();
                       String ltp2 = row.select(".greentxt.1").text();
                       String ltp3 = row.select(".0").text(); 
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"<br><br>"); 
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
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsemidcap-50-companies-list/31?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt").text();
                       String ltp2 = row.select(".greentxt").text();
                       String ltp3 = row.select(".black").text();
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"</font><br><br>"); 
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
     public static Object getData18() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("5,063.00<br><br>3,178.00<br><br>7,252.00<br><br>4,550.00<br><br>4,419.00<br><br>7,369<br><br>17,645<br><br>-23,327.00<br><br>1,849<br><br>2,401<br><br>12,705.00<br><br>1,984.00<br><br>1,903.00<br><br>1,315<br><br>6,560.00<br><br>11,169.00<br><br>31,857.00<br><br>1,360.00<br><br>2,982.00<br><br>5,177.00<br><br>8,000.00<br><br>13,566.00<br><br>20,220.00<br><br>20,565<br><br>2,930.00<br><br>19,423<br><br>13,389.00<br><br>7,872.00<br><br>9,903.00<br><br>4,668.00<br><br>2,425.00<br><br>4,220.00<br><br>2,082.00<br><br>14,285.00<br><br>20,324.00<br><br>11,821.00<br><br>53,223.00<br><br>1,455.00<br><br>2,289.00<br><br>22,912.00<br><br>2,284.00<br><br>32,562.00<br><br>993.00<br><br>-13.016<br><br>7,862<br><br>4,351.00<br><br>979.00<br><br>5,316.00<br><br>3,453.00<br><br>10,855.00<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     public static Object getData19() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("28.59<br><br>77.53<br><br>28.83<br><br>21.86<br><br>69.99<br><br>34.42<br><br>5.23<br><br>-18.36<br><br>46.82<br><br>27.33<br><br>6.32<br><br>48.47<br><br>38.38<br><br>52.82<br><br>22.12<br><br>23.93<br><br>25.81<br><br>103.29<br><br>19.95<br><br>20.87<br><br>71.45<br><br>23.66<br><br>21.35<br><br>3.90<br><br>23.84<br><br>29.99<br><br>20.42<br><br>14.23<br><br>34.69<br><br>17.20<br><br>48.70<br><br>47.21<br><br>0.00<br><br>7.17<br><br>7.91<br><br>7.03<br><br>26.23<br><br>60.50<br><br>46.51<br><br>14.51<br><br>49.40<br><br>36.65<br><br>68.70<br><br>-8.16<br><br>12.73<br><br>19.58<br><br>142.16<br><br>35.58<br><br>17.63<br><br>21.67<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     //NIFTY SMLCAP 50 
     public static String getData000001() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsesmlcap-50-companies-list/113?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
          Elements elements=doc.select(".niftyinfobar");
          elements.forEach((e) ->
          {
            String text=e.select("a[href]").text();
            String text1=e.select("#ltp_mcnscapf").text();
            String text2=e.select("#perChg_mcnscapf.flaturate.red").text();
            String text3=e.select("#perChg_mcnscapf.flaturate.green").text();
            br.append("<b><font color=yellow>"+text+"</font><font color=white> :  "+text1+"</font><font color=red>  "+text2+"</font><font color=green>  "+text3+"</font>");
          });
              br.append("</body>"+"</html>");
         return br.toString();
     } 
     //NIFTY SMLCAP 50 NAME 
     public static String getData20() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsesmlcap-50-companies-list/113?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
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
     // NIFTY SMLCAP 50 DATA
     public static String getData21() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+
          "<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsesmlcap-50-companies-list/113?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt.-1").text();
                       String ltp2 = row.select(".greentxt.1").text();
                       String ltp3 = row.select(".0").text(); 
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"<br><br>"); 
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
     public static String getData22() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          String url="https://www.moneycontrol.com/markets/indian-indices/top-nsesmlcap-50-companies-list/113?classic=true&categoryId=1&exType=N";
          Document doc=Jsoup.connect(url).get();
              try
              {
                   for(Element row:doc.select("#indicesTableData tr"))
                   {
                   if(row.select("a[href]").text().equals("")){
                       continue;
                   }else{
                       String ltp = row.select(".redtxt").text();
                       String ltp2 = row.select(".greentxt").text();
                       String ltp3 = row.select(".black").text();
                       br.append("<font color=red>"+ltp+"</font><font color=green>"+ltp2+"</font><font color=white>"+ltp3+"</font><br><br>"); 
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
     public static Object getData23() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("5,063.00<br><br>3,178.00<br><br>7,252.00<br><br>4,550.00<br><br>4,419.00<br><br>7,369<br><br>17,645<br><br>-23,327.00<br><br>1,849<br><br>2,401<br><br>12,705.00<br><br>1,984.00<br><br>1,903.00<br><br>1,315<br><br>6,560.00<br><br>11,169.00<br><br>31,857.00<br><br>1,360.00<br><br>2,982.00<br><br>5,177.00<br><br>8,000.00<br><br>13,566.00<br><br>20,220.00<br><br>20,565<br><br>2,930.00<br><br>19,423<br><br>13,389.00<br><br>7,872.00<br><br>9,903.00<br><br>4,668.00<br><br>2,425.00<br><br>4,220.00<br><br>2,082.00<br><br>14,285.00<br><br>20,324.00<br><br>11,821.00<br><br>53,223.00<br><br>1,455.00<br><br>2,289.00<br><br>22,912.00<br><br>2,284.00<br><br>32,562.00<br><br>993.00<br><br>-13.016<br><br>7,862<br><br>4,351.00<br><br>979.00<br><br>5,316.00<br><br>3,453.00<br><br>10,855.00<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     }
     public static Object getData24() throws IOException
     {
          StringBuffer br =new StringBuffer();
          br.append("<html>"+"<body>");
          br.append("28.59<br><br>77.53<br><br>28.83<br><br>21.86<br><br>69.99<br><br>34.42<br><br>5.23<br><br>-18.36<br><br>46.82<br><br>27.33<br><br>6.32<br><br>48.47<br><br>38.38<br><br>52.82<br><br>22.12<br><br>23.93<br><br>25.81<br><br>103.29<br><br>19.95<br><br>20.87<br><br>71.45<br><br>23.66<br><br>21.35<br><br>3.90<br><br>23.84<br><br>29.99<br><br>20.42<br><br>14.23<br><br>34.69<br><br>17.20<br><br>48.70<br><br>47.21<br><br>0.00<br><br>7.17<br><br>7.91<br><br>7.03<br><br>26.23<br><br>60.50<br><br>46.51<br><br>14.51<br><br>49.40<br><br>36.65<br><br>68.70<br><br>-8.16<br><br>12.73<br><br>19.58<br><br>142.16<br><br>35.58<br><br>17.63<br><br>21.67<br><br>");
          br.append("</body>"+"</html>");
          return br.toString();
     } 
     


//MARKET WINDOW LAYOUT     
public market() throws IOException{
    
        Container c=getContentPane();
        c.setLayout(null);
        Font f =new Font("Poppins",Font.BOLD,25);
        Font f1 =new Font("Poppins",Font.BOLD,30);
        Font f2 =new Font("Poppins",Font.BOLD,25);
        Font f3 =new Font("Poppins",Font.BOLD,20);
        //PANEL
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,300,1080);
        panel.setBackground(new ColorUIResource(58,16,97));

        ImageIcon img7=new ImageIcon("D:\\java\\project\\images\\icons8-youtube-live-48.png");
        JLabel l1=new JLabel("LIVE MARKET");
        l1.setFont(f1);
        l1.setIcon(img7);
        l1.setBounds(20, 0,300 ,100);
        l1.setBackground(new ColorUIResource(25,25,112));
        l1.setForeground(Color.GREEN);

        ImageIcon img8 =new ImageIcon("D:\\java\\project\\images\\icons8-menu-30.png");
        JLabel l4 =new JLabel();
        l4.setBounds(30, 100, 300,50);
        l4.setIcon(img8);

        
        JLabel l2=new JLabel("INDIAN INDICES");
        l2.setFont(f1);
        l2.setBounds(310, 0,300 ,100);
        l2.setForeground(Color.WHITE);
        c.add(l2);

        JLabel l3=new JLabel();
        l3.setFont(f);
        l3.setBounds(920, 0, 1000,100);
        c.add(l3);

        JTable table =new JTable();
        Object[] columns ={"Name","LTP","%chg","Profit","P/E"};
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);
        table.setFont(f2);
        table.setRowHeight(3350);
        table.setBounds(310, 100, 1590, 980);
        table.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
        table.setAutoCreateRowSorter(true);
        table.getTableHeader().setFont(f3);
        table.getTableHeader().setOpaque(true);
        
        
        //SCROLL PANE
        JScrollPane pane= new JScrollPane(table);
        pane.setForeground(Color.RED);
        pane.setBounds(310, 100, 1590, 980);
        c.add(pane);

        
        Object[] row =new Object[5];
         
        //BUTTONS
        //NIFTY 50 
        ImageIcon img6=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
        JButton b1 = new JButton("NIFTY 50");
        b1.setIcon(img6);
        b1.setFont(f);
        b1.setFocusPainted(false);
        b1.setBounds(30, 150,150,100);
        b1.setMargin(new InsetsUIResource(0, 0, 0, 0));
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.setOpaque(false);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              pane.setVisible(true);
            try {
              row[0]=getData();
              row[1]=getData1();
              row[2]=getData2();
              row[3]=getData3();
              row[4]=getData4();
              
            } catch (Exception e1) {   
              e1.printStackTrace();
            }
            String result;
            try {
                result = getData0();
                l3.setText(result);
            } catch (IOException e1) {
                
                e1.printStackTrace();
            }
              
            model.addRow(row);
            }
            });
        //NIFFTY MIDCAP 
        ImageIcon img5=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
        JButton b2 = new JButton("NIFTY MIDCAP");
        b2.setIcon(img5);
        b2.setFont(new FontUIResource("Poppins",Font.BOLD,25));
        b2.setFocusPainted(false);
        b2.setBounds(15,250,250,100);
        b2.setMargin(new InsetsUIResource(0, 0, 0, 0));
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.setOpaque(false);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
              row[0]=getData5();
              row[1]=getData6();
              row[2]=getData7();
              row[3]=getData8();
              row[4]=getData9();
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            try {
                String result =getData001();
                l3.setText(result);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            model.addRow(row); 
            }  
            });
        //NIFITY NEXT 50
        ImageIcon img4=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
        JButton b3 = new JButton("NIFTY NEXT 50");
        b3.setIcon(img4);
        b3.setFont(new FontUIResource("Poppins",Font.BOLD,25));
        b3.setFocusPainted(false);
        b3.setBounds(15,350,250,100);
        b3.setMargin(new InsetsUIResource(0, 0, 0, 0));
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.setOpaque(false);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
              row[0]=getData10();
              row[1]=getData11();
              row[2]=getData12();
              row[3]=getData13();
              row[4]=getData14();
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            try {
                String result =getData0001();
                l3.setText(result);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            model.addRow(row);  
            }
            });
        //NIFTY MIDCAP 50
        ImageIcon img3=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
        JButton b4 = new JButton("NIFTYMIDCAP50");
        b4.setIcon(img3);
        b4.setFont(new FontUIResource("Poppins",Font.BOLD,25));
        b4.setFocusPainted(false);
        b4.setBounds(25,450,250,100);
        b4.setMargin(new InsetsUIResource(0, 0, 0, 0));
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        b4.setOpaque(false);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
              row[0]=getData15();
              row[1]=getData16();
              row[2]=getData17();
              row[3]=getData18();
              row[4]=getData19();
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            try {
                String result =getData00001();
                l3.setText(result);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            model.addRow(row);  
            }
            });
        //NIFTY SMLCAP 50
        ImageIcon img2=new ImageIcon("D:\\java\\project\\images\\icons8-new-moon-30.png");
        JButton b5 = new JButton("NIFTYSMLCAP50");
        b5.setIcon(img2);
        b5.setFont(f);
        b5.setFocusPainted(false);
        b5.setBounds(25,550,250,100);
        b5.setMargin(new InsetsUIResource(0, 0, 0, 0));
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        b5.setOpaque(false);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
            try {
              row[0]=getData20();
              row[1]=getData21();
              row[2]=getData22();
              row[3]=getData23();
              row[4]=getData24();
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            try {
                String result =getData000001();
                l3.setText(result);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            model.addRow(row);  
            }
            });
        //delete button
        ImageIcon img1=new ImageIcon("D:\\java\\project\\images\\icons8-back-arrow-48.png");
        JButton delete = new JButton("");
        delete.setFont(f);
        delete.setIcon(img1);
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
            l3.setText(null);
            
            int i = table.getSelectedRow();
            if(i>=0){
              model.removeRow(i);
            }else{
              JOptionPane.showMessageDialog(c,"DeleteError");
            }
            }
            });
        c.revalidate();
        c.add(panel);
        panel.add(l1);
        panel.add(l4);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(delete);
    }     
}
