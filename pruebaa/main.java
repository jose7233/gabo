/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaa;

/**
 *
 * @author jose
 */
public class main {
    
     public static void main(String[] args) {
        Pruebaa prb = new Pruebaa ();
         Pruebaa prb2 = new Pruebaa (19, "gabriel");
         Pruebaa prb1 = new Pruebaa (20, "jose", "ortega");
         
         System.out.println("la id del alumno 2 es:  "  + prb1.getId()  );
         System.out.println("nombre: " + prb1.getNombre());
         System.out.println("apellido: " +  prb1.getApellido());
         
              System.out.println("---------");
          System.out.println("la id del alumno 2 es:  "  + prb2.getId()  );
         System.out.println("nombre: " + prb2.getNombre());
         System.out.println("apellido: " +  prb2.getApellido());
         
         prb.setId(89);
         prb.setNombre("aroldo");
         prb.setApellido("gutierrez");
         System.out.println("---------");
         System.out.println("la id del alumno 1 es:  "  + prb.getId()  );
         System.out.println("nombre: " + prb.getNombre());
         System.out.println("apellido: " +  prb.getApellido());
         
         
         prb1.setApellido("de la cruz");
         System.out.println("---------");
             System.out.println("la id del alumno 2 es:  "  + prb1.getId()  );
         System.out.println("nombre: " + prb1.getNombre());
         System.out.println("apellido: " +  prb1.getApellido());
    }
    
}
