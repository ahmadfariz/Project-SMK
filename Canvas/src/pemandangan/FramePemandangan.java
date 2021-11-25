package pemandangan;

//Library
import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.*;


public class FramePemandangan extends JFrame {
 Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
 private Container konten = getContentPane();
 private Pemandangan datar = new Pemandangan();

//Membuat Konstruktor
 public FramePemandangan()
 { //Awal Konstruktor
 super ("Pemandangan");
 setVisible(true);
 setSize(1380,780);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setResizable(false);
 this.setLocationRelativeTo(null); //Membuat tampilan Frame di tengah layar monitor
 konten.add(datar);
 } //Akhir Konstruktor

 public static void main(String[] args)
 {
 //Membuat Look and Feel Java Nimbus
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
 new FramePemandangan();
}}
