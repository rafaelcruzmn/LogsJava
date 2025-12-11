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
    
    private static int tipo;
    
    public LogConfiguracao(int tipoInicial) {
        this.tipo = tipoInicial;
    }   
    public static int getTipoLog(){  
        return tipo;      
    }
    public static void setTipoLog(int tipo){
        LogConfiguracao.tipo = tipo;
    }
}
