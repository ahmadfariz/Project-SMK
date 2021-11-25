/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Ahmad Fariz
 */
public class bidang_datar extends Canvas{
    
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        
            g.setColor(Color.red);
            g.setFont(new Font("Tahoma",Font.ITALIC,14));
            g.drawString("Nama : ........... \u2502 Tugas RPL", 200, 50);
            g.drawString("NIS : ...........", 200, 70);
            g.drawString("Rekayasa Perangkat Lunak", 200, 90);
            
            g.setColor(Color.red);
            g.drawLine(1, 100, 800, 100);
            
            g.setColor(Color.red);
            g.drawLine(100, 1, 100, 800);
            
            g.setColor(Color.yellow);
            g.fillOval(130, 130, 100, 100);
            
            g.setColor(Color.green);
            g.fillRect(130, 300, 100, 100);
            
            g.setColor(Color.cyan);
            Polygon p01=new Polygon();
            p01.addPoint(400, 130); 
            p01.addPoint(450, 200); 
            p01.addPoint(350, 200);
            p01.addPoint(400, 130); 
            g.fillPolygon(p01);
            
            g.setColor(Color.blue);
            Polygon p02=new Polygon();
            p02.addPoint(400, 300); 
            p02.addPoint(300, 400); 
            p02.addPoint(500, 400); 
            p02.addPoint(600, 300); 
            g.fillPolygon(p02);
        }
}
