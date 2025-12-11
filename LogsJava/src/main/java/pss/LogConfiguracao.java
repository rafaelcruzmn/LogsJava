/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pss;

/**
 *
 * @author Rafael
 */

public class LogConfiguracao {
    
    private int tipo;
    
    public LogConfiguracao(int tipoInicial) {
        this.tipo = tipoInicial;
    }   
    public int getTipoLog(){  
        return tipo;      
    }
    public void setTipoLog(int tipo){
        this.tipo = tipo;
    }
}
