/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pss;

/**
 *
 * @author Rafael
 */

import java.io.*;
import java.util.Properties;

public class LogConfiguracao {
    
    private static final String LOGCONF = "log_conf.properties";
    private static final String TIPO = "tipo";

  public static int getTipoLog() {
    Properties props = new Properties();
    
    try (FileInputStream in = new FileInputStream(LOGCONF)) {
        props.load(in);
        String valor = props.getProperty(TIPO, "0");
        return Integer.parseInt(valor);
    } catch (IOException | NumberFormatException e) {
        return 0;
    }
}

    public static void setTipoLog(String tipo) {
        
        Properties props = new Properties();
        props.setProperty(TIPO, tipo);

        try (FileOutputStream out = new FileOutputStream(LOGCONF)) {
            props.store(out, "Configuração do tipo de log");
        } catch (IOException e) {
            throw new RuntimeException("Falha ao registrar log no arquivo CSV.", e);        
        }
    }
}
