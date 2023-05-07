/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.dao;

import Connection.ConnectionFactory;
import Model.Jogo;
import Model.Usuario;
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
public class UsuarioDAO {

    public void create(Usuario u) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (login,senha)VALUES(?,?) ");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean autenticar(String login, String senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        boolean autenticado = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();
            if (rs.next()) {
                autenticado = true;
                TelaLoginTrabalho.idUsuario = rs.getInt("idUsuario");
                TelaLoginTrabalho.loginUsuario = rs.getString("login");
                return autenticado;

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return autenticado;
    }

    public List<Usuario> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setLogin(rs.getString("login"));
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            Logger.getLogger(JogosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }
}
