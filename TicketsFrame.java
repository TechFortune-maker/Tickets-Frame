
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Osego
 */
public class TicketsFrame extends JFrame{
    //panels 
    private JPanel headingPn1;
    private JPanel namePn1;
    private JPanel surnamePn1;
    private JPanel customerDetailsPn1;
    private JPanel ticketsDetailsPn1;
    private JPanel homeTeamPn1;
    private JPanel awayTeamPn1;
    private JPanel costPricePn1;
    private JPanel numberOfTicketsPn1;
    private JPanel totalAmountDuePn1;
    private JPanel btns;
    private JPanel customerAndTicketsDetailsCombined;
    private JPanel mainPn1;
    
    //Labels 
    private JLabel headingLb1;
    private JLabel nameLb1;
    private JLabel surnameLb1;
    private JLabel homeTeamLb1;
    private JLabel awayTeamLb1;
    private JLabel costPriceLabel;
    private JLabel numberOfTicketsLb1;
    private JLabel totalAmountDueLb1;
    
    
    //text fields
    private JTextField nameTxtFld;
    private JTextField surnameeTxtFld;
    private JTextField homeTeamTxtFld;
    private JTextField awayTeamTxtFld;
    private JTextField costPriceTxtFld;
    private JTextField totalAmountDueTxtFld;
    
    private JSlider numTickectsSld;
    
    //buttons
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public TicketsFrame() {
        
        //Create a gui
        setTitle("Tickect sales");
        setSize(400,450);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create a panel
        headingPn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        customerDetailsPn1 = new JPanel(new GridLayout(2,1,1,1));
        customerDetailsPn1.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Customer details"));
        ticketsDetailsPn1 = new JPanel(new GridLayout(5,1,1,1));
        ticketsDetailsPn1.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Tickets details"));
        
        namePn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        homeTeamPn1 = new  JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costPricePn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numberOfTicketsPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalAmountDuePn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btns = new JPanel(new FlowLayout(FlowLayout.CENTER));
        customerAndTicketsDetailsCombined = new JPanel(new BorderLayout());
        mainPn1 = new JPanel(new BorderLayout());
        
        //Label the heading 
        
        headingLb1 = new JLabel("Soccer Match Tickets");
        headingLb1.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 40));
        headingLb1.setForeground(Color.CYAN);
        
        //label the customer details
        nameLb1 = new JLabel("Name:       ");
        surnameLb1 = new JLabel("Surname: ");
        homeTeamLb1 = new JLabel("Home team:  ");
        awayTeamLb1 = new JLabel("Away team:    ");
        costPriceLabel = new JLabel("Cost price: R");
        numberOfTicketsLb1 = new JLabel("Number of tickets required: ");
        totalAmountDueLb1 = new JLabel("Total amount due: R");
       
        //create text  fields
        
        nameTxtFld = new JTextField(10);
        nameTxtFld.setFocusable(true);
        
        surnameeTxtFld = new JTextField(10);
        homeTeamTxtFld = new JTextField(10);
        awayTeamTxtFld = new JTextField(10);
        costPriceTxtFld = new JTextField(10);
        
        totalAmountDueTxtFld = new JTextField(20);
        totalAmountDueTxtFld.setText("To be calculated later.");
        totalAmountDueTxtFld.setEditable(false);
        
        numTickectsSld = new JSlider(1,20);
        //add customer details to their panels
        
        //create buttons 
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");

        namePn1.add(nameLb1);
        namePn1.add(nameTxtFld);
        
        surnamePn1.add(surnameLb1);
        surnamePn1.add(surnameeTxtFld);
        
        //add ticket details to their panels
        
        homeTeamPn1.add(homeTeamLb1);
        homeTeamPn1.add(homeTeamTxtFld);
       
        
        awayTeamPn1.add(awayTeamLb1);
        awayTeamPn1.add(awayTeamTxtFld);
        
        costPricePn1.add(costPriceLabel);
        costPricePn1.add(costPriceTxtFld);

        numberOfTicketsPn1.add(numberOfTicketsLb1);
        numberOfTicketsPn1.add(numTickectsSld);
        
        totalAmountDuePn1.add(totalAmountDueLb1);
        totalAmountDuePn1.add(totalAmountDueTxtFld);
        
        btns.add(buyBtn);
        btns.add(clearBtn);
        btns.add(exitBtn);
        
        //add customer details to their collective panel
        
        customerDetailsPn1.add(namePn1);
        customerDetailsPn1.add(surnamePn1);
        
        ticketsDetailsPn1.add(homeTeamPn1);
        ticketsDetailsPn1.add(awayTeamPn1);
        ticketsDetailsPn1.add(costPricePn1);
        ticketsDetailsPn1.add(numberOfTicketsPn1);
        ticketsDetailsPn1.add(totalAmountDuePn1);
        
        
        customerAndTicketsDetailsCombined.add(customerDetailsPn1, BorderLayout.NORTH);
        customerAndTicketsDetailsCombined.add(ticketsDetailsPn1, BorderLayout.CENTER);
        
        
        headingPn1.add(headingLb1);
        mainPn1.add(headingPn1, BorderLayout.NORTH);
        mainPn1.add(customerAndTicketsDetailsCombined, BorderLayout.CENTER);
        mainPn1.add(btns, BorderLayout.SOUTH);
        
        //add main panel to the frame
        add(mainPn1);
        pack();
        
        setVisible(true);
    }
    
    
    
    
    
}
