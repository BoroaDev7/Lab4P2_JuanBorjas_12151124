/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package romeoyjulieta;


public class Pacifista extends Aldeanos{
    
    public Pacifista(){
        super(0);
        System.out.println("La paz siempre es mejor hermano");
    }

    public Pacifista(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    @Override
    public double danio(Aldeanos atacar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
