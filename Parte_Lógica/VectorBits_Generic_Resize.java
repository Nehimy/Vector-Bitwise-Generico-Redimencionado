//chmod 777 run
package Parte_Lógica;

import java.util.Scanner;
import java.lang.*;

public class VectorBitwise_Generico{
  int Vector[];
  int dim;
  int NumberBit;
  
  //Constructor               10            7
  public VectorBitwise_Generico(int Cantidad, int numberBit){
    this.NumberBit = numberBit;
    
    int Cantidad_bits = Cantidad * numberBit; //70
    int Cantidad_Vectorcitos = Cantidad_bits / 32;//2
    if(Cantidad_bits % 32 != 0){
      Cantidad_Vectorcitos++; //3
    }
    Vector = new int [Cantidad_Vectorcitos]; //3
    dim = Cantidad;
  }
  
  private int GetNumero_Of_Elemento(int Position){
    int cantidadDeVector = (((Position - 1) * NumberBit) / 32);
    return cantidadDeVector;
  }
  
  private int GetNumero_Of_Bit(int Position){
    int NumeroDEl_Bit =  (((Position - 1) * NumberBit) % 32);  //////////
    System.out.println("mod=" + String.valueOf(NumeroDEl_Bit));
    return NumeroDEl_Bit;
    
  }
  
  public void Insertar(int Elemento, int Position){
    if(Position <= dim){
      Redimensionar(Position);
      dim = Position;
     } 
     
    int Elemento_aux = Elemento;
        
    int Numero_Vector = GetNumero_Of_Elemento(Position);
    int numberBit = GetNumero_Of_Bit(Position);
    int Mask = (int)  Math.pow(2,NumberBit) - 1;
        
    Mask = Mask << numberBit;
    Mask = ~ Mask; /**/
    Vector[Numero_Vector] = Vector[Numero_Vector] & Mask;
    Elemento = Elemento << numberBit;
    Vector[Numero_Vector] = Vector[Numero_Vector] | Elemento;
        
    if(numberBit + NumberBit > 32){
        
      int Number_bitFaltante = (numberBit + NumberBit) -32;
      int Mask1 =  (int) Math.pow(2,NumberBit) - 1;
          
      Mask1 = ~ Mask1;
      Vector[Numero_Vector + 1] = Vector[Numero_Vector + 1] & Mask1;
      Elemento_aux = Elemento_aux >>> NumberBit - Number_bitFaltante;
      Vector[Numero_Vector + 1] = Vector[Numero_Vector + 1] | Elemento_aux; 
    }  

  }
  
  public int Sacar(int Position){
  
    int Numero_Vector = GetNumero_Of_Elemento(Position);
    int numberBit = GetNumero_Of_Bit(Position);
    
    int Mask = (int) Math.pow(2,NumberBit) - 1;
    
    Mask = Mask << numberBit;
    Mask = Mask & Vector[Numero_Vector];
    Mask = Mask >>> numberBit;
    
    if( (numberBit + NumberBit) > 32 ){
    
      int Number_bitFaltante = (numberBit + NumberBit) - 32;
      int Mask1 = (int) Math.pow(2,NumberBit) - 1;
      
      Mask1 = Mask1 >>> NumberBit - Number_bitFaltante;
      Mask1 = Mask1 & Vector[Numero_Vector + 1];
      Mask1 = Mask1 << NumberBit - Number_bitFaltante;
      Mask = Mask | Mask1;
    }
    return Mask;
  }
  
  public String ObtenerTodo(){
    String contenido = "V = [";
    for(int i = 1; i <= dim; i ++){
      contenido = contenido + Sacar(i) + ",";
    }  
    contenido = contenido + "]";
    return contenido;
  } 
  
 } 
