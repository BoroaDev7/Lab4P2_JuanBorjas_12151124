
package romeoyjulieta;

import java.util.ArrayList;
import java.util.Scanner;


public class RomeoyJulieta {
  public static Scanner leer=new Scanner(System.in);
  public static String linaje="";
   public static  ArrayList<Aldeanos>general=new ArrayList();
   public static  ArrayList<Familias>General=new ArrayList();
  
  
  
    public static void main(String[] args) {

        Aldeanos romeo=new SuperGranjero("Romeo","Montesco",20,1000);
        ArrayList<Aldeanos>montesco=new ArrayList();
        montesco.add(new Herrero("Pedrito","Montesco",50,400));
        montesco.add(new Agronomo("Jose","Montesco",29,300));
        Familias Montesco=new Familias("Montesco");
        Montesco.setAldeanos(montesco);
         Aldeanos julieta=new Normales("Julieta","Capuleto",20,200);
        ArrayList<Aldeanos>capuleto=new ArrayList();
        capuleto.add(new Explosivo("Raul","Capuleto",50,400));
        capuleto.add(new Pacifista("Lorax","Capuleto",29,300));
        Familias Capuleto=new Familias("Capuleto");
        Capuleto.setAldeanos(capuleto);
        ArrayList<Aldeanos>lopez=new ArrayList();
        lopez.add(new Herrero("Pablo","Lopez",34,400));
        lopez.add(new Agronomo("Mario","Lopez",29,300));
        Familias Lopez=new Familias("Lopez");
        Lopez.setAldeanos(lopez);
        
   
        
        opciones((menu));
        
        
    }
    
    
    public static int menu(){

         System.out.println("");
        System.out.println("");
        System.out.println("Bienvenido");
        System.out.println( "0.Salir\n"+
                            "1.Crear Familias\n"+
                           " 2.Crear Aldeanos\n"+
                           " 3.Imprimir Familias\n"+
                           " 4.Pelear\n"
                            );
        
        System.out.println("Porfavor ingrese una opcion ");
        return leer.nextInt();
    }
    
    
   public static void opciones(int opcion){
         if(opcion==6)
                System.exit(0); 
         if(opcion==1)
            crearFamilias();
            if(opcion ==2)
                listarmascotas();
            if(opcion==3)
                agregarclien();
            if(opcion==4)
                adoptar();
            if(opcion==5)
                listarclientes();
          
        
     
        
    }
   
   public static void crearFamilias(){
       System.out.println("Apellido de la Familia");
       String linaje=leer.next();
       
       General.add(new Familias(linaje));
   }
   
   public static void crearAldeanos(){
       System.out.println("Nombre: ");
       String nombre=leer.next();
       System.out.println("Apellido: ");
       String apellido=leer.next();
       System.out.println("Edad: ");
       int edad=leer.nextInt();
       System.out.println("Puntos de vida");
       int vida=leer.nextInt();
       
       
       
       
  
   }
   
   
   
}
