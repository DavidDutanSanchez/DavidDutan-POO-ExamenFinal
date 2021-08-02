/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author surfa
 */
public interface IdaoJuego {
    
    public DefaultTableModel mostrarTabla();
    
    public boolean increment(String p1,String p2);
    
    public boolean ratificar(String cadena);
    
    public boolean guardar(String usuario,int intentos,int aciertos, ArrayList<String> p1s);
    
    public String aleatorio( ArrayList<String> p1sn);
   
    public boolean estadisticasJu(int intentosr,int intentosp,int adivinados);
    
}
