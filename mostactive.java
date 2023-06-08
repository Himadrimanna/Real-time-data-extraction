import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class mostactive extends JFrame {

    public static String getData(String stock) throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" +
                "<body>");
        // String url =
        // "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
        String url = stock;
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".bsr_table.hist_tbl_hm tr")) {
                if (row.select(".PR").text().equals("")) {
                    continue;
                } else {
                    String name = row.select(".PR>.gld13.disin>a[href]").text();
                    br.append("<font color=blue>" + name + "</font>" + "<br><br>");
                }
            }
        } catch (Exception e1) {
            System.out.println(e1);
        }
        br.append("</body>" + "</html>");
        return br.toString();
    }

    public static String getData1(String stock) throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");
        // String url =
        // "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
        String url = stock;
        Document doc = Jsoup.connect(url).get();
        // Elements elements = doc.select(".bsr_table.hist_tbl_hm");

        try {
            for (Element row : doc.select(".bsr_table.hist_tbl_hm tr")) {
                if (row.select(".pe").text().equals("")) {
                    continue;
                } else {
                    String pe = row.select(".pe").text();
                    br.append(pe + "<br><br>");
                }
            }

        } catch (Exception e2) {
            System.out.println("Error: " + e2);
        }
        br.append("</body>" + "</html>");

        return br.toString();
    }

    public static String getData2(String stock) throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");
        // String url =
        // "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
        String url = stock;
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".bsr_table.hist_tbl_hm tr")) {
                if (row.select(".PR").text().equals("")) {
                    continue;
                } else {
                    String low = row.select("td[width=180]").text();
                    br.append(low + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        br.append("</body>" + "</html>");
        return br.toString();
    }

    public static String getData3(String stock) throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");
        // String url =
        // "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
        String url = stock;
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".bsr_table.hist_tbl_hm tr")) {
                if (row.select(".PR").text().equals("")) {
                    continue;
                } else {
                    String lastprice = row.select("td[width=185].green").text();
                    String lastprice2 = row.select("td[width=185].red").text();
                    br.append("<font color=green>" + lastprice + "</font><font color=red>" + lastprice2
                            + "</font><br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        br.append("</body>" + "</html>");
        return br.toString();
    }

    public static String getData4(String stock) throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");
        // String url =
        // "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
        String url = stock;
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".bsr_table.hist_tbl_hm tr")) {
                if (row.select(".PR").text().equals("")) {
                    continue;
                } else {
                    String percentchange = row.select("td[width=175].green").text();
                    String percentchange2 = row.select("td[width=175].red").text();
                    br.append("<font color=green>" + percentchange + "</font><font color=red>" + percentchange2
                            + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        br.append("</body>" + "</html>");
        return br.toString();
    }

    public static String getData5(String stock) throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");
        // String url =
        // "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
        String url = stock;
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".bsr_table.hist_tbl_hm tr")) {
                if (row.select(".vwap").text().equals("")) {
                    continue;
                } else {
                    String vwap = row.select(".vwap").text();
                    br.append(vwap + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        br.append("</body>" + "</html>");
        return br.toString();
    }

    public static String getData6(String stock) throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");
        // String url =
        // "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
        String url = stock;
        Document doc = Jsoup.connect(url).get();
        // Elements elements = doc.select(".bsr_table.hist_tbl_hm");

        try {
            for (Element row : doc.select(".bsr_table.hist_tbl_hm tr")) {
                if (row.select(".pb").text().equals("")) {
                    continue;
                } else {
                    String pe = row.select(".pb").text();
                    br.append(pe + "<br><br>");
                }
            }

        } catch (Exception e2) {
            System.out.println("Error: " + e2);
        }
        br.append("</body>" + "</html>");

        return br.toString();
    }

    JButton bseallcompany, nseallcompany, back;

    public mostactive() throws IOException {

        Container c = getContentPane();
        c.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 300, 1080);
        panel.setBackground(new ColorUIResource(75, 0, 130));

        Font f2 = new Font("Poppings", Font.BOLD, 20);

        // * TABLE
        JTable table = new JTable();
        Object[] columns = { "Company Name", "P / E", "Low", "Last Price", "%Change", "VWAP", "P / B" };
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(new Color(0, 0, 0));
        table.setForeground(new Color(255, 255, 255));
        table.setFont(f2);
        table.setRowHeight(3350);
        table.setBounds(310, 15, 1590, 980);
        table.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
        table.setAutoCreateRowSorter(true);

        // * SCROLL PANE
        JScrollPane pane = new JScrollPane(table);
        pane.setForeground(Color.RED);
        pane.setBounds(310, 15, 1590, 980);
        c.add(pane);
        Object[] row = new Object[6];

        /**
         * * ALL BUTTONS STARTS HERE!
         */

        // 1. NSE
        bseallcompany = new JButton("BSE");

        bseallcompany.setBounds(0, 0, 300, 100);
        button(bseallcompany);
        bseallcompany.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String stocklink = "https://www.moneycontrol.com/stocks/marketstats/bse-mostactive-stocks/all-companies-97/";
                    row[0] = getData(stocklink);
                    row[1] = getData1(stocklink);
                    row[2] = getData2(stocklink);
                    row[3] = getData3(stocklink);
                    row[4] = getData4(stocklink);
                    row[5] = getData5(stocklink);
                    row[6] = getData6(stocklink);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                model.addRow(row);
            }

        });

        // 2. BSE
        nseallcompany = new JButton("NSE");
        nseallcompany.setBounds(0, 100, 300, 100);

        button(nseallcompany);
        nseallcompany.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String stocklink = "https://www.moneycontrol.com/stocks/marketstats/nse-mostactive-stocks/all-companies-99/";
                    row[0] = getData(stocklink);
                    row[1] = getData1(stocklink);
                    row[2] = getData2(stocklink);
                    row[3] = getData3(stocklink);
                    row[4] = getData4(stocklink);
                    row[5] = getData5(stocklink);
                    row[6] = getData6(stocklink);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                model.addRow(row);
            }

        });

        // 3. BACK
        back = new JButton("Back");
        back.setBounds(0, 980, 300, 100);

        button(back);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int i = table.getSelectedRow();
                    if (i <= 0) {
                        model.removeRow(i);
                    } else {
                        JOptionPane.showMessageDialog(c, "Delete Error");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        });

        /**
         * * ALL BUTTONS END HERE!
         */

        // * ADDING COMPONENTS
        c.revalidate();
        c.add(panel);
        panel.add(bseallcompany);
        panel.add(nseallcompany);
        panel.add(back);
    }

    public void button(JButton jButton) {
        Font f = new Font("Poppins", Font.BOLD, 20);
        jButton.setFont(f);
        jButton.setFocusPainted(false);
        jButton.setMargin(new InsetsUIResource(0, 0, 0, 0));
        jButton.setContentAreaFilled(false);
        jButton.setBorderPainted(false);
        jButton.setOpaque(false);
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setHorizontalTextPosition(SwingConstants.CENTER);
    }
}
