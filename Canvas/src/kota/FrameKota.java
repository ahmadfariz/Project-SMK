package kota;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.*;

/**
 *
 * @author Ahmad Fariz
 */
public class FrameKota extends JFrame{
    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private Container konten = getContentPane();
    private Kota datar = new Kota();
    
    public FrameKota()
    {
    super ("Pemandangan");
    setVisible(true);
    setSize(1380,780);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    this.setLocationRelativeTo(null);
    konten.add(datar);
    }

 public static void main(String[] args)
    {
        try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException e)
    {
        }
        catch (ClassNotFoundException e)
        {
    }
        catch (InstantiationException e)
        {
    }
        catch (IllegalAccessException e)
        {
    }
    new FrameKota();
   }   
}
