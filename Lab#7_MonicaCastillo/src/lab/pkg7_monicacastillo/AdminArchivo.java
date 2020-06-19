/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_monicacastillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Monica
 */
public class AdminArchivo {

    private ArrayList<Archivo> listaarchivos = new ArrayList();
    private File archivo = null;

    public AdminArchivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Archivo> getListaarchivos() {
        return listaarchivos;
    }

    public void setListaarchivos(ArrayList<Archivo> listaarchivos) {
        this.listaarchivos = listaarchivos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void SetArchivo(Archivo a) {
        this.listaarchivos.add(a);
    }

    public void cargarArchivo() {
        try {
            listaarchivos = new ArrayList();
            Archivo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Archivo) objeto.readObject()) != null) {
                        listaarchivos.add(temp);
                    }
                } catch (EOFException ex) {
                    ex.printStackTrace();
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Archivo t : listaarchivos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
