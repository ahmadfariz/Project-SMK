package kota;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author Ahmad Fariz
 */
public class Kota extends Canvas {
    
        public void paint(Graphics g) {
        setBackground(Color.cyan);
        //Nama      
        g.setColor(Color.BLACK); 
        g.setFont(new Font("Times new Roman", Font.BOLD,20));
        g.drawString("Ahmad Fariz Dwi Putra", 1150, 15);
        g.drawString("XII RPL 2", 1150, 40);
        g.drawString("03", 1150, 65);
        
        g.setColor(Color.orange);
        g.fillOval(200, 50, 200, 200);
        
        g.setColor(Color.GRAY); //Gunung
        g.fillArc(200, 150, 400, 400, 0, 180); 
        g.fillArc(0, 175, 600, 350, 90,90 ); 
        g.fillArc(550, 75, 500, 550, 0, 180); 
        g.fillArc(900, 150, 400, 400, 0, 180); 
        g.fillArc(1000, 150, 400, 400, 0, 180); 
        
        g.setColor(Color.BLACK); //Jalan
        g.fillRect(0, 350, 1380, 130);
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(0, 400, 100, 20);
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(150, 400, 100, 20);
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(300, 400, 100, 20);
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(450, 400, 100, 20);
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(600, 400, 100, 20);
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(750, 400, 100, 20);
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(900, 400, 100, 20);        
       
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(1050, 400, 100, 20);          
        
        g.setColor(Color.WHITE); //Garis Jalan
        g.fillRect(1200, 400, 100, 20);        
        

        g.setColor(Color.YELLOW);
        g.fillRect(210,370,100,30 ); //badan bawah
        g.fillOval(210,335,100,45); //badan atas
        g.fillArc (180,365,60,70,0,180);// atas ban
        g.fillArc (285,365,60,70,0,180);// atas ban
        g.setColor(Color.RED);
        g.fillArc (318,370,23,23,0,80);// atas ban
        g.setColor(Color.black); //ban
        g.fillOval(198, 380, 32,32); //ban
        g.fillOval(298, 380, 32,32); //ban
        g.setColor(Color.white); //ban
        g.fillOval(204, 385, 20,20); //ban
        g.fillOval(304, 385, 20,20); //ban
        g.setColor(Color.BLUE);
        g.fillArc (230,340,70,40,0,90);// atas ban
        g.setColor(Color.WHITE);
        g.fillArc (234,341,64,36,0,90);// atas ban
        g.setColor(Color.BLUE);
        g.fillArc (220,340,70,40,90,90);// atas ban
        g.setColor(Color.WHITE);
        g.fillArc (223,341,68,36,90,90);// atas ban
        g.setColor(Color.red);
        g.fillRect(257,341,10,18 );
        
        g.setColor(Color.MAGENTA);
        g.fillRect(600,370,100,30 ); //badan bawah
        g.fillOval(600,335,100,45); //badan atas
        g.fillArc (570,365,60,70,0,180);// atas ban
        g.fillArc (670,365,60,70,0,180);// atas ban
        g.setColor(Color.yellow);
        g.fillArc (700,370,23,23,0,80);// atas ban
        g.setColor(Color.black); //ban
        g.fillOval(680, 380, 32,32); //ban
        g.fillOval(580, 380, 32,32); //ban
        g.setColor(Color.white); //ban
        g.fillOval(686, 385, 20,20); //ban
        g.fillOval(586, 385, 20,20); //ban
        g.setColor(Color.YELLOW);
        g.fillArc (624,340,70,40,0,90);// atas ban
        g.setColor(Color.WHITE);
        g.fillArc (624,341,64,36,0,90);// atas ban
        g.setColor(Color.YELLOW);
        g.fillArc (614,340,70,40,90,90);// atas ban
        g.setColor(Color.WHITE);
        g.fillArc (615,341,68,36,90,90);// atas ban
        g.setColor(Color.red);
        g.fillRect(649,341,10,18 );

        g.setColor(Color.white);
        g.fillOval(10, 100, 30,30);
        g.fillOval(35, 100, 30,30);
        g.fillOval(60, 100, 30,30);
        g.fillOval(25, 80, 30,30);
        g.fillOval(42, 80, 30,30);
        
        g.setColor(Color.white);
        g.fillOval(200, 100, 30,30);
        g.fillOval(220, 100, 30,30);
        
        g.setColor(Color.white);
        g.fillOval(300, 100, 30,30);
        g.fillOval(320, 100, 30,30);
        
        g.setColor(Color.white);
        g.fillOval(600, 100, 30,30);
        g.fillOval(620, 100, 30,30);
        g.fillOval(640, 100, 30,30);
        g.fillOval(630, 80, 30,30);
        g.fillOval(620, 80, 30,30);
      
        g.setColor(Color.white);
        g.fillOval(900, 100, 30,30);
        g.fillOval(920, 100, 30,30);
        g.fillOval(940, 100, 30,30);
        g.fillOval(930, 80, 30,30);
        g.fillOval(920, 80, 30,30);
        
        g.setColor(Color.green);
        g.fillOval(495,240, 30,40);
        g.fillOval(480, 270, 30,30);
        g.fillOval(500, 270, 30,30);
        g.fillRect(500,290,9 ,60 );
        
        g.setColor(Color.green);
        g.fillOval(415,240, 30,40);
        g.fillOval(400, 270, 30,30);
        g.fillOval(420, 270, 30,30);
        g.fillRect(420,290,9 ,60 );
        
        g.setColor(Color.green);
        g.fillOval(315,240, 30,40);
        g.fillOval(300, 270, 30,30);
        g.fillOval(320, 270, 30,30);
        g.fillRect(320,290,9 ,60 );

        
        g.setColor(Color.lightGray); //Latar
        g.fillRect(0, 470, 1380, 400);
        
        g.setColor(Color.BLUE); // Sungai
        g.fillRect(0, 630, 1380, 130);
        
    }
    
}
