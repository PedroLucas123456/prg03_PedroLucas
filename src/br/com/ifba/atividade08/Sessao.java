/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author PedroLucas
 */

/**
 * Classe Sessao
 * 
 * Representa uma sessão de usuário no sistema. 
 * Cada sessão contém um identificador único, o usuário autenticado e 
 * um token que pode ser usado para validação em operações seguras.
 */
public class Sessao {
    private Long id;//Identificador único da sessão
    private Usuario usuario;//Usuário autenticado que iniciou a sessão
    private String token;//Token de autentitação da sessão

    // Construtor da sessão
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;//Idetificador único da sessão
        this.usuario = usuario;//Usuário autenticado
        this.token = token;//Chave de autenticação da sessão
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    /**
     * Retorna a representação textual da sessão.
     * Inclui id, nome do usuário e o token.
     */
    // toString
    @Override
    public String toString() {
        return "Sessao{id=" + id + ", usuario=" + usuario.getNomeUsuario() + ", token='" + token + "'}";
    }
}
