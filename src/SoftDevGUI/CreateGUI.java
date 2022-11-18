package SoftDevGUI;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static SoftDevGUI.MainQueryHandler.first;
public class CreateGUI extends JFrame implements ActionListener {
    //Constructor - creates a window
    JButton varCalc;
    JButton addStat;

    JButton updateStat;

    JButton delStat;

    JButton exit;
    JLabel varOut;

    JTextField staIdCalVarText;
    JTextField actCalVarText;

    JTextField tarCalVarText;

    JComboBox staListExisting;

    Border border;

    public static int varOutVal;
    public static boolean varOutbool;

    public static int target;

    public static int actual;

    public JPanel calVarPanel;

    String statSelected;
    String statSelected2;
    JTextField dateCalVarText;

    JTextField staIdAddStat;

    JTextField dateAddStat;

    JTextField tarAddStat;

    JTextField actAddText;
    public static String[][] myData2 = null;

    CreateGUI() {
        // Creating objects for use in the code below****************************************************************
        ImageIcon image = new ImageIcon("D:\\10. SRH_Academia\\1. All_Notes\\Semester 1\\6. Advance Programming" +
                "\\Java\\Assignment\\icon.jpg");

        border = BorderFactory.createLineBorder(Color.black); //Colour of the frame border

        //Labels**************************************************************************************************

        JLabel label = new JLabel();
        JLabel varLabel = new JLabel();
        JLabel addStLabel = new JLabel();
        JLabel statIDLabel = new JLabel();
        JLabel dateLabel = new JLabel();
        JLabel targetLabel = new JLabel();
        JLabel actLabel = new JLabel();
        varOut = new JLabel();
        JLabel newStat = new JLabel();
        JLabel newDateLabel = new JLabel();
        JLabel newTarget = new JLabel();
        JLabel newActual = new JLabel();



        // Buttons *************************************************************************************************

        varCalc = new JButton();
        addStat = new JButton();

        updateStat = new JButton();
        delStat = new JButton();
        exit = new JButton();

        // Text Box ***************************************************************************************

        staIdCalVarText = new JTextField();
        dateCalVarText = new JTextField();
        tarCalVarText = new JTextField();
        actCalVarText = new JTextField();

        staIdAddStat = new JTextField();
        dateAddStat = new JTextField();
        tarAddStat = new JTextField();
        actAddText = new JTextField();


        // Panels *************************************************************************************************
        calVarPanel = new JPanel();
        JPanel addStationPanel = new JPanel();

        // 'Project Window' label Creation*****************************************************************************
        label.setText("Project Window");
        //label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.CENTER); // Text position Left Center or Right
        label.setVerticalTextPosition(JLabel.CENTER); //Text Position Top Center or Bottom
        label.setForeground((Color.BLACK));
        label.setFont(new Font("Calibri", Font.PLAIN, 20)); //Text Font
        label.setIconTextGap(1); // Distance between Text and Image
        // label.setBackground(Color.cyan);
        // label.setOpaque(true);
        label.setBorder(border); //Adds border to the frame
        label.setVerticalAlignment(JLabel.TOP); // the image and text vertical alignment
        label.setHorizontalAlignment(JLabel.CENTER); // the image and text horizontal alignment
        label.setBounds(165, 0, 150, 25);

        //Creating Panel to calculate variance**********************************************************************

        varLabel.setText("Calculate Variance");
        varLabel.setForeground((Color.BLACK));
        varLabel.setFont(new Font("Calibri", Font.PLAIN, 20)); //Text Font
        //varLabel.setBorder(border); //Adds border to the label
        varLabel.setBounds(35, 10, 200, 23);

        calVarPanel.setBackground(new Color(173, 216, 230));
        calVarPanel.setLayout(null);
        calVarPanel.setBounds(10, 29, 220, 250);

        //Creating Panel to create new station*********************************************************************

        addStLabel.setText("Add Station");
        addStLabel.setForeground((Color.BLACK));
        addStLabel.setFont(new Font("Calibri", Font.PLAIN, 20)); //Text Font
        //addStLabel.setBorder(border); //Adds border to the label
        addStLabel.setBounds(65, 10, 150, 23);

        addStationPanel.setBackground(new Color(173, 216, 230));
        addStationPanel.setLayout(null);
        addStationPanel.setBounds(250, 29, 220, 250);

        // Creating labels for the fields to calculate variance ***************************************************
        statIDLabel.setText("Station ID: ");
        statIDLabel.setForeground((Color.BLACK));
        statIDLabel.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //statIDLabel.setBorder(border); //Adds border to the label
        statIDLabel.setBounds(10, 40, 70, 20);

        dateLabel.setText("Date: ");
        dateLabel.setForeground((Color.BLACK));
        dateLabel.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //dateLabel.setBorder(border); //Adds border to the label
        dateLabel.setBounds(10, 65, 70, 20);

        targetLabel.setText("Target: ");
        targetLabel.setForeground((Color.BLACK));

        targetLabel.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //targetLabel.setBorder(border); //Adds border to the label
        targetLabel.setBounds(10, 90, 70, 20);

        actLabel.setText("Actual: ");
        actLabel.setForeground((Color.BLACK));
        actLabel.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //actLabel.setBorder(border); //Adds border to the label
        actLabel.setBounds(10, 115, 70, 20);

        // Creating labels for adding a new station ***************************************************************

        newStat.setText("Station ID: ");
        newStat.setForeground((Color.BLACK));
        newStat.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //newStat.setBorder(border); //Adds border to the label
        newStat.setBounds(10, 40, 70, 20);

        newDateLabel.setText("Date: ");
        newDateLabel.setForeground((Color.BLACK));
        newDateLabel.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //newDateLabel.setBorder(border); //Adds border to the label
        newDateLabel.setBounds(10, 65, 70, 20);

        newTarget.setText("Target: ");
        newTarget.setForeground((Color.BLACK));
        newTarget.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //newDateLabel.setBorder(border); //Adds border to the label
        newTarget.setBounds(10, 90, 70, 20);

        newActual.setText("Actual: ");
        newActual.setForeground((Color.BLACK));
        newActual.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        //newActual.setBorder(border); //Adds border to the label
        newActual.setBounds(10, 115, 70, 20);


        // Creating Text Boxes ************************************************************************************
        // Station ID - Calculate Variance panel
        staIdCalVarText.setFont(new Font("Calibri", Font.PLAIN, 15));
        staIdCalVarText.setBounds(90, 40, 80, 20);

        // Date - Calculate Variance panel
        dateCalVarText.setFont(new Font("Calibri", Font.PLAIN, 15));
        dateCalVarText.setBounds(90, 65, 80, 20);

        // Target - Calculate Variance panel
        tarCalVarText.setFont(new Font("Calibri", Font.PLAIN, 15));
        tarCalVarText.setBounds(90, 90, 80, 20);

        // Actual - Calculate Variance panel
        actCalVarText.setFont(new Font("Calibri", Font.PLAIN, 15));
        actCalVarText.setBounds(90, 115, 80, 20);

        // Station ID - Add Station Panel
        staIdAddStat.setFont(new Font("Calibri", Font.PLAIN, 15));
        staIdAddStat.setBounds(90, 40, 80, 20);

        // Date - Add Station Panel
        dateAddStat.setFont(new Font("Calibri", Font.PLAIN, 15));
        dateAddStat.setBounds(90, 65, 80, 20);

        // Target - Add Station Panel
        tarAddStat.setFont(new Font("Calibri", Font.PLAIN, 15));
        tarAddStat.setBounds(90, 90, 80, 20);

        // Actual - Add Station Panel
        actAddText.setFont(new Font("Calibri", Font.PLAIN, 15));
        actAddText.setBounds(90, 115, 80, 20);

        // Creating buttons to add a station **********************************************************************

        varCalc.setBounds(10, 140, 90, 25);
        varCalc.setText("Calculate");
        varCalc.setFocusable(false);
        varCalc.addActionListener(this);

        addStat.setBounds(10, 140, 90, 25);
        addStat.setText("Add");
        addStat.setFocusable(false);
        addStat.addActionListener(this);

        delStat.setBounds(120, 140, 90, 25);
        delStat.setText("Delete");
        delStat.setFocusable(false);
        delStat.addActionListener(this);

        updateStat.setBounds(120, 140, 90, 25);
        updateStat.setText("Update");
        updateStat.setFocusable(false);
        updateStat.addActionListener(this);

        exit.setBounds(380, 285, 90, 25);
        exit.setText("Exit");
        exit.setFocusable(false);
        exit.addActionListener(this);

       // Adding labels, combobox, text-boxes and buttons to the Panels ****************************************************************
        calVarPanel.add(varLabel);
        calVarPanel.add(statIDLabel);
        calVarPanel.add(dateLabel);
        calVarPanel.add(targetLabel);
        calVarPanel.add(actLabel);
        calVarPanel.add(varCalc);
        calVarPanel.add(varOut);

        calVarPanel.add(staIdCalVarText);
        calVarPanel.add(dateCalVarText);
        calVarPanel.add(tarCalVarText);
        calVarPanel.add(actCalVarText);
        calVarPanel.add(updateStat);

        addStationPanel.add(newStat);
        addStationPanel.add(addStLabel);
        addStationPanel.add(newDateLabel);
        addStationPanel.add(newTarget);
        addStationPanel.add(newActual);
        addStationPanel.add(addStat);
        addStationPanel.add(delStat);

        addStationPanel.add(staIdAddStat);
        addStationPanel.add(dateAddStat);
        addStationPanel.add(tarAddStat);
        addStationPanel.add(actAddText);

        // Creating the Frame**************************************************************************************
        this.setIconImage(image.getImage()); // Gets the image created above
        this.getContentPane().setBackground(Color.WHITE); //Frame Background colour
        this.setTitle("Ice Cream Particulate Analyser - GUI888");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 450);
        this.setLayout(null);
        this.add(label);
        this.add(calVarPanel);
        this.add(addStationPanel);
        this.add(exit);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == varCalc) {
            target = Integer.parseInt(tarCalVarText.getText());
            actual = Integer.parseInt(actCalVarText.getText());
            varOutVal = CalculateVar.calcVar(target, actual);
            varOutbool = CalculateVar.retBool(varOutVal, target);
            varOut.setText("Variance: " + varOutVal);
            if (varOutbool) {
                varOut.setForeground(Color.GREEN);
                varOut.setFont(new Font("Calibri", Font.PLAIN, 40)); //Text Font
                varOut.setBackground(Color.cyan);
                varOut.setOpaque(true);
                varOut.setBorder(border); //Adds border to the frame
                varOut.setHorizontalAlignment(JLabel.CENTER);
                varOut.setVerticalAlignment(JLabel.CENTER);
                varOut.setBounds(115, 290, 230, 45);
                this.add(varOut);
                this.repaint();

            } else {
                varOut.setForeground(Color.RED);
                varOut.setFont(new Font("Calibri", Font.PLAIN, 40)); //Text Font
                varOut.setBackground(Color.GRAY);
                varOut.setOpaque(true);
                varOut.setBorder(border); //Adds border to the frame
                varOut.setHorizontalAlignment(JLabel.CENTER);
                varOut.setVerticalAlignment(JLabel.CENTER);
                varOut.setBounds(115, 290, 230, 45);
                this.add(varOut);
                this.repaint();

            }
        }
        if (event.getSource() == addStat) {

            AddStation newStat = new AddStation();
            int t = 0;
            t = Integer.parseInt(tarAddStat.getText());

            int a = 0;
            a = Integer.parseInt(actAddText.getText());
            int res = newStat.addStation((staIdAddStat.getText()), (dateAddStat.getText()), t, a);
            this.dispose();
            CreateGUI guiWindow = new CreateGUI();
            guiWindow.setVisible(true);
            FetchData bringStations = new FetchData();
            myData2 = bringStations.fetchData();
            guiWindow.loadCombo(myData2[0]);
            guiWindow.repaint();
        }

        if (event.getSource() == staListExisting) {
            statSelected = (String) staListExisting.getSelectedItem();
            staIdCalVarText.setText(statSelected);
            if (statSelected == "Select") {
                dateCalVarText.setText(null);
                tarCalVarText.setText(null);
            } else if (first == true){
                UsefulMethods bringNewData = new UsefulMethods();
                String[] latestData = bringNewData.findIndex(statSelected);
                dateCalVarText.setText(latestData[0]);
                tarCalVarText.setText(latestData[1]);
            }else {
                UsefulMethods bringNewData = new UsefulMethods();
                String[] latestData = bringNewData.findIndex(statSelected);
                dateCalVarText.setText(latestData[0]);
                tarCalVarText.setText(latestData[1]);
            }
            this.repaint();
        }

        if (event.getSource() == delStat) {
            statSelected2 = staIdCalVarText.getText();
            DelStation delStat = new DelStation();
            delStat.deleteStat(statSelected);
            this.dispose();
            CreateGUI guiWindow = new CreateGUI();
            guiWindow.setVisible(true);
            FetchData bringStations = new FetchData();
            myData2 = bringStations.fetchData();
            guiWindow.loadCombo(myData2[0]);
        }

        if (event.getSource() == updateStat) {
            statSelected2 = staIdCalVarText.getText();
            if (statSelected2 == "Select") {
                JOptionPane.showMessageDialog(null, "Select a Station First", "Title", JOptionPane.WARNING_MESSAGE);
            } else {
                int t;
                t = Integer.parseInt(tarCalVarText.getText());
                UpdateStation updateStation = new UpdateStation();
                updateStation.updateStat(statSelected2, (dateCalVarText.getText()), t);
                this.dispose();
                CreateGUI guiWindow = new CreateGUI();
                guiWindow.setVisible(true);
                FetchData bringStations = new FetchData();
                myData2 = bringStations.fetchData();
                guiWindow.loadCombo(myData2[0]);
                guiWindow.repaint();
            }

        }

        if (event.getSource() == exit) {
            JOptionPane.showMessageDialog(null, "Goodbye!", "Title", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
        }
    }

    public void loadCombo(String[] staArr) {

        JLabel existStat = new JLabel();
        // Creating a Combobox ************************************************************************************
        // Label for combobox
        existStat.setText("Existing Stations: ");
        existStat.setForeground((Color.BLACK));
        existStat.setFont(new Font("Calibri", Font.PLAIN, 15)); //Text Font
        existStat.setBounds(10, 180, 130, 20);
        staListExisting = new JComboBox(staArr);
        staListExisting.setBounds(10, 200, 120, 20);
        calVarPanel.add(staListExisting);
        calVarPanel.add(existStat);
        this.repaint();
        staListExisting.addActionListener(this);
    }
}


