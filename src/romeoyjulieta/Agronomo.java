
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
         if(atacar instanceof Pacifista ){
            return super.getPuntAtaque()*1.05;
        }
         else if(atacar instanceof Normales){
             return super.getPuntAtaque()*1.1;
         }
         return super.getPuntAtaque();
    }
    
}
