import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Residential_Tax_Calculator extends JFrame
{
    private JLabel homeValue;
    private JLabel schoolRate;
    private JLabel countyRate;
    private JLabel schoolTax;
    private JLabel countyTax;
    private JLabel totalTax;

    private JTextField homeTF;
    private JTextField schoolTF;
    private JTextField countyTF;
    private JTextField schoolTaxTF;
    private JTextField countyTaxTF;
    private JTextField totalTF;

    private JButton calculate, exit;

    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;

    private static final int Width = 600, Height = 400;

    public PropertyTax() //Constructor
    {
        //Formatting Title, container layout
        setTitle("Calculation of Property Taxes");
        Container c = getContentPane();
        c.setLayout(new GridLayout(7,4));

        //Labels
        homeValue = new JLabel("Assessment Home Value:",SwingConstants.RIGHT);
        schoolRate = new JLabel("Decimal Value of School Tax Rate:",SwingConstants.RIGHT);
        countyRate = new JLabel("Decimal Value of County Tax Rate:",SwingConstants.RIGHT);
        schoolTax = new JLabel("School Taxes:",SwingConstants.RIGHT);
        countyTax = new JLabel("County Taxes:",SwingConstants.RIGHT);
        totalTax = new JLabel("Total Taxes:",SwingConstants.RIGHT);

        //Textfields
        homeTF = new JTextField(10);
        schoolTF = new JTextField(10);
        countyTF = new JTextField(10);
        schoolTaxTF = new JTextField(10);
        countyTaxTF = new JTextField(10);
        totalTF = new JTextField(10);

        //Calculate Button
        calculate = new JButton("Calculate");
        cbHandler = new CalculateButtonHandler();
        calculate.addActionListener(ebHandler);

        //Placement of textfields/labels
        c.add(homeValue);
        c.add(homeTF);
        c.add(schoolRate);
        c.add(schoolTF);
        c.add(countyRate);
        c.add(countyTF);
        c.add(schoolTax);
        c.add(schoolTaxTF);
        c.add(countyTaxTF);
        c.add(totalTax);
        c.add(totalTF);
        c.add(calculate);
        c.add(exit);

        //JFrame format, execution, action on close
        setSize(Width,Height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private class CalculateButtonHandler implements ActionListener
    {
        public void actionPerformed(Action Event e)
        {
            double home, school, county, schTaxes, counTaxes, totTaxes;

            home = Double.parseDouble(homeTF.getText());
            school = Double.parseDouble(schoolTF.getText());
            county = Double.parseDouble(countyTF.getText());

            schTaxes = (school/100) * home;
            counTaxes = (county/100) * home;
            totTaxes = schTaxes + counTaxes;

            schoolTaxTF.setText("" + String.format("%.2f",schTaxes));
            countyTaxTF.setText("" + String.format("%.2f",counTaxes));
            totalTF.setText("" + String.format("%.2f",totTaxes));
        }
    }
    private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
          System.exit(0);
        }
    }
        public static void main(String[]args)
        {
            Residential_Tax_Calculator proptax = new Residential_Tax_Calculator();

        }
}


