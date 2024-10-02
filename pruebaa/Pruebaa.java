/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa;

/**
 *
 * @author jose
 */
public class Pruebaa {

    int id;
    String nombre ;
    String apellido; 

    
     public Pruebaa() {
    }

    public Pruebaa(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = null;
    }
     
    public Pruebaa(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
