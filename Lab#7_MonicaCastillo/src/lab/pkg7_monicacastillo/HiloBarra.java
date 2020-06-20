/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_monicacastillo;

import javax.swing.JProgressBar;

/**
 *
 * @author Monica
 */
public class HiloBarra extends Thread {

    private JProgressBar barra;

    public HiloBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    @Override
    public void run() {
            try {
                
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
}
