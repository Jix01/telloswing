package com.jix.tello;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Tello extends javax.swing.JFrame {

    private DatagramSocket ds;
    private InetAddress ipAddress;

    private Integer udpPort;

    public Tello() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tello");
        setLocation(new java.awt.Point(50, 100));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setText("Status");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Video"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jLabel2.setText("Desconected");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));

        jScrollPane2.setEnabled(false);

        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(0, 204, 51));
        jTextArea2.setRows(5);
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 204, 51));
        jTextArea2.setEnabled(false);
        jTextArea2.setSelectionColor(new java.awt.Color(51, 255, 51));
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        jLabel3.setText("O -->Connect");

        jLabel4.setText("P --> Close");

        jLabel5.setText("Battery");

        jLabel6.setText("-");

        jLabel7.setText("W --> Forward");

        jLabel8.setText("S --> Back");

        jLabel9.setText("UPKey --> Up");

        jLabel10.setText("DOWNKey --> Down");

        jLabel11.setText("LEFTKey --> Left");

        jLabel12.setText("RIGHTKey --> Right");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int keycode = evt.getKeyCode();

        switch (keycode) {
            case java.awt.event.KeyEvent.VK_LEFT:
                jTextArea2.append("Left" + "\n");
                this.left((float) 20);
                break;
            case java.awt.event.KeyEvent.VK_RIGHT:
                jTextArea2.append("Right" + "\n");
                this.right((float) 20);
                break;
            case java.awt.event.KeyEvent.VK_DOWN:
                jTextArea2.append("Down..." + "\n");
                this.down((float) 20);
                break;
            case java.awt.event.KeyEvent.VK_UP:
                jTextArea2.append("Up..." + "\n");
                this.up((float) 20);
                break;
            case java.awt.event.KeyEvent.VK_W:
                jTextArea2.append("Fordward..." + "\n");
                this.forward((float) 20);
                break;
            case java.awt.event.KeyEvent.VK_S:
                jTextArea2.append("Back..." + "\n");
                this.back((float) 20);
                break;
            case java.awt.event.KeyEvent.VK_ENTER:
                jTextArea2.append("Takeof..." + "\n");
                this.takeof();
                break;
            case java.awt.event.KeyEvent.VK_SPACE:
                jTextArea2.append("Land..." + "\n");
                this.land();
                break;
            case java.awt.event.KeyEvent.VK_B:
                jTextArea2.append("Battery..." + "\n");
                this.battery();
                break;
            case java.awt.event.KeyEvent.VK_O:
                jTextArea2.append("Connect..." + "\n");
                this.connect();
                this.initializing();
                this.battery();
                break;
            case java.awt.event.KeyEvent.VK_P:
                jTextArea2.append("Close conection..." + "\n");
                this.close();
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
                    javax.swing.UIManager.setLookAndFeel(new MetalLookAndFeel());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tello().setVisible(true);
            }
        });
    }

    public void connect() {
        try {
            this.ipAddress = Inet4Address.getByName("192.168.10.1");
            this.udpPort = 8889;
            this.ds = new DatagramSocket(udpPort);
            ds.connect(ipAddress, udpPort);

            if (!ds.isConnected()) {
                jTextArea2.append("Tello disconnected..." + "\n");
                jLabel2.setText("Disconnected");
            } else {
                jTextArea2.append("Tello connected..." + "\n");
                jLabel2.setText("Connected");
            }

        } catch (UnknownHostException e) {
            jTextArea2.append("UnknownHostException..." + e + "\n");
        } catch (SocketException e) {
            jTextArea2.append("SocketException..." + e + "\n");
        }
    }

    public void initializing() {
        try {
            this.sendData("command");
            jTextArea2.append("Respuesta iniciar..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void close() {
        //this.ds.disconnect();
        //this.ds.close();
        jLabel2.setText("Disconnected");
    }

    public void battery() {
        try {
            this.sendData("battery?");
            jTextArea2.append("Response battery..." + this.receiveData() + "\n");
            jLabel6.setText(this.receiveData());
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void takeof() {
        try {
            this.sendData("takeoff");
            jTextArea2.append("Respuesta despegar..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void land() {
        try {
            this.sendData("land");
            jTextArea2.append("Respuesta aterrizar..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void up(float dist) {
        try {
            this.sendData("up " + dist);
            jTextArea2.append("Respuesta arriba..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void down(float dist) {
        try {
            this.sendData("down " + dist);
            jTextArea2.append("Respuesta abajo..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void left(float dist) {
        try {
            this.sendData("left " + dist);
            jTextArea2.append("Respuesta izquierda..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void right(float dist) {
        try {
            this.sendData("right " + dist);
            jTextArea2.append("Respuesta derecha..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void forward(float dist) {
        try {
            this.sendData("forward " + dist);
            jTextArea2.append("Respuesta adelante..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    public void back(float dist) {
        try {
            this.sendData("back " + dist);
            jTextArea2.append("Respuesta atras..." + this.receiveData() + "\n");
        } catch (IOException e) {
            jTextArea2.append("IOException..." + e + "\n");
        }
    }

    private void sendData(String data) throws IOException {
        byte[] sendData = data.getBytes();
        final DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress,
                udpPort);
        ds.send(sendPacket);
    }

    private String receiveData() throws IOException {
        byte[] receiveData = new byte[1024];
        final DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        ds.receive(receivePacket);
        return trimExecutionResponse(receiveData, receivePacket);
    }

    private String trimExecutionResponse(byte[] response, DatagramPacket receivePacket) {
        response = Arrays.copyOf(response, receivePacket.getLength());
        return new String(response, StandardCharsets.UTF_8);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
