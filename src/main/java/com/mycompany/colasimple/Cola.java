/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.colasimple;

/**
 *
 * @author REAL
 */
public class Cola {
    
    private int[] cola=new int [6];
    private int ini;
    private int fin;
    private int valorEli;
    private final int llena=cola.length-1;
    
    
    public Cola(){
        fin=ini;
        
    }
    
    public boolean push(int valor){
        if(fin==llena){
            
            return false;
            
        }
        
        cola[fin++]=valor;
        return true;
    }
    
    
    public boolean pop(){
        
        if(fin==ini){  
            return false;      
        }
        valorEli=cola[ini++];   
        return true;
    }
    
    public int mostrarValorEli(){
        return valorEli;
    }
    
    public int[]colaSoloLectura(){
        return cola;
    }
    public int iniSoloLectura(){
        return ini;
    }
    public int finSoloLectura(){
        return fin;
    }
}
