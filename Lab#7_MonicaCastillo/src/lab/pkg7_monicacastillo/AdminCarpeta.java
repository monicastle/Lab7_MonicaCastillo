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
public class AdminCarpeta {

    private ArrayList<Carpeta> listacarpetas = new ArrayList();
    private File archivo = null;

    public AdminCarpeta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carpeta> getListacarpetas() {
        return listacarpetas;
    }

    public void setListacarpetas(ArrayList<Carpeta> listacarpetas) {
        this.listacarpetas = listacarpetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void SetCarpeta(Carpeta c) {
        this.listacarpetas.add(c);
    }

    public void cargarArchivo() {
        try {
            listacarpetas = new ArrayList();
            Carpeta temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carpeta) objeto.readObject()) != null) {
                        listacarpetas.add(temp);
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
            for (Carpeta t : listacarpetas) {
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
