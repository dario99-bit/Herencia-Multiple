/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamultipletarea1;
interface RedNeuronalArtificial1{
    public default void Utilizar(){
        System.out.println("Utilizar Red Neuronal de Base Radial (RBF)");
    }
}
interface  RedNeuronalArtificial2{
    public default void Utilizar(){
         System.out.println("Utilizar Red de árboles de modelos locales lineales (LOLIMOT) ");
    }
}
/**
 *
 * @author DARIO CHISAGUANO AIMACAÑA
 */
public class HerenciaMultipleTarea1 implements RedNeuronalArtificial1, RedNeuronalArtificial2{
   /*
    @Override
    public void Consumir(){
        // Se puede elegir la implementacion de una interfaz
        // por ejemplo escojemos que se Vehiculo Diesel
        RedNeuronalArtificial1.super.Utilizar();
    }
    */
     @Override
    public void Utilizar(){
    // Se puede elegir la implementacion de una interfaz 
    // por ejemplo escogemos que sea VehiculoGasolina
    RedNeuronalArtificial2.super.Utilizar();
    }
    

   
    public static void main(String[] args) {
        HerenciaMultipleTarea1 camion= new HerenciaMultipleTarea1();
    camion.Utilizar();
   
    }
    
}






