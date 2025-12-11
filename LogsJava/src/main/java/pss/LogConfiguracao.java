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
    private static final int TIPO = 0;
    
    public static int getTipoLog() {
        Properties props = new Properties();
        
        try (FileInputStream in = new FileInputStream(LOGCONF)) {
            props.load(in);

            String valorStr = props.getProperty(String.valueOf(TIPO), "0");
            return Integer.parseInt(valorStr);

        } catch (IOException | NumberFormatException e) {
            return 0;
        }
    }
    public static void setTipoLog(int tipo) {
        Properties props = new Properties();
        try (FileInputStream in = new FileInputStream(LOGCONF)) {
            props.load(in);
        } catch (IOException e) {
        }
        
        props.setProperty(String.valueOf(TIPO), String.valueOf(tipo));
        try (FileOutputStream out = new FileOutputStream(LOGCONF)) {
            props.store(out, "Configuração do tipo de log");
        } catch (IOException e) {
            throw new RuntimeException("Falha ao registrar log no arquivo de configuração.", e);
        }
    }
}
