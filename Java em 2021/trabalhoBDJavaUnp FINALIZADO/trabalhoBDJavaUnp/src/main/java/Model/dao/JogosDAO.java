/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.dao;

import Connection.ConnectionFactory;
import Model.Jogo;
import com.mycompany.trabalhobdjavaunp.TelaLoginTrabalho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvar
 */
public class JogosDAO {

    public void create(Jogo j) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO jogos (Nome,IdUsuario)VALUES(?,?) ");
            stmt.setString(1, j.getNome());
            stmt.setInt(2, j.getIdUsuario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Jogo Cadastrado!!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<Jogo> read(int id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Jogo> jogos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM jogos WHERE IdUsuario = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                
               Jogo jogo = new Jogo();
               
               jogo.setIdJogos(rs.getInt("idJogos"));
               jogo.setNome(rs.getString("Nome"));
               jogo.setIdUsuario(rs.getInt("IdUsuario"));
               jogos.add(jogo);
                       
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(JogosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return jogos;
    }

}
