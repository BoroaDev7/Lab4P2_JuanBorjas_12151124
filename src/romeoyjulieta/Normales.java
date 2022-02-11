
package romeoyjulieta;

/**
 *
 * @author famil
 */
public class Normales extends Aldeanos{
    
    public Normales(){
        super(50);
    }

    public Normales(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }
    
    @Override
    public  double danio(Aldeanos atacar){
        if(atacar instanceof Pacifista ){
            return super.getPuntAtaque()*1.05;
        }
        return super.getPuntAtaque();
    }
    
}
