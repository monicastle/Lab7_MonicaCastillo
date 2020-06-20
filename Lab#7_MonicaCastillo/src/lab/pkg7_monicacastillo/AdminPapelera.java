/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_monicacastillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Monica
 */
public class AdminPapelera {

    private ArrayList objetos = new ArrayList();
    private File archivo = null;

    public AdminPapelera(String path) {
        archivo = new File(path);
    }

    public ArrayList getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList objetos) {
        this.objetos = objetos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setObject(Object o) {
        this.objetos.add(o);
    }

    public void cargarArchivo() {
        try {
            objetos = new ArrayList();
            Object temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Object) objeto.readObject()) != null) {
                        objetos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
