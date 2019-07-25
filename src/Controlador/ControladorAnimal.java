/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

/**
 *
 * @author Dante
 */
public class ControladorAnimal {
    
    private String refAnimal;

    public ControladorAnimal() {
    }

    public ControladorAnimal(String refAnimal) {
        this.refAnimal = refAnimal;
    }
    

    /**
     * Get the value of refAnimal
     *
     * @return the value of refAnimal
     */
    public String getRefAnimal() {
        return refAnimal;
    }

    /**
     * Set the value of refAnimal
     *
     * @param refAnimal new value of refAnimal
     */
    public void setRefAnimal(String refAnimal) {
        this.refAnimal = refAnimal;
    }
    
    public void agregarAnimal(Integer id, String raza, String nombre, Integer edad){
        System.out.println("Agrege Animal a la base de dato");
    }
    public void eliminarAnimal(){
        System.out.println("Elimine Animal de la base de datos");
    }
    public void modificarAnimal(){
        System.out.println("Modifique Animal de la base de datos");
    }
    public void listarAnimal(){
        System.out.println("Liste Animal de la base de datos"); 
    }

    
}
