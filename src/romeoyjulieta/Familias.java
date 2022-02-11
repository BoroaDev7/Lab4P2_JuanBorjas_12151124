/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package romeoyjulieta;

import java.util.ArrayList;

public class Familias {
    private String linaje;
    private ArrayList<Aldeanos>aldeanos;

    public Familias() {
    }


    public Familias(String linaje) {
        this.linaje = linaje;
        this.aldeanos=new ArrayList();
    }

    public String getLinaje() {
        return linaje;
    }

    public void setLinaje(String linaje) {
        this.linaje = linaje;
    }

    public ArrayList<Aldeanos> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(ArrayList<Aldeanos> aldeanos) {
        this.aldeanos = aldeanos;
    }

    @Override
    public String toString() {
        return "Familias{" + "linaje=" + linaje + ", aldeanos=" + aldeanos + '}';
    }
  
    
    
}
