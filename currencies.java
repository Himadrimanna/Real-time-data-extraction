import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.*;

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

public class currencies extends JFrame {

    // * --------------------CURRENCY EXCHANGE RATES------------------------
    // CURRENCY COLUMN
    public static String getData() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgwhttbl").text().equals("")) {
                    continue;
                } else {
                    String currency = row.select(".bgwhttbl").text();
                    br.append(currency + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // RUPEE COLUMN
    public static String getData1() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String rupee = row.select(".bgylw").get(0).text();
                    br.append(rupee + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // US COLUMN
    public static String getData2() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String us = row.select(".bgylw").get(1).text();
                    br.append(us + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // EURO COLUMN
    public static String getData3() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String euro = row.select(".bgylw").get(2).text();
                    br.append(euro + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // UK COLUMN
    public static String getData4() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String uk = row.select(".bgylw").get(3).text();
                    br.append(uk + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // AUSTRALIA COLUMN
    public static String getData5() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String aus = row.select(".bgylw").get(4).text();
                    br.append(aus + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // JAPANESE COLUMNS
    public static String getData6() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String japanese = row.select(".bgylw").get(5).text();
                    br.append(japanese + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // SINGAPORE COLUMN
    public static String getData7() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String singapore = row.select(".bgylw").get(6).text();
                    br.append(singapore + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // RENMINBI COLUMN
    public static String getData8() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String renminbi = row.select(".bgylw").get(7).text();
                    br.append(renminbi + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // TAIWAN COLUMN
    public static String getData9() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".curdata tr")) {
                if (row.select(".bgylw").text().equals("")) {
                    continue;
                } else {
                    String taiwan = row.select(".bgylw").get(8).text();
                    br.append(taiwan + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }
    // * -----------------------------------------------------------------

    // * --------------------CURRENCY SPOT RATES--------------------------
    // CURRENCY PAIR COLUMN
    public static String getData10() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".currency_table tr")) {
                if (row.select(".first").text().equals("")) {
                    continue;
                } else {
                    String currency_pair = row.select(".first").text();
                    br.append(currency_pair + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // CURRENT SPOT COLUMN
    public static String getData11() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".currency_table tr")) {
                if (row.select(".first").text().equals("")) {
                    continue;
                } else {
                    String currency_pair = row.select("align=right").get(0).text();
                    br.append(currency_pair + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // TIME COLUMN
    public static String getData12() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".currency_table tr")) {
                if (row.select(".first").text().equals("")) {
                    continue;
                } else {
                    String time = row.select("align=right").get(1).text();
                    br.append(time + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // OPEN COLUMN
    public static String getData13() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".currency_table tr")) {
                if (row.select(".first").text().equals("")) {
                    continue;
                } else {
                    String open = row.select("align=right").get(2).text();
                    br.append(open + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // HIGH COLUMN
    public static String getData14() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".currency_table tr")) {
                if (row.select(".first").text().equals("")) {
                    continue;
                } else {
                    String high = row.select("align=right").get(3).text();
                    br.append(high + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // LOW COLUMN
    public static String getData15() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".currency_table tr")) {
                if (row.select(".first").text().equals("")) {
                    continue;
                } else {
                    String low = row.select("align=right").get(4).text();
                    br.append(low + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }

    // CLOSE COLUMN
    public static String getData16() throws IOException {
        StringBuffer br = new StringBuffer();
        br.append("<html>" + "<body>");

        String url = "https://www.moneycontrol.com/mccode/currencies/";
        Document doc = Jsoup.connect(url).get();

        try {
            for (Element row : doc.select(".currency_table tr")) {
                if (row.select(".first").text().equals("")) {
                    continue;
                } else {
                    String close = row.select("align=right").get(5).text();
                    br.append(close + "<br><br>");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        br.append("</body>" + "</html>");
        return br.toString();
    }
    // * ---------------------------------------------------------------------

    // * --------------------FORWARD RATES------------------------------------
    // MONTH 1 COLUMN

    // ---------------NAMES-------------------------------
    JTable table1, table2, table3;
    DefaultTableModel model1, model2, model3;
    JButton exchange_rate, spot_rate, forward_rate, back;
    // ---------------------------------------------------

    // ---------------CURRENCIES CONSTRUCTOR-------------------------
    public currencies() throws IOException {
        Container c = getContentPane();
        c.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 300, 1080);
        panel.setBackground(new ColorUIResource(75, 0, 130));

        Font f2 = new Font("Poppings", Font.BOLD, 20);

        // * ---------------CURRENCY EXCHANGE RATES
        // TABLE----------------------------------------
        table1 = new JTable();
        Object[] currency_rate_columns = { "Currency", "Rupee", "US", "Euro", "UK", "Aus", "Japanese", "Singapore",
                "Renminbi", "Taiwan" };
        model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(currency_rate_columns);
        table1.setModel(model1);
        table1.setBackground(new Color(0, 0, 0));
        table1.setForeground(new Color(255, 255, 255));
        table1.setFont(f2);
        table1.setRowHeight(3350);
        table1.setBounds(310, 15, 1590, 980);
        table1.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
        table1.setAutoCreateRowSorter(true);
        // -------------------------------------------------------------------------------------

        // * ---------------CURRENCY SPOT RATES
        // TABLE---------------------------------------------
        table2 = new JTable();
        Object[] spot_rate_columns = { "Currency Pair", "Current Spot", "Time", "Open", "High", "Low", "Close" };
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(spot_rate_columns);
        table2.setModel(model2);
        table2.setBackground(new Color(0, 0, 0));
        table2.setForeground(new Color(255, 255, 255));
        table2.setFont(f2);
        table2.setRowHeight(3350);
        table2.setBounds(310, 15, 1590, 980);
        table2.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
        table2.setAutoCreateRowSorter(true);
        // -------------------------------------------------------------------------------------

        // * ---------------FORWARD RATES
        // TABLE------------------------------------------------------
        table3 = new JTable();
        Object[] forward_rate_columns = { "Month", "Rate", "Month", "Rate", "Month", "Rate" };
        model3 = new DefaultTableModel();
        model3.setColumnIdentifiers(forward_rate_columns);
        table3.setModel(model3);
        table3.setBackground(new Color(0, 0, 0));
        table3.setForeground(new Color(255, 255, 255));
        table3.setFont(f2);
        table3.setRowHeight(3350);
        table3.setBounds(310, 15, 1590, 980);
        table3.getTableHeader().setPreferredSize(new DimensionUIResource(318, 40));
        table3.setAutoCreateRowSorter(true);
        // -------------------------------------------------------------------------------------

        // * ----------SCROLL PANE------------------------------
        // FOR TABLE 1------------------------------------------
        JScrollPane table1ScrollPane = new JScrollPane(table1);
        table1ScrollPane.setForeground(Color.RED);
        table1ScrollPane.setBounds(310, 15, 1590, 980);
        c.add(table1ScrollPane);
        Object[] row1Objects = new Object[10];

        // FOR TABLE 2------------------------------------------
        JScrollPane table2ScrollPane = new JScrollPane(table2);
        table2ScrollPane.setForeground(Color.RED);
        table2ScrollPane.setBounds(310, 15, 1590, 980);
        c.add(table2ScrollPane);
        Object[] row2Objects = new Object[7];

        // FOR TABLE 3------------------------------------------
        JScrollPane table3ScrollPane = new JScrollPane(table3);
        table3ScrollPane.setForeground(Color.RED);
        table3ScrollPane.setBounds(310, 15, 1590, 980);
        c.add(table3ScrollPane);
        Object[] row3Objects = new Object[6];
        // -----------------------------------------------------

        // * ----------BUTTONS FUNCTIONALITIES-------------------
        // FUNCTIONALITIES FOR EXCHANGE RATE BUTTON-------------
        exchange_rate = new JButton("Exchange Rates");
        exchange_rate.setBounds(0, 0, 300, 100);
        button(exchange_rate);
        exchange_rate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    row1Objects[0] = getData();
                    row1Objects[1] = getData1();
                    row1Objects[2] = getData2();
                    row1Objects[3] = getData3();
                    row1Objects[4] = getData4();
                    row1Objects[5] = getData5();
                    row1Objects[6] = getData6();
                    row1Objects[7] = getData7();
                    row1Objects[8] = getData8();
                    row1Objects[9] = getData9();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                model1.addRow(row1Objects);
            }

        });

        // FUNCTIONALITIES FOR SPOT RATE BUTTON-----------------
        spot_rate = new JButton("Spot Rates");
        spot_rate.setBounds(0, 100, 300, 100);
        button(spot_rate);
        spot_rate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    row2Objects[0] = getData10();
                    row2Objects[1] = getData11();
                    row2Objects[2] = getData12();
                    row2Objects[3] = getData13();
                    row2Objects[4] = getData14();
                    row2Objects[5] = getData15();
                    row2Objects[6] = getData16();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                model2.addRow(row2Objects);
            }

        });

        // FUNCTIONALITIES FOR FORWARD RATE BUTTON--------------
        forward_rate = new JButton("Forward Rates");
        forward_rate.setBounds(0, 200, 300, 100);
        button(forward_rate);
        forward_rate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                model3.addRow(row3Objects);
            }

        });

        // FUNCTIONALITIES FOR BACK BUTTON-----------------------
        back = new JButton("Back");
        back.setBounds(0, 980, 300, 100);
        button(back);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int i = table1.getSelectedRow();
                    int j = table2.getSelectedRow();
                    int k = table3.getSelectedRow();
                    if (i <= 0) {
                        model1.removeRow(i);
                    } else {
                        JOptionPane.showMessageDialog(c, "Delete Error");
                    }
                    if (j <= 0) {
                        model2.removeRow(j);
                    } else {
                        JOptionPane.showMessageDialog(c, "Delete Error");
                    }
                    if (k <= 0) {
                        model3.removeRow(k);
                    } else {
                        JOptionPane.showMessageDialog(c, "Delete Error");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        });

        c.revalidate();
        c.add(panel);
        panel.add(exchange_rate);
        panel.add(forward_rate);
        panel.add(spot_rate);
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
