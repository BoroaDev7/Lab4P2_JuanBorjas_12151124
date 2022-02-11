
package romeoyjulieta;


public class Explosivo extends Aldeanos {
     
    public Explosivo(){
        super(250);
    } 

    public Explosivo(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    @Override
    public double danio(Aldeanos atacar) {
        if(atacar instanceof Herrero ){
            return super.getPuntAtaque()*1.05;
        }
         else if(atacar instanceof Agronomo){
             return super.getPuntAtaque()*1.1;
         }

        return super.getPuntAtaque();
        
    }
    
}
