/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author febri
 */
     
public class HalamanLogin extends JFrame {
       JLabel judul = new JLabel("Selamat Datang!");
       JLabel judul2 = new JLabel("Silahkan masuk untuk melanjutkan.");
       
       JLabel labelUsername = new JLabel("Username");
       JTextField inputUsername = new JTextField();
       
       JLabel labelPw = new JLabel("Password");
       JTextField inputPw = new JTextField();
       
       JLabel labelGender = new JLabel("Jenis Kelamin");
       JRadioButton rlaki = new JRadioButton("Laki-Laki");
       JRadioButton rpuan = new JRadioButton("Perempuan");
       
       JButton tombolLogin = new JButton("Login");
       
           public HalamanLogin(){
           setVisible(true);
           setSize(480,520);
           setTitle("Login Page");
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setLayout(null);
           
           add(judul);
           judul.setBounds(30, 10, 200, 40);
           judul.setFont(judul.getFont().deriveFont(20f));
           
           add(judul2);
           judul2.setBounds(30, 35, 280, 40);
           judul2.setFont(judul2.getFont().deriveFont(13f));
           
           add(labelUsername);
           labelUsername.setBounds(30, 70, 100, 40);
           
           add(inputUsername);
           inputUsername.setBounds(30, 105, 300, 25);
           
           add(labelPw);
           labelPw.setBounds(30, 135, 100, 40);
           
           add(inputPw);
           inputPw.setBounds(30, 170, 300, 25);
           
           add(labelGender);
           ButtonGroup pilGender = new ButtonGroup();
           pilGender.add(rlaki);
           pilGender.add(rpuan);
           labelGender.setBounds(30, 200, 100, 40);
           
           add(rlaki);
           rlaki.setBounds(30, 225, 100, 40);
           
           add(rpuan);
           rpuan.setBounds(150, 225, 100, 40);
           
           add(tombolLogin);
           tombolLogin.setBounds(30, 275, 300, 28);
   }
   }
