
package romeoyjulieta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RomeoyJulieta {
  public static Scanner leer=new Scanner(System.in);
  public static String apefam="";
   public static  ArrayList<Aldeanos>aldeano=new ArrayList();
   public static  ArrayList<Familias>lista_fam=new ArrayList();
   public static Familias linaje;
  
  
  
    public static void main(String[] args) {

        Aldeanos romeo=new SuperGranjero("Romeo","Montesco",20,1000);
        ArrayList<Aldeanos>montesco=new ArrayList();
        montesco.add(new Herrero("Pedrito","Montesco",50,400));
        montesco.add(new Agronomo("Jose","Montesco",29,300));
        montesco.add(romeo);
        Familias Montesco=new Familias("Montesco");
        Montesco.setAldeanos(montesco);
         Aldeanos julieta=new Normales("Julieta","Capuleto",20,200);
        ArrayList<Aldeanos>capuleto=new ArrayList();
        capuleto.add(new Explosivo("Raul","Capuleto",50,400));
        capuleto.add(new Pacifista("Lorax","Capuleto",29,300));
        capuleto.add(julieta);
        Familias Capuleto=new Familias("Capuleto");
        Capuleto.setAldeanos(capuleto);
        ArrayList<Aldeanos>lopez=new ArrayList();
        lopez.add(new Herrero("Pablo","Lopez",34,400));
        lopez.add(new Agronomo("Mario","Lopez",29,300));
        Familias Lopez=new Familias("Lopez");
        Lopez.setAldeanos(lopez);
        
        lista_fam.add(Montesco);
        lista_fam.add(Capuleto);
        lista_fam.add(Lopez);
   
        
        do{
            opciones( menu() );
        }while(true);
        
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
            if(opcion==2)
                crearAldeanos();
            if(opcion==3)
                imprimirFamilias();
            if(opcion==4)
                pelear();
         

        
    }
   
   public static void crearFamilias(){
       System.out.println("Apellido de la Familia");
        apefam=leer.next();
       String [] fam=apefam.split("&");
       linaje=new Familias(fam[0]);
       lista_fam.add(linaje);
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
       
       System.out.println("\n Tipo de aldeano");
       System.out.println("1.Normal\n"+
                          "2.Pacifista\n"+
                          "3.Herrero\n"+ 
                          "4.Agronomo\n"+
                          "5.Explosivo\n"+
                          "6.Pacifista\n"+
                          "Ingrese una opcion\n");
       int opcion=leer.nextInt();
       
       switch(opcion){
           case 1:
                if(apellido.equals(apefam)){
               ArrayList<Aldeanos> aldea=new ArrayList();
               Aldeanos aldeanito = new Normales(nombre,apellido,edad,vida);
               aldea.add(aldeanito);
              int indice=0;
                   int pos=lista_fam.indexOf(linaje);
                   lista_fam.get(pos).getAldeanos().add(aldea.get(indice));
                   indice++;
                }
                
               break;
           case 2:
               
               if(apellido.equals(apefam)){
               ArrayList<Aldeanos> aldea=new ArrayList();
               Aldeanos aldeanito = new Pacifista(nombre,apellido,edad,vida);
               aldea.add(aldeanito);
              int indice=0;
                   int pos=lista_fam.indexOf(linaje);
                   lista_fam.get(pos).getAldeanos().add(aldea.get(indice));
                   indice++;
                }
               break;
           case 3:        
                if(apellido.equals(apefam)){
               ArrayList<Aldeanos> aldea=new ArrayList();
               Aldeanos aldeanito = new Herrero(nombre,apellido,edad,vida);
               aldea.add(aldeanito);
              int indice=0;
                   int pos=lista_fam.indexOf(linaje);
                  lista_fam.get(pos).getAldeanos().add(aldea.get(indice));
                   indice++;
                }
               break;
           case 4:
                 if(apellido.equals(apefam)){
               ArrayList<Aldeanos> aldea=new ArrayList();
               Aldeanos aldeanito = new Agronomo(nombre,apellido,edad,vida);
               aldea.add(aldeanito);
              int indice=0;
                   int pos=lista_fam.indexOf(linaje);
                   lista_fam.get(pos).getAldeanos().add(aldea.get(indice));
                   indice++;
                }
                break;
           case 5:
                if(apellido.equals(apefam)){
               ArrayList<Aldeanos> aldea=new ArrayList();
               Aldeanos aldeanito = new Explosivo(nombre,apellido,edad,vida);
               aldea.add(aldeanito);
              int indice=0;
                   int pos=lista_fam.indexOf(linaje);
                   lista_fam.get(pos).getAldeanos().add(aldea.get(indice));
                   indice++;
                }
                break;
           case 6:
                 if(apellido.equals(apefam)){
               ArrayList<Aldeanos> aldea=new ArrayList();
               Aldeanos aldeanito = new Pacifista(nombre,apellido,edad,vida);
               aldea.add(aldeanito);
              int indice=0;
                   int pos=lista_fam.indexOf(linaje);
                   lista_fam.get(pos).getAldeanos().add(aldea.get(indice));
                   indice++;
                }
                break;
                          
       }
         


   }
   
    public static void imprimirFamilias(){
           
           for (Familias aldeanos : lista_fam) {
               System.out.println(aldeanos.toString());
           }
         
       }
    public static void pelear(){
        System.out.println("Ingrese el apellido de la familia que peleará");
        String apellido=leer.next();
        if(apellido.equals(apefam)){
            int pos=lista_fam.indexOf(linaje);
            int indice=0;
            Collections.shuffle(lista_fam.get(pos).getAldeanos());
            double vidaMontesco=lista_fam.get(0).getAldeanos().get(2).getVida();
            double vidaOtrasFam=lista_fam.get(pos).getAldeanos().get(indice).getVida();
             while(vidaMontesco>0 && vidaOtrasFam>0){
               double danioMontesco=lista_fam.get(0).getAldeanos().get(indice).getPuntAtaque();
               double danioOtrasFam=lista_fam.get(pos).getAldeanos().get(indice).getPuntAtaque();
              String nombreMontesco=lista_fam.get(0).getAldeanos().get(indice).getNombre();
              String nombreOtrasFam=lista_fam.get(pos).getAldeanos().get(indice).getNombre();
              double vidarestanteOtrasFam=(vidaOtrasFam)-(danioMontesco);
              double vidarestanteMon=(vidaMontesco)-(danioOtrasFam);
                                    
               System.out.println( nombreMontesco + " ha atacado a " + nombreOtrasFam  + " haciendole " + danioMontesco  + " dejandolo con " + vidarestanteOtrasFam  + " de vida");
               if(vidarestanteOtrasFam <= 0){
                System.out.println("Ha Ganado " + nombreMontesco );  
               
             }
               else{
                    System.out.println( nombreOtrasFam + " ha atacado a " + nombreMontesco + " haciendole " + danioOtrasFam  + " dejandolo con " + vidarestanteMon  + " de vida");
                    if(vidarestanteMon<=0){
                        System.out.println("Ha Ganado"+nombreOtrasFam);
                    }
               }
            
        }
     
        
    }
        
    }
   
   
}
