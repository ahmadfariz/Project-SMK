package pemandangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author rendra
 */
public class Pemandangan extends Canvas {
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        //Nama      
        g.setColor(Color.BLACK); 
        g.setFont(new Font("Times new Roman", Font.BOLD,20));
        g.drawString("Alifianto Narendra I. M", 1150, 15);
        g.drawString("XII RPL 2", 1150, 40);
        g.drawString("06", 1150, 65);
        
        //Awan 
        //Awan 1
        g.setColor(Color.white);
        g.fillOval(10, 100, 30,30);
        g.fillOval(35, 100, 30,30);
        g.fillOval(60, 100, 30,30);
        g.fillOval(25, 80, 30,30);
        g.fillOval(42, 80, 30,30);
        //Awan 2
        g.fillOval(210, 80, 30,30);
        g.fillOval(235, 80, 30,30);
        g.fillOval(260, 80, 30,30);
        g.fillOval(225, 60, 30,30);
        g.fillOval(242, 60, 30,30);
        //Awan 3
        g.fillOval(500, 50, 30,30);
        g.fillOval(525, 50, 30,30);
        g.fillOval(550, 50, 30,30);
        g.fillOval(515, 30, 30,30);
        g.fillOval(532, 30, 30,30);
        //Awan 4
        g.fillOval(690, 80, 30,30);
        g.fillOval(715, 80, 30,30);
        g.fillOval(740, 80, 30,30);
        g.fillOval(705, 60, 30,30);
        g.fillOval(722, 60, 30,30);
        //Awan 5
        g.fillOval(980, 40, 30,30);
        g.fillOval(1005, 40, 30,30);
        g.fillOval(1030, 40, 30,30);
        g.fillOval(995, 20, 30,30);
        g.fillOval(1012, 20, 30,30);
        //Awan 6
//        g.fillOval(1150, 100, 30,30);
//        g.fillOval(1175, 100, 30,30);
//        g.fillOval(1200, 100, 30,30);
//        g.fillOval(1165, 80, 30,30);
//        g.fillOval(1190, 80, 30,30);
        
        //Matahari
        g.setColor(Color.orange);
        g.fillOval(730, 200, 200, 200);
        
        //Gunung 1
        g.setColor(Color.blue);
        Polygon gunung1 = new Polygon();
        gunung1.addPoint(450, 100); //kiri atas
        gunung1.addPoint(0, 400); //kiri bawah

        gunung1.addPoint(900, 400); //kanan bawah
        gunung1.addPoint(450, 100); //kanan atas

        g.fillPolygon(gunung1);
        
        //Gunung 2
        g.setColor(Color.blue);
        Polygon gunung2 = new Polygon();
        gunung2.addPoint(1120, 150); //kiri atas
        gunung2.addPoint(800, 400); //kiri bawah

        gunung2.addPoint(1380, 400); //kanan bawah
        gunung2.addPoint(1120, 150); //kanan atas

        g.fillPolygon(gunung2);
        
        //Tanah
        g.setColor(new Color(138, 154, 91));
        g.fillRect(0, 400, 1380, 380);
        
        //Jalan
        g.setColor(Color.darkGray);
        g.fillRect(800, 400, 100, 380);
        
        //Garis putus2 jalan 1
        g.setColor(Color.white);
        g.fillRect(840, 440, 20, 100);
        
        //Garis putus2 jalan 2
        g.setColor(Color.white);
        g.fillRect(840, 600, 20, 100);
        
        //Rumah
        //Atap Rumah
        g.setColor(new Color(150, 75, 0));
        Polygon atap = new Polygon();

        atap.addPoint(250, 420); //kiri atas
        atap.addPoint(400, 500); //kiri bawah

        atap.addPoint(100, 500); //kanan bawah
        atap.addPoint(250, 420); //kanan atas

        g.fillPolygon(atap);
        
        //kotak Rumah
        g.setColor(new Color(254, 230, 168));
        g.fillRect(150, 500, 200, 200);
        
        //Pintu Rumah
        g.setColor(Color.blue);
        g.fillRect(170, 550, 80, 150);
        
        //Pegangan Pintu
        g.setColor(Color.yellow);
        g.fillOval(230, 620, 10, 10);
        
        //Bingkai Jendela
        g.setColor(Color.blue);
        g.drawRect(270, 550, 60, 50);
        
        //Jendela
        g.setColor(Color.cyan);
        g.fillRect(271, 551, 59, 49);
        
        //Pohon1
        g.setColor(new Color(47, 33, 13));
        g.fillRect(530, 440, 30, 200);
        //Daun1
        g.setColor(Color.green);
        g.fillOval(520, 400, 50, 50);
        g.fillOval(490, 400, 50, 50);
        g.fillOval(550, 400, 50, 50);
        g.fillOval(505, 380, 50, 50);
        g.fillOval(535, 380, 50, 50);
        g.fillOval(520, 360, 50, 50);
        g.fillOval(545, 370, 50, 50);
        g.fillOval(495, 370, 50, 50);
        
        //Pohon2
        g.setColor(new Color(47, 33, 13));
        g.fillRect(930, 440, 30, 200);
        //Daun2
        g.setColor(Color.green);
        g.fillOval(920, 400, 50, 50);
        g.fillOval(890, 400, 50, 50);
        g.fillOval(950, 400, 50, 50);
        g.fillOval(905, 380, 50, 50);
        g.fillOval(935, 380, 50, 50);
        g.fillOval(920, 360, 50, 50);
        g.fillOval(945, 370, 50, 50);
        g.fillOval(895, 370, 50, 50);
        
        //Pohon3
        g.setColor(new Color(47, 33, 13));
        g.fillRect(1220, 490, 30, 200);
        //Daun3
        g.setColor(Color.green);
        g.fillOval(1210, 450, 50, 50);
        g.fillOval(1180, 450, 50, 50);
        g.fillOval(1240, 450, 50, 50);
        g.fillOval(1195, 430, 50, 50);
        g.fillOval(1225, 430, 50, 50);
        g.fillOval(1205, 410, 50, 50);
        g.fillOval(1230, 420, 50, 50);
        g.fillOval(1180, 420, 50, 50);
    }
}
