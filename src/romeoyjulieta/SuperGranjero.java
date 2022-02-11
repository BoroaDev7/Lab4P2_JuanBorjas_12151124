
package romeoyjulieta;

/**
 *
 * @author famil
 */
public class SuperGranjero extends Aldeanos {
    
    public SuperGranjero(){
        super(1000);
    }

    public SuperGranjero(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, 1000);
    }

    @Override
    public double danio(Aldeanos atacar) {  
        if(atacar instanceof Herrero ){
            return super.getPuntAtaque()*1.1;
        }
         else if(atacar instanceof Explosivo){
             return super.getPuntAtaque()*1.15;
         }
        return super.getPuntAtaque();

    }
    
    
    
}
