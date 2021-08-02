/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.DaoJuego;
import static ec.edu.ups.dao.DaoJuego.archivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author surfa
 */
public class controladorJuego {
    DaoJuego Objeto=new DaoJuego();
    
    
    public DefaultTableModel Leer(JTable tabla) {
        return Objeto.mostrarTabla();
    }
     public boolean validad(String cadena) {
         boolean excepcion1=false;
       if (Objeto.ratificar(cadena)) {
           
           
            excepcion1=true;
        }else{
            JOptionPane.showMessageDialog(null, "Solo letras");
            excepcion1=false;
           
       }
       return excepcion1;
    }
    
    public boolean aumenta(String p1,String p2) {
        boolean nui=false;
        if (Objeto.increment(p1,p2)) {
            nui=true;
           JOptionPane.showMessageDialog(null, " Muy bien");
        }else{
            nui=false;
            
            JOptionPane.showMessageDialog(null, "intenta otra vez");
           
       }
       return nui;
    }
    
    public void guardar(String usuario,int intentos,int aciertos, ArrayList<String> palabras) {
        if (Objeto.guardar(usuario,intentos,aciertos, palabras)) {
           JOptionPane.showMessageDialog(null, "Juega otra vez");
        }else{
            JOptionPane.showMessageDialog(null, "no se guardo"); 
       }
    }
    public void estadisticasJu(int intentosr,int intentosp,int adivinados){
        
        if (Objeto.estadisticasJu(intentosr,intentosp,adivinados)) {
           JOptionPane.showMessageDialog(null, "Juego finalizado");
           
        }else{
       }
    }
    public String aleatoriom( ArrayList<String> palabrasn){
       return Objeto.aleatorio(  palabrasn);
    }
    
    public DefaultTableModel direccionPal() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("palbra");

        String directorioRaiz = System.getProperty("user.dir");
        String bb=(directorioRaiz+"\\src\\ec\\edu\\ups\\modelo\\Palabras");
        archivos(directorioRaiz);

        Scanner scan = null;
        try {
            scan = new Scanner(new File(bb));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaoJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        int con = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String dopee="";
            for (int i = 0; i < line.length(); i++) {
                dopee=dopee+"x";
            }
            
            con++;
            Object data[] = {con, dopee};
            modelo.addRow(data);
            
        }

        return modelo;
    }
     
}
