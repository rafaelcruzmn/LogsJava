/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pss;

/**
 *
 * @author Rafael
 */

import java.io.FileWriter;
import java.io.IOException;

public class LogCsv implements ILog{
    
    private final String filePath = "log.csv";

    @Override
    public void registrar(String mensagem) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("\"" + mensagem + "\"" + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException("Falha ao registrar log no arquivo CSV.", e);
        }
    }
}
