/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author User
 */
import java.time.LocalDateTime;
/**
 * Classe LogAuditoria
 * 
 * Representa um registro de auditoria no sistema, armazenando informações
 * sobre as ações realizadas por um usuário, incluindo data, hora e IP.
 */
public class LogAuditoria {
    private Long id;// Identificador único do log de auditoria
    private Usuario usuario;// Usuário que realizou a ação
    private String acao;// Descrição da ação realizada (ex: login, logout, cadastro, exclusão, etc.)
    private LocalDateTime dataHora;// Data e hora em que a ação foi realizada
    private String ip;// Endereço IP do dispositivo de onde a ação foi realizada

    // Construtor da classe LogAuditoria
    public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public String getAcao() { return acao; }
    public void setAcao(String acao) { this.acao = acao; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }

     /**
     * Representação textual do objeto LogAuditoria
     * Exibe id, nome do usuário, ação, data/hora e IP.
     */
    @Override
    public String toString() {
        return "LogAuditoria{id=" + id + ", usuario=" + usuario.getNomeUsuario() + ", acao='" + acao + "', dataHora=" + dataHora + ", ip='" + ip + "'}";
    }
}
