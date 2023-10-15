package Customer_Survey_Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.JDateChooser;

public class Form_page extends JFrame implements ActionListener {

    String[] list = {"Select", "India", "USA"};

    JComboBox<String> dropdown = new JComboBox(list);
    JDateChooser dateChooser;

    ButtonGroup gendergroup;

    JTextField nameTextField, lnameTextField, profTextField, mailTextField, mobTextField;
    JButton reset, submit;
    JRadioButton male, female, others;

    Form_page() {
        setTitle("Customer Survey Form");
        setLayout(null);

        JLabel text = new JLabel("Survey Form");
        text.setFont(new Font("Raleway", Font.BOLD, 38));
        text.setBounds(280, 25, 300, 50);
        add(text);

        JLabel name = new JLabel("First Name");
        name.setFont(new Font("Raleway", Font.PLAIN, 20));
        name.setBounds(70, 100, 250, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
        nameTextField.setBounds(250, 100, 350, 30);
        add(nameTextField);


        JLabel lname = new JLabel("Last Name");
        lname.setFont(new Font("Raleway", Font.PLAIN, 20));
        lname.setBounds(70, 150, 250, 30);
        add(lname);

        lnameTextField = new JTextField();
        lnameTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
        lnameTextField.setBounds(250, 150, 350, 30);
        add(lnameTextField);

        JLabel dob = new JLabel("Date of Birth");
        dob.setFont(new Font("Raleway", Font.PLAIN, 20));
        dob.setBounds(70, 200, 250, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(250, 200, 250, 30);
        add(dateChooser);


        JLabel country = new JLabel("Country");
        country.setFont(new Font("Raleway", Font.PLAIN, 20));
        country.setBounds(70, 250, 250, 30);
        add(country);
        dropdown.setBounds(250, 250, 250, 30);
        add(dropdown);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway", Font.PLAIN, 20));
        gender.setBounds(70, 300, 250, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(250, 300, 100, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(400, 300, 100, 30);
        female.setBackground(Color.white);
        add(female);

        others = new JRadioButton("Others");
        others.setBounds(550, 300, 100, 30);
        others.setBackground(Color.white);
        add(others);

        gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);


        JLabel prof = new JLabel("Profession");
        prof.setFont(new Font("Raleway", Font.PLAIN, 20));
        prof.setBounds(70, 350, 250, 30);
        add(prof);

        profTextField = new JTextField();
        profTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
        profTextField.setBounds(250, 350, 350, 30);
        add(profTextField);

        JLabel mail = new JLabel("Email");
        mail.setFont(new Font("Raleway", Font.PLAIN, 20));
        mail.setBounds(70, 400, 250, 30);
        add(mail);

        mailTextField = new JTextField();
        mailTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
        mailTextField.setBounds(250, 400, 350, 30);
        add(mailTextField);

        JLabel mob = new JLabel("Mobile Number");
        mob.setFont(new Font("Raleway", Font.PLAIN, 20));
        mob.setBounds(70, 450, 250, 30);
        add(mob);

        mobTextField = new JTextField();
        mobTextField.setFont(new Font("Raleway", Font.PLAIN, 20));
        mobTextField.setBounds(250, 450, 350, 30);
        add(mobTextField);


        reset = new JButton("Reset");
        reset.setBounds(350, 630, 100, 30);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        reset.addActionListener(this);
        add(reset);

        submit = new JButton("Submit");
        submit.setBounds(500, 630, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);


        setSize(800, 800);
        setLocation(80, 80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reset) {
            nameTextField.setText("");
            lnameTextField.setText("");
            mobTextField.setText("");
            mailTextField.setText("");
            profTextField.setText("");
            dateChooser.setDate(null);
            dropdown.setSelectedIndex(0);
            gendergroup.clearSelection();

        } else if (e.getSource() == submit) {
            String name = nameTextField.getText();
            String lname = lnameTextField.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String country = (String) dropdown.getSelectedItem();
            String gender = null;
            if (male.isSelected()) {
                gender = "male";
            } else if (female.isSelected()) {
                gender = "female";
            } else if (others.isSelected()) {
                gender = "others";
            }

            String prof = profTextField.getText();
            String mail = mailTextField.getText();
            String mob = mobTextField.getText();

            String message = "First Name: " + name + "\n" +
                    "Last Name: " + lname + "\n" +
                    "Date of Birth: " + dob + "\n" +
                    "Country: " + country + "\n" +
                    "Gender: " + gender + "\n" +
                    "Profession: " + prof + "\n" +
                    "Email: " + mail + "\n" +
                    "Mobile Number: " + mob;

            try {
                if (name.equals("") || lname.equals("") || dob.equals("") || country.equals("") || gender.equals("") || prof.equals("") || mail.equals("") || mob.equals("")) {
                    JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, message, "Survey Submitted", JOptionPane.INFORMATION_MESSAGE);

                    resetForm();

                }
            } catch (Exception ae) {
                System.out.println(ae);
            }
        }
    }


    public void resetForm(){

        nameTextField.setText("");
        lnameTextField.setText("");
        mobTextField.setText("");
        mailTextField.setText("");
        profTextField.setText("");
        dateChooser.setDate(null);
        dropdown.setSelectedIndex(0);
        gendergroup.clearSelection();

    }
}







