/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;
//PASO 1 - IMPORTAMOS LAS LIBRERIAS
import javax.swing.*;//iMPORTAMOS TODO DE SWING
import java.awt.*;

/**
 *
 * @author LAB08
 */
//PASO 2 -HEREDAR LA CLASE DESDE JFRAME
public class  Ventana extends JFrame
        
{
  //PASO 3 -DECLARAR ELEMENTOS A UTILIZAR
    JPanel panel;//Creacion de objeto JPanel
    JLabel label;
    JTextField text;
    JButton boton;
    JCheckBox check;
     JRadioButton radio;
     
    //PASO 4 - DEFINIR EL CONSTRUCTOR
public Ventana()
{
    //PASO 5 -CREAR E INICIALIZAR LOS OBJETOS
        panel = new JPanel();
        label = new JLabel();
        text = new JTextField(25);//25 son los caracteres
        boton = new JButton();
        check = new JCheckBox();
        radio = new JRadioButton();
       
        
        //PASO 6 - AGREGAR LOS ELEMENTOS AL JFRAME
        this.add(panel);//RECOMENDABLE AGREGAR EL JPANEL AL JFRAME
        panel.add(label);
        panel.add(text);
        panel.add(boton);
        panel.add(check);
        panel.add(radio);
        
        //PASO 7 -PROPIEDADES DE LOS ELEMENTOS
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.blue);//COLOR DE FONDO DEL JPANEL
}
}
