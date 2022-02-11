
package romeoyjulieta;

import java.util.ArrayList;


public class RomeoyJulieta {

    public static void main(String[] args) {
       
        Aldeanos romeo=new SuperGranjero("Romeo","Montesco",20,1000);
        ArrayList<Aldeanos>montesco=new ArrayList();
        montesco.add(new Herrero("Pedrito","Montesco",50,400));
        montesco.add(new Agronomo("Jose","Montesco",29,300));
        Familias Montesco=new Familias("Montesco",montesco);
         Aldeanos julieta=new Normales("Romeo","Montesco",20,200);
        ArrayList<Aldeanos>capuleto=new ArrayList();
        capuleto.add(new Herrero("Pedrito","Montesco",50,400));
        capuleto.add(new Agronomo("Jose","Montesco",29,300));
        Familias Capuleto=new Familias("Capuleto",capuleto);
        String linaje="";
        ArrayList<Aldeanos>general=new ArrayList();
        ArrayList<Familias>General=new ArrayList();
        General.add(new Familias(linaje,general));
        
        
    }
    
}
