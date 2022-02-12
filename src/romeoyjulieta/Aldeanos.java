/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package romeoyjulieta;

/**
 *
 * @author famil
 */
public abstract class Aldeanos {
    private String nombre;
    private String apellido;
    private int edad;
    private double vida;
    private int puntAtaque;

    public Aldeanos() {
    }
    
    public Aldeanos(int puntAtaque){
        this.puntAtaque=puntAtaque;
    }
    
 
    public Aldeanos(String nombre, String apellido, int edad, double vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPuntAtaque() {
        return puntAtaque;
    }

    public void setPuntAtaque(int puntAtaque) {
        this.puntAtaque = puntAtaque;
    }
    
    

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", vida=" + vida  ;
    }
    
    public abstract double danio(Aldeanos atacar);
    
    
    
}
