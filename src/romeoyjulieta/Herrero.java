
package romeoyjulieta;

public class Herrero extends Aldeanos {
    private int danio=(int)(Math.random()*300+200);
    
    public Herrero(){
        super();  
    }

    public Herrero(int danio) {
        super(danio); 
 
    }

    public Herrero(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida*1.5);
    }

    @Override
    public double danio(Aldeanos atacar) {
        
            int proba=0;
    proba=(int)(Math.random()*100);
    
    if(proba<=10){
        System.out.println("Fallo el ataque");
    }
        else if(proba>10 && atacar instanceof Agronomo ){
            return super.getPuntAtaque()*1.1;
        }
        else if(atacar instanceof Pacifista ){
            return super.getPuntAtaque()*1.05;
        }
        return super.getPuntAtaque();
    }
   
}
