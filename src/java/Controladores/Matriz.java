/*
 * Alumno: Bueno Rosas Brayan Omar
Grupo:5IM8
Version:1.0
 */
package Controladores;

/**
 *
 * @author Alumno
 */
public class Matriz {
    public double ProductoPunto(String Vector1, String Vector2)
    {
        String [] VectorUno = Vector1.split(",");  //   Primer vector enviado 
        String [] VectorDos = Vector2.split(","); //Segundo Vector
        
        Double ProductoPunto = 0.0; //Inicialización del producto
        
        for(int i = 0; i < VectorUno.length; i++)  //Vector 
        {
            ProductoPunto = ProductoPunto + Double.parseDouble(VectorUno[i]) * Double.parseDouble(VectorDos[i]); //Producto de las dos partes del vector 
        }
        return ProductoPunto; //Regresa el vector 
    }
}
