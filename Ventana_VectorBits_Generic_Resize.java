import Parte_Lógica.VectorBits_Generic_Resize;//Ventana vector bitwise generico redimensionado 

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane;


public class Ventana_VectorBits_Generic_Resize{//Ventana vector bitwise generico redimensionado 
  /*-----------*/
  /* Atributos */
  /*-----------*/
  private VectorBits_Generic_Resize A;
  /*oooooooooooooooooooooooooooooooooo*/
  /* Ventana */
  private JFrame Ventana;

  /*Button*/
  private JButton Insertar;
  private JButton Sacar;
  private JButton Constructor;
  
  /*Caja de texto*/
  private JTextField Insertar_ElementoTxt;
  private JTextField Insertar_PositionTxt;
  private JTextField SacarTxt;
  private JTextField MostrarTxt;
  
  /*Labels*/
  private JLabel labelMostrar;
  
  /*oooooooooooooooooooooooooooooooooo*/
  //Clase pincipal
  public static void main(String[] args){  
    new Ventana_VectorBits_Generic_Resize();//Ventana vector bitwise generico redimensionado 
  }
  
  //Constructor De la Ventana
  public Ventana_VectorBits_Generic_Resize(){
    //Variablede tipo JFrame    
    Ventana = new JFrame("Ventanita Vector Bitwise");
    Ventana.setSize(850,550);
    Ventana.getContentPane().setBackground(Color.white);
    Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*Finaliza el programa*/
    Ventana.setLayout(new GridBagLayout());
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*+++++++++ ColorLighBlue+++++++++++*/
    /*++++++++++++++++++++++++++++++++++*/
    
    //Creamos nuetro propio color celeste	
    Color lightBlue = new Color(51, 153, 255); 	
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*+++Declaramos todos los Botones+++*/
    /*+++++++++++++++++++++++++++++++++*/
    
    //Declaramos botón Insertar
    Insertar = new JButton("Insertar");
    Insertar.setForeground(Color.white);
    Border Border_Insertar = BorderFactory.createLineBorder(Color.darkGray, 2);
    Insertar.setBorder(Border_Insertar);
    Insertar.setBackground(lightBlue);
    
    //Declaramos botón Sacar
    Sacar = new JButton("Sacar");
    Sacar.setForeground(Color.white);
    Sacar.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    Sacar.setBackground(lightBlue);
    
    //Declaramos botón Constructor
    Constructor = new JButton("Constructor");
    Constructor.setForeground(Color.white);
    Constructor.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    Constructor.setBackground(lightBlue);
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*Declarando todas las Cajas de texto*/
    /*+++++++++++++++++++++++++++++++++++*/
    
    //Declaramos la caja Insertar_ElementoTxt
    Insertar_ElementoTxt = new JTextField("");
    Border BordeInsertar_ElementoTxt = BorderFactory.createLineBorder(lightBlue, 2);
    Insertar_ElementoTxt.setBorder(BordeInsertar_ElementoTxt);
    
    //Declaramos la caja Insertar_PositionTxt
    Insertar_PositionTxt = new JTextField("");
    Border BordeInsertar_PositionTxt = BorderFactory.createLineBorder(lightBlue, 2);
    Insertar_PositionTxt.setBorder(BordeInsertar_PositionTxt);
    
    //Declaramos la caja SacarTxt
    SacarTxt = new JTextField("");
    Border BorderSacarTxt = BorderFactory.createLineBorder(lightBlue, 2);
    SacarTxt.setBorder(BorderSacarTxt);
    
    //Declaramos la caja MostrarTxt
    MostrarTxt = new JTextField("");
    Border BorderMostrarTxt = BorderFactory.createLineBorder(lightBlue, 2);
    MostrarTxt.setBorder(BorderMostrarTxt);
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*****Declarando todos los labels*****/
    /*+++++++++++++++++++++++++++++++++++*/
    
    //Declaramos todos los labels    
    labelMostrar = new JLabel("Mostrar");
    labelMostrar.setFont(new Font("Arial", 0, 18));
    
    /*-------Objeto de configuración del grid-------*/
    GridBagConstraints gridConf = new GridBagConstraints();
    gridConf.fill = GridBagConstraints.HORIZONTAL;
    /*---------------------------------------------*/
    
    /*-------------------------------*/
    /* Adherir elementos a la ventana*/
    /*-------------------------------*/
    
    /*+++++++*/
    /*Botones*/
    /*+++++++*/
    
    //Confi de Cosntructor
    gridConf.ipady = 20;
    gridConf.ipadx = 20;
    gridConf.gridwidth = 2;
    gridConf.insets = new Insets(10,10,10,10);
    
    //Ayadir Constructor en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 0;
    Ventana.add(Constructor, gridConf);
    
    //Confi de Insertar
    
    //Ayadir Insertar en la ventana
    gridConf.gridy = 1;
    Ventana.add(Insertar, gridConf);
    
    //Confi de Sacar
    //Ayadir Sacar en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 2;
    Ventana.add(Sacar, gridConf);
    
    
    /*+++++++++++++*/
    /*Caja de Texto*/
    /*+++++++++++++*/
    
    /*Confi de pocicion Insertar_ElementoTxt*/
    gridConf.gridx = 2;
    gridConf.gridy = 1;
    gridConf.ipady = 20;
    gridConf.ipadx = 50;
    gridConf.gridwidth = 1;
    gridConf.insets = new Insets(10,10,10,10); //padding
    
    //Añadir Insertar_ElementoTxt a la ventana
    Ventana.add(Insertar_ElementoTxt, gridConf);
    
    /*Confi de pocicion Insertar_PositionTxt*/
    gridConf.gridx = 3;
    gridConf.gridy = 1;
    
    //Añadir Insertar_PositionTxt a la ventana
    Ventana.add(Insertar_PositionTxt, gridConf);
    
    
    /*Confi de pocicion SacarTxt*/
    gridConf.gridx = 2;
    gridConf.gridy = 2;
    
    //Añadir SacarTxt a la ventana
    Ventana.add(SacarTxt, gridConf);
    
    /*Confi de pocicion MostrarTxt*/
    gridConf.ipady = 20;
    gridConf.ipadx = 300;
    gridConf.gridwidth = 3;
    gridConf.gridy = 3;
    
    //Añadir MostrarTxt a la ventana
    Ventana.add(MostrarTxt, gridConf);
    gridConf.ipadx = 50;
    gridConf.gridwidth = 1;
    /*++++++++*/
    /**Labels**/
    /*++++++++*/
    gridConf.gridx = 1;
    gridConf.gridy = 3;
    gridConf.ipadx = 15;
    Ventana.add(labelMostrar, gridConf); 
    
    /*****************************************/
    /*******Onclick De los Botoncitos*********/
    /*****************************************/ 
    
    //onclick Constructor
    Constructor.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Constructor_Click();
      }
    });
    
    //onclick Insertar
    Insertar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Insertar_Click();
      }
    });
    
    //onclick Sacar
    Sacar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Sacar_Click();
      }
    });
    
    /*------------------------*/
    //ventanaM.pack();
    Ventana.setVisible(true);//Configurando visualización de la ventana
    /*------------------------*/  
  }
  public void Constructor_Click(){
    int Cantidad = Integer.parseInt(JOptionPane.showInputDialog(Ventana, "Ingresar la cantidad: "));
    int NumberBit = Integer.parseInt(JOptionPane.showInputDialog(Ventana, "Ingresar Número de bits: "));
    A = new VectorBits_Generic_Resize(Cantidad, NumberBit);
    MostrarTxt.setText(String.valueOf(A.ObtenerTodo()));
  }
  
  public void Insertar_Click(){
    
    int Elemento = Integer.parseInt(Insertar_ElementoTxt.getText());
    int Position = Integer.parseInt(Insertar_PositionTxt.getText());
    A.Insertar(Elemento, Position);
    MostrarTxt.setText(String.valueOf(A.ObtenerTodo()));
  }
  
  public void Sacar_Click(){
    int Position = Integer.parseInt(SacarTxt.getText());
    A.Sacar(Position);
    //MostrarTxt.setText(String.valueOf(A.Sacar(Position)));
    MostrarTxt.setText(String.valueOf(A.ObtenerTodo()));
    //MostrarTxt.setText(A.ObtenerTodo());
  }
}
