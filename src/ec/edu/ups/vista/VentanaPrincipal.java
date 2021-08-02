/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.controladorJuego;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author surfa
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    int adivinados = 0;
    int contador = 0;
    int dimencion = 0;
    int tamanio = 0;
    String ramdomico;
    controladorJuego controladorJuego = new controladorJuego();
    ArrayList<String> palabras = new ArrayList();
    ArrayList<String> sinPalabras = new ArrayList();
    String pin = "";

    public VentanaPrincipal() {
        initComponents();
        tablaPalabras.setModel(controladorJuego.Leer(jTable2));
        colores(0);

    }

    public void colores(int contador) {
        if (contador == 0) {
            cabeza.setBackground(Color.GRAY);
            cuerpo.setBackground(Color.GRAY);
            piesIzquierdo.setBackground(Color.GRAY);
            piederecho.setBackground(Color.GRAY);
            brazoDerecho.setBackground(Color.GRAY);
            brazoIzquierdo.setBackground(Color.GRAY);
            soga.setBackground(Color.GRAY);
            banco1.setBackground(Color.ORANGE);
            banco2.setBackground(Color.ORANGE);
            banco3.setBackground(Color.ORANGE);
        } else if (contador == 1) {
            cabeza.setBackground(Color.YELLOW);
            cuerpo.setBackground(Color.GRAY);
            piesIzquierdo.setBackground(Color.GRAY);
            piederecho.setBackground(Color.GRAY);
            brazoDerecho.setBackground(Color.GRAY);
            brazoIzquierdo.setBackground(Color.GRAY);
            soga.setBackground(Color.GRAY);
            banco1.setBackground(Color.ORANGE);
            banco2.setBackground(Color.ORANGE);
            banco3.setBackground(Color.ORANGE);
        } else if (contador == 2) {
            cabeza.setBackground(Color.YELLOW);
            cuerpo.setBackground(Color.YELLOW);
            piesIzquierdo.setBackground(Color.GRAY);
            piederecho.setBackground(Color.GRAY);
            brazoDerecho.setBackground(Color.GRAY);
            brazoIzquierdo.setBackground(Color.GRAY);
            soga.setBackground(Color.GRAY);
            banco1.setBackground(Color.ORANGE);
            banco2.setBackground(Color.ORANGE);
            banco3.setBackground(Color.ORANGE);

        } else if (contador == 3) {
            cabeza.setBackground(Color.YELLOW);
            cuerpo.setBackground(Color.YELLOW);
            piesIzquierdo.setBackground(Color.YELLOW);
            piederecho.setBackground(Color.YELLOW);
            brazoDerecho.setBackground(Color.YELLOW);
            brazoIzquierdo.setBackground(Color.YELLOW);
            banco3.setBackground(Color.GRAY);
            banco1.setBackground(Color.ORANGE);
            banco2.setBackground(Color.ORANGE);
            banco3.setBackground(Color.ORANGE);

        } else if (contador == 4) {
            cabeza.setBackground(Color.YELLOW);
            cuerpo.setBackground(Color.YELLOW);
            piesIzquierdo.setBackground(Color.YELLOW);
            piederecho.setBackground(Color.YELLOW);
            brazoDerecho.setBackground(Color.YELLOW);
            brazoIzquierdo.setBackground(Color.YELLOW);
            soga.setBackground(Color.green);
            banco1.setBackground(Color.GRAY);
            banco2.setBackground(Color.GRAY);
            banco3.setBackground(Color.GRAY);
        }

    }

    public String palabraEncontrada() {
        int maximo = tablaPalabras.getRowCount() - 1;
        int min = 0;
        boolean fe = true;
        int doo = 0;

        while (fe) {
            Random aleatorio = new Random();
            int value = aleatorio.nextInt(maximo + min) + min;

            if (doo >= 20) {
                fe = false;

            }

            String tablabottonPlabras = sinPalabras.get(value);
            System.out.println("p2 RANDOM: " + tablabottonPlabras);
            //String tablabottonPlabras = tablaPalabras.getValueAt(value, 1).toString();
            if (contiene(tablabottonPlabras)) {

            } else {
                pin = tablabottonPlabras;
                fe = false;
            }
            doo++;

        }

        return pin;
    }

    public boolean contiene(String tablabottonPlabras) {
        boolean ente = false;
        for (int i = 0; i < palabras.size(); i++) {
            if (palabras.get(i).equals(tablabottonPlabras)) {
                ente = true;
                break;
            }
        }

        return ente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumeroIntentos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPalabras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        botonJugar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtInternos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cabeza = new javax.swing.JPanel();
        cuerpo = new javax.swing.JPanel();
        piesIzquierdo = new javax.swing.JPanel();
        brazoIzquierdo = new javax.swing.JPanel();
        brazoDerecho = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        soga = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        intento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aciertos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        banco1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        soga1 = new javax.swing.JPanel();
        soga2 = new javax.swing.JPanel();
        soga3 = new javax.swing.JPanel();
        soga4 = new javax.swing.JPanel();
        banco3 = new javax.swing.JPanel();
        piederecho = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        soga6 = new javax.swing.JPanel();
        banco2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeroIntentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroIntentosActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroIntentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 30));

        tablaPalabras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaPalabras);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 210));

        jLabel1.setText("Numero de intentos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 130, -1));

        botonJugar.setText("JUGAR-OCULTAR");
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(botonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 110, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 140, 50));

        txtInternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInternosActionPerformed(evt);
            }
        });
        getContentPane().add(txtInternos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 280, 30));

        jLabel5.setText("REGISTROS ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 90, 30));

        jLabel3.setText("Ingrese la palabra: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, 30));

        cabeza.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout cabezaLayout = new javax.swing.GroupLayout(cabeza);
        cabeza.setLayout(cabezaLayout);
        cabezaLayout.setHorizontalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        cabezaLayout.setVerticalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 70, 60));

        cuerpo.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout cuerpoLayout = new javax.swing.GroupLayout(cuerpo);
        cuerpo.setLayout(cuerpoLayout);
        cuerpoLayout.setHorizontalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        cuerpoLayout.setVerticalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(cuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 40, 150));

        piesIzquierdo.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout piesIzquierdoLayout = new javax.swing.GroupLayout(piesIzquierdo);
        piesIzquierdo.setLayout(piesIzquierdoLayout);
        piesIzquierdoLayout.setHorizontalGroup(
            piesIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        piesIzquierdoLayout.setVerticalGroup(
            piesIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(piesIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 20, 50));

        brazoIzquierdo.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout brazoIzquierdoLayout = new javax.swing.GroupLayout(brazoIzquierdo);
        brazoIzquierdo.setLayout(brazoIzquierdoLayout);
        brazoIzquierdoLayout.setHorizontalGroup(
            brazoIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        brazoIzquierdoLayout.setVerticalGroup(
            brazoIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(brazoIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 90, 20));

        brazoDerecho.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout brazoDerechoLayout = new javax.swing.GroupLayout(brazoDerecho);
        brazoDerecho.setLayout(brazoDerechoLayout);
        brazoDerechoLayout.setHorizontalGroup(
            brazoDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        brazoDerechoLayout.setVerticalGroup(
            brazoDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(brazoDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 80, 20));

        jPanel10.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 30, 400));

        jPanel11.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 230, 30));

        soga.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout sogaLayout = new javax.swing.GroupLayout(soga);
        soga.setLayout(sogaLayout);
        sogaLayout.setHorizontalGroup(
            sogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        sogaLayout.setVerticalGroup(
            sogaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(soga, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, 60));

        jButton1.setText("Intentar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 90, 30));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 100, 30));

        jLabel6.setText("Nombre del Jugador:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setText("Numero de intentos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 25));

        intento.setBackground(new java.awt.Color(255, 255, 255));
        intento.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(intento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 76, 19));

        jLabel2.setText("Numero de aciertos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 25));
        getContentPane().add(aciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 76, 19));

        jLabel7.setText("Intentos totales:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 54, 14));

        jLabel8.setText("ESTADISTICAS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 600, 40));

        banco1.setBackground(new java.awt.Color(102, 51, 0));
        banco1.setForeground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout banco1Layout = new javax.swing.GroupLayout(banco1);
        banco1.setLayout(banco1Layout);
        banco1Layout.setHorizontalGroup(
            banco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        banco1Layout.setVerticalGroup(
            banco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(banco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 200, 10));

        jPanel13.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 30));

        soga1.setBackground(new java.awt.Color(153, 153, 153));

        soga2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout soga2Layout = new javax.swing.GroupLayout(soga2);
        soga2.setLayout(soga2Layout);
        soga2Layout.setHorizontalGroup(
            soga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        soga2Layout.setVerticalGroup(
            soga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout soga1Layout = new javax.swing.GroupLayout(soga1);
        soga1.setLayout(soga1Layout);
        soga1Layout.setHorizontalGroup(
            soga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
            .addGroup(soga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(soga1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(soga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        soga1Layout.setVerticalGroup(
            soga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(soga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(soga1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(soga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(soga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, 50));

        soga3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout soga3Layout = new javax.swing.GroupLayout(soga3);
        soga3.setLayout(soga3Layout);
        soga3Layout.setHorizontalGroup(
            soga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        soga3Layout.setVerticalGroup(
            soga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(soga3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 30, 10));

        soga4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout soga4Layout = new javax.swing.GroupLayout(soga4);
        soga4.setLayout(soga4Layout);
        soga4Layout.setHorizontalGroup(
            soga4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        soga4Layout.setVerticalGroup(
            soga4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(soga4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 40, 10));

        banco3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout banco3Layout = new javax.swing.GroupLayout(banco3);
        banco3.setLayout(banco3Layout);
        banco3Layout.setHorizontalGroup(
            banco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        banco3Layout.setVerticalGroup(
            banco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(banco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, 50));

        piederecho.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout piederechoLayout = new javax.swing.GroupLayout(piederecho);
        piederecho.setLayout(piederechoLayout);
        piederechoLayout.setHorizontalGroup(
            piederechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        piederechoLayout.setVerticalGroup(
            piederechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(piederecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 20, -1));

        jPanel14.setBackground(new java.awt.Color(102, 102, 0));
        jPanel14.setForeground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 30, 390));

        soga6.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout soga6Layout = new javax.swing.GroupLayout(soga6);
        soga6.setLayout(soga6Layout);
        soga6Layout.setHorizontalGroup(
            soga6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        soga6Layout.setVerticalGroup(
            soga6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(soga6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, -1, 60));

        banco2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout banco2Layout = new javax.swing.GroupLayout(banco2);
        banco2.setLayout(banco2Layout);
        banco2Layout.setHorizontalGroup(
            banco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        banco2Layout.setVerticalGroup(
            banco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(banco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInternosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tablaPalabras.setModel(controladorJuego.Leer(tablaPalabras));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cadena = txtInternos.getText().toString();
        String nombre = txtnombre.getText().toString();
        int nume = Integer.valueOf(txtNumeroIntentos.getText().toString());
        if (controladorJuego.validad(cadena)) {
            if (controladorJuego.aumenta(cadena, ramdomico)) {
                palabras.add(cadena);
                tamanio++;
                aciertos.setText(String.valueOf(tamanio));

                if (tamanio == 10) {

                    controladorJuego.guardar(nombre, (dimencion + contador), sinPalabras.size(), palabras);

                } else {

                    ramdomico = palabraEncontrada();
                    dimencion = dimencion + contador;
                    total.setText(String.valueOf(dimencion));
                    contador = 0;
                    colores(contador);
                    intento.setText(String.valueOf(contador));

                }

            } else {
                contador++;
                intento.setText(String.valueOf(contador));
                total.setText(String.valueOf(dimencion + contador));

                if ((contador + dimencion) == nume) {
                    colores(contador);
                    total.setText(String.valueOf(dimencion + contador));
                    controladorJuego.guardar(nombre, nume, palabras.size(), palabras);

                } else if (contador < 4) {
                    colores(contador);

                } else if (contador == 4) {
                    colores(contador);
                    dimencion = dimencion + contador;
                    total.setText(String.valueOf(dimencion));
                    contador = 0;
                    ramdomico = palabraEncontrada();
                    colores(contador);
                    intento.setText(String.valueOf(contador));

                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        if (!txtnombre.getText().isEmpty() && !txtNumeroIntentos.getText().isEmpty()) {
            adivinados = 0;
            contador = 0;
            dimencion = 0;
            tamanio = 0;
            int maximo = tablaPalabras.getRowCount();
            int minimo = 1;
            boolean fe = true;
            for (int i = 0; i < tablaPalabras.getRowCount(); i++) {
                String tablabottonPlabras = tablaPalabras.getValueAt(i, 1).toString();
                sinPalabras.add(tablabottonPlabras);

            }
            ramdomico = palabraEncontrada();
            tablaPalabras.setModel(controladorJuego.direccionPal());

        } else {
            JOptionPane.showMessageDialog(null, "Llena todos lo datos para comenzar");
        }
    }//GEN-LAST:event_botonJugarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNumeroIntentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroIntentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroIntentosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aciertos;
    private javax.swing.JPanel banco1;
    private javax.swing.JPanel banco2;
    private javax.swing.JPanel banco3;
    private javax.swing.JButton botonJugar;
    private javax.swing.JPanel brazoDerecho;
    private javax.swing.JPanel brazoIzquierdo;
    private javax.swing.JPanel cabeza;
    private javax.swing.JPanel cuerpo;
    private javax.swing.JLabel intento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel piederecho;
    private javax.swing.JPanel piesIzquierdo;
    private javax.swing.JPanel soga;
    private javax.swing.JPanel soga1;
    private javax.swing.JPanel soga2;
    private javax.swing.JPanel soga3;
    private javax.swing.JPanel soga4;
    private javax.swing.JPanel soga6;
    private javax.swing.JTable tablaPalabras;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtInternos;
    private javax.swing.JTextField txtNumeroIntentos;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
