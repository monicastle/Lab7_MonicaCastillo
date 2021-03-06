/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_monicacastillo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Monica
 */
public class Carpeta implements Serializable {

    private String nombre;
    private String link;
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();
    private static final long SerialVersionUID = 555L;

    public Carpeta() {
    }

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    public void SetArchivo(Archivo arch) {
        this.archivos.add(arch);
    }

    public void SetCarpeta(Carpeta carp) {
        this.carpetas.add(carp);
    }

    @Override
    public String toString() {
        return "Carpeta[" + "Nombre: " + nombre + ", Link: " + link + ", Archivos: " + archivos.toString() + ", carpetas: " + carpetas.toString() + ']';
    }

}
