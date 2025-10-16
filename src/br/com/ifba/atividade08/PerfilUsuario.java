/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author PedroLucas
 */
import java.util.List;
/**
 * Classe PerfilUsuario
 * 
 * Representa o perfil de um usuário no sistema.
 * Cada perfil pode conter uma descrição (ex: Administrador, Usuário Padrão)
 * e uma lista de permissões que definem os acessos disponíveis.
 */
public class PerfilUsuario {

    private Long id;// Identificador único do perfil
    private String descricao;// Lista de permissões associadas ao perfil (ex: "CRIAR_USUARIO", "EXCLUIR_USUARIO")
    private List<String> permissoes;

    // Construtor da classe PerfilUsuario
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id; //Identificador único do perfil
        this.descricao = descricao;//Descrição do perfil
        this.permissoes = permissoes;//Lista de permissões atribuídas ao perfil
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public List<String> getPermissoes() { return permissoes; }
    public void setPermissoes(List<String> permissoes) { this.permissoes = permissoes; }

    /**
     * Retorna a representação textual do objeto PerfilUsuario,
     * incluindo id, descrição e permissões.
     */
    // toString
    @Override
    public String toString() {
        return "PerfilUsuario{id=" + id + ", descricao='" + descricao + "', permissoes=" + permissoes + '}';
    }
}

