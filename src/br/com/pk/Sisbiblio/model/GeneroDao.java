package br.com.pk.Sisbiblio.model;

import br.com.pk.Sisbiblio.bean.Genero;
import br.com.pk.Sisbiblio.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GeneroDao{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement st =null;
        ResultSet rs = null;
        
    public void criaGenero(Genero g){

        String sql = "INSERT INTO tb_genero (nome_genero) VALUES (?)";
        
        try {
        st =con.prepareStatement(sql);
        st.setString (1,g.getNome());
        st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Gênero Adicionado com sucesso");
        
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null,"O Gênero "+g.getNome()+" já está cadastrado");
            JOptionPane.showMessageDialog(null,e);
        }finally{
            //ConnectionFactory.closeConnection(con, st);
        }
    }
    
    public void atualizaGenero(Genero g1, Genero g){
        String sql = "UPDATE tb_genero set nome_genero = ? where Id_genero = ?";
        try {
        st =con.prepareStatement(sql);
        st.setString (1,g.getNome());
        st.setLong (2,g.getId());
        st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Gênero alterado para "+g.getNome()+" com sucesso");
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"O Gênero "+g.getNome()+" já está cadastrado");
        }finally{
            //ConnectionFactory.closeConnection(con, st);
        }
        
    }        
    
        public void excluiGenero(Genero g){
        String sql = "DELETE from tb_genero where nome_genero = ?";
        try {
        st =con.prepareStatement(sql);
        st.setString (1,g.getNome());
        st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Gênero "+g.getNome()+" excluído");
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            //ConnectionFactory.closeConnection(con, st);
        }
        
    } 
    
    
    
    public List<Genero> listaGenero(){
        String sql = "SELECT * FROM tb_genero";
        List <Genero> generos= new ArrayList<>();
        
        try{
            st=con.prepareStatement(sql);
            rs = st.executeQuery();
                    
            while (rs.next()){
                Genero g = new Genero();
                g.setId(rs.getLong("Id_genero"));
                g.setNome(rs.getString("Nome_genero"));
                generos.add(g);
                
            }
        }catch (SQLException e){
           JOptionPane.showMessageDialog(null,e); 
        }finally{
            //ConnectionFactory.closeConnection(con,st, rs);
        }
    return generos;
    }

}
