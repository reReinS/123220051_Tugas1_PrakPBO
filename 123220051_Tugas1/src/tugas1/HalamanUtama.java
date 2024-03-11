/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author febri
 */

   public class HalamanUtama extends JFrame{
       JLabel tulisan = new JLabel("Welcome, [Mr./Mrs.] [username]");
       JLabel tulisan2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
       
       JLabel labelPanjang = new JLabel("Panjang");
       JTextField inputPanjang = new JTextField();
       
       JLabel labelLebar = new JLabel("Lebar");
       JTextField inputLebar = new JTextField();
       
       JLabel labelTinggi = new JLabel("Tinggi");
       JTextField inputTinggi = new JTextField();
       
       JButton tombolHitung = new JButton("Hitung");
       JButton tombolReset = new JButton("Reset");
       
       JLabel hasil = new JLabel("Hasil");
       JLabel lPersegi = new JLabel("Luas Persegi");
       JLabel hLuas = new JLabel("[Hasil Berupa angka]");
       JLabel kPersegi = new JLabel("Keliling Persegi");
       JLabel hKeliling = new JLabel("[Hasil Berupa angka]");
       JLabel vBalok = new JLabel("Volume Balok");
       JLabel hVolume = new JLabel("[Hasil Berupa angka]");
       JLabel lpBalok = new JLabel("Luas Permukaan Balok");
       JLabel hLuasPermukaan = new JLabel("[Hasil Berupa angka]");
        
        public HalamanUtama(){
            setVisible(true);
            setSize(480,520);
            setTitle("Halaman Utama");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
            
            add(tulisan);
            tulisan.setBounds(30, 10, 350, 40);
            tulisan.setFont(tulisan.getFont().deriveFont(20f));
            
            add(tulisan2);
            tulisan2.setBounds(30, 35, 400, 40);
            tulisan2.setFont(tulisan2.getFont().deriveFont(13f));
            
            add(labelPanjang);
            labelPanjang.setBounds(30, 70, 100, 40);
            
            add(inputPanjang);
            inputPanjang.setBounds(130, 80, 250, 25);
            
            add(labelLebar);
            labelLebar.setBounds(30, 110, 100, 40);  
            
            add(inputLebar);
            inputLebar.setBounds(130, 120, 250, 25);
            
            add(labelTinggi);
            labelTinggi.setBounds(30, 150, 100, 40);
            
            add(inputTinggi);
            inputTinggi.setBounds(130, 160, 250, 25);
            
            add(tombolHitung);
            tombolHitung.setBounds(30, 200, 350, 28);
            
            add(tombolReset);
            tombolReset.setBounds(30, 240, 350, 28);
            
            add(hasil);
            hasil.setBounds(30, 280, 350, 40);
            hasil.setHorizontalAlignment(hasil.CENTER);
            
            add(lPersegi);
            lPersegi.setBounds(30, 310, 400, 40);
            
            add(hLuas);
            hLuas.setBounds(170, 310, 400, 40);
            
            add(kPersegi);
            kPersegi.setBounds(30, 340, 400, 40);
            
            add(hKeliling);
            hKeliling.setBounds(170, 340, 400, 40);
            
            add(vBalok);
            vBalok.setBounds(30, 370, 400, 40);
            
            add(hVolume);
            hVolume.setBounds(170, 370, 400, 40);
            
            add(lpBalok);
            lpBalok.setBounds(30, 400, 400, 40);
            
            add(hLuasPermukaan);
            hLuasPermukaan.setBounds(170, 400, 400, 40);
        }
    }
