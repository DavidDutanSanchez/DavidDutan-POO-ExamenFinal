/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ec.edu.ups.idao.IdaoJuego;

/**
 *
 * @author surfa
 */
public class DaoJuego implements IdaoJuego {

    @Override
    public DefaultTableModel mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("p1");

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
            con++;
            Object data[] = {con, line};
            modelo.addRow(data);
           
        }

        return modelo;

    }

    public static void archivos(String directorioRaiz) {
        File carpeta = new File(directorioRaiz);
        if (carpeta.exists()) {
            File[] ficheros = carpeta.listFiles(); 
            for (File f : ficheros) {
                System.out.println(f.getName());
            }
        } else {

        }
    }

    @Override
    public boolean ratificar(String cadena) {
        boolean def=true;
        for (int i = 0; i < cadena.length(); i++)
		{
			char caracter = cadena.toUpperCase().charAt(i);
			int valorASCII = (int)caracter;
			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
				def= false; 
	}
       return def; 
    
    }

    @Override
    public boolean increment(String p1, String p2) {
        boolean der=false;
        System.out.println("p1 uno: "+p1+" palarba dos: "+p2);
        if(p1.equals(p2)){
           
           der=true; 
        }
        
            
    return der;
    
    }

    @Override
    public boolean guardar(String usuario, int intentos, int aciertos, ArrayList<String> palabras) {
        try {
            String currentPath = Paths.get("").toAbsolutePath().normalize().toString();
            String downloadFolder = "/filesToDownload";
            String downloadPath = currentPath + downloadFolder;
            File newFolder = new File(downloadPath);
            boolean dirCreated = newFolder.mkdir();

        
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-dd_HH-mm-ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            String fileName = "Reporte_" + dtf.format(now) + ".csv";

            File statText = new File(downloadPath + "/" + fileName);
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            
            
                String k=usuario+","+intentos+","+aciertos;
                String kk="";
                for (int j = 0; j < palabras.size(); j++) {
                    kk=kk+","+palabras.get(j);   
                }
                k=k+kk;
                w.write(k+"\n");
            
            w.close();
            return true;
        } catch (IOException e) {
            System.err.println("Problem writing to the file " + e);
        }
        return false;
    }

    @Override
    public boolean estadisticasJu(int intentosr, int intentosp, int  adivinados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String aleatorio(ArrayList<String> palabrasn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
