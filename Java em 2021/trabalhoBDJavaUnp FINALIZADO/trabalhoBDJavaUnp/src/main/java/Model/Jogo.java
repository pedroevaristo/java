/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alvar
 */
public class Jogo {
    private int idJogos;
    private String Nome;
    private int IdUsuario;

    public Jogo() {
    }
    
    

    /**
     * @return the idJogos
     */
    public int getIdJogos() {
        return idJogos;
    }

    /**
     * @param idJogos the idJogos to set
     */
    public void setIdJogos(int idJogos) {
        this.idJogos = idJogos;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the IdUsuario
     */
    public int getIdUsuario() {
        return IdUsuario;
    }

    /**
     * @param IdUsuario the IdUsuario to set
     */
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

}
