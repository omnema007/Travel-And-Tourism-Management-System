package travel.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addpersonaldetails, viewpersonaldetails, updatepersonaldetails, checkpackages, bookpackages;
    JButton  viewpackages, viewhotels, destinations, bookhotel, viewbookedhotel, payments;
    JButton calculator, notepad, about, deletepersonaldetails, logout;
    Dashboard(String username) {
        this.username = username;
//        setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 120));
        p1.setBounds(0, 0, 1600, 60);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(10, 5, 45, 45);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(70, 5, 300, 50);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 120));
        p2.setBounds(0, 60, 250, 700);
        add(p2);
        
        addpersonaldetails = new JButton("Add Personal Details");
        addpersonaldetails.setBounds(0, 0, 250, 43);
        addpersonaldetails.setBackground(new Color(0, 0, 102));
        addpersonaldetails.setForeground(Color.WHITE);
        addpersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
        addpersonaldetails.setMargin(new Insets(0, 0, 0, 35));
        addpersonaldetails.addActionListener(this);
        p2.add(addpersonaldetails);
        
        updatepersonaldetails = new JButton("Update Personal Details");
        updatepersonaldetails.setBounds(0, 42, 250, 43);
        updatepersonaldetails.setBackground(new Color(0, 0, 102));
        updatepersonaldetails.setForeground(Color.WHITE);
        updatepersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
        updatepersonaldetails.setMargin(new Insets(0, 0, 0, 13));
        updatepersonaldetails.addActionListener(this);
        p2.add(updatepersonaldetails);
        
        viewpersonaldetails = new JButton("View Details");
        viewpersonaldetails.setBounds(0, 84, 250, 43);
        viewpersonaldetails.setBackground(new Color(0, 0, 102));
        viewpersonaldetails.setForeground(Color.WHITE);
        viewpersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
        viewpersonaldetails.setMargin(new Insets(0, 0, 0, 94));
        viewpersonaldetails.addActionListener(this);
        p2.add(viewpersonaldetails);
        
        deletepersonaldetails = new JButton("Delete Personal Details");
        deletepersonaldetails.setBounds(0, 126, 250, 43);
        deletepersonaldetails.setBackground(new Color(0, 0, 102));
        deletepersonaldetails.setForeground(Color.WHITE);
        deletepersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
        deletepersonaldetails.setMargin(new Insets(0, 0, 0, 15));
        deletepersonaldetails.addActionListener(this);
        p2.add(deletepersonaldetails);
        
        checkpackages = new JButton("Check Package");
        checkpackages.setBounds(0, 168, 250, 43);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 16));
        checkpackages.setMargin(new Insets(0, 0, 0, 70));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages = new JButton("Book Package");
        bookpackages.setBounds(0, 210, 250, 43);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 16));
        bookpackages.setMargin(new Insets(0, 0, 0, 75));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages = new JButton("View Package");
        viewpackages.setBounds(0, 252, 250, 43);
        viewpackages.setBackground(new Color(0, 0, 102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 16));
        viewpackages.setMargin(new Insets(0, 0, 0, 75));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 294, 250, 43);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 16));
        viewhotels.setMargin(new Insets(0, 0, 0, 88));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 336, 250, 43);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        bookhotel.setMargin(new Insets(0, 0, 0, 93));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0, 378, 250, 43);
        viewbookedhotel.setBackground(new Color(0, 0, 102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        viewbookedhotel.setMargin(new Insets(0, 0, 0, 37));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 420, 250, 43);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 16));
        destinations.setMargin(new Insets(0, 0, 0, 80));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton("Payments");
        payments.setBounds(0, 462, 250, 43);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 16));
        payments.setMargin(new Insets(0, 0, 0, 95));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 504, 250, 43);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 16));
        calculator.setMargin(new Insets(0, 0, 0, 95));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 546, 250, 43);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 16));
        notepad.setMargin(new Insets(0, 0, 0, 103));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0, 588, 250, 43);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 16));
        about.setMargin(new Insets(0, 0, 0, 120));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1450, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1450, 700);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(420, 50, 800, 80);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 40));
        image.add(text);
        
        logout = new JButton("Logout");
        logout.setBounds(1150, 15, 80, 30);
        logout.setBackground(Color.RED);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.PLAIN, 14));
        logout.addActionListener(this);
        p1.add(logout);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addpersonaldetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewpersonaldetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatepersonaldetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkpackages) {
            new CheckPackages();
        } else if (ae.getSource() == bookpackages) {
            new BookPackage(username);
        } else if (ae.getSource() == viewpackages) {
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        } else if (ae.getSource() ==  destinations) {
            new Destinations();
        } else if (ae.getSource() == bookhotel) {
            new BookHotel(username);
        } else if (ae.getSource() == viewbookedhotel) {
            new ViewBookedHotel(username);
        } else if (ae.getSource() == payments) {
            new Payment();
        } else if (ae.getSource() == calculator) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == notepad) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == about) {
            new About();
        } else if (ae.getSource() == deletepersonaldetails) {
            new DeleteDetails(username);
        } else if (ae.getSource() == logout) {
            
            JOptionPane.showMessageDialog(null, "You have logged out successfully");
            setVisible(false);
            new Login();
        }
    }
   
    
    public static void main(String[] args) {
        new Dashboard("");
    }
}
