/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pss;

/**
 *
 * @author Rafael
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
        
public class LogService {
    
    private ILog Escolha; 
    private ILog getEscolha() {
        
    LogConfiguracao conf = new LogConfiguracao(0);
    int tipo = conf.getTipoLog();
    
    if (Escolha == null || (tipo == 1 && !(Escolha instanceof LogJson)) || (tipo == 0 && !(Escolha instanceof LogCsv))) {
    Escolha = (tipo == 1)
            ? new LogJson()
            : new LogCsv();
}
        

return Escolha;
}


    private static String dataHoraAtual() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss"));
    }

    public void logOperacaoSucesso(String operacao, String nomeUsuario, String usuarioAutenticado) {
        String mensagem = String.format(
            "%s: %s, (%s, %s)",
            operacao,
            nomeUsuario,
            dataHoraAtual(),
            usuarioAutenticado
        );
        getEscolha().registrar(mensagem);
    }

    public void logOperacaoFalha(String operacao, String nomeUsuario, String usuarioAutenticado, String msgFalha) {
        String mensagem = String.format(
            "Ocorreu a falha \"%s\" ao realizar a operação %s para o usuário %s, (%s, %s).",
            msgFalha,
            operacao,
            nomeUsuario,
            dataHoraAtual(),
            usuarioAutenticado
        );
        getEscolha().registrar(mensagem);
    }
}
