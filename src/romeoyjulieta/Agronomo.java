
package romeoyjulieta;


public class Agronomo extends Aldeanos {
    
    public Agronomo(){
        super(100);
    }

    public Agronomo(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    @Override
    public double danio(Aldeanos atacar) {
            int proba=0;
    proba=(int)(Math.random()*100);
    
    if(proba<=5){
        System.out.println("Fallo el ataque");

    }
        else if(proba>5 && atacar instanceof Pacifista ){
            return super.getPuntAtaque()*1.05;
        }
         else if(atacar instanceof Normales){
             return super.getPuntAtaque()*1.1;
         }
         return super.getPuntAtaque();
    }
    
}
