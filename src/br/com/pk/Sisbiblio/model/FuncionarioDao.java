package br.com.pk.Sisbiblio.model;

import br.com.pk.Sisbiblio.bean.Funcionario;
import br.com.pk.Sisbiblio.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDao {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement st =null;
        ResultSet rs = null;
        
    public void criaFunc(Funcionario f){

        String sql = "INSERT INTO tb_funcionario (nome_funcionario,funcao_funcionario,status_funcionario) VALUES (?,?,?)";
        
        try {
        st =con.prepareStatement(sql);
        st.setString (1,f.getNome());
        st.setString (2,f.getFuncao());
        st.setString (3,f.getStatus());
        st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Funcionário "+f.getNome()+" adicionado com sucesso");
        
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null,"O funcionário "+f.getNome()+" já está cadastrado");
            JOptionPane.showMessageDialog(null,e);
        }finally{
            //ConnectionFactory.closeConnection(con, st);
        }
    }
    
    public void atualizaFunc(Funcionario f1,Funcionario f2,Funcionario f3,Funcionario f4){
        String sql = "UPDATE tb_funcionario set nome_funcionario = ?,funcao_funcionario = ?,status_funcionario = ?  where Id_funcionario = ?";
        try {
        st =con.prepareStatement(sql);
        st.setString (1,f2.getNome());
        st.setString (2,f3.getFuncao());
        st.setString(3,f4.getStatus());
        st.setInt (4,f1.getCPF());

        st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Dados do Funcionário alterado(s) com sucesso");
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);            
            //JOptionPane.showMessageDialog(null,"O funcionário "+f2.getNome()+" já está cadastrado");
        }finally{
            //ConnectionFactory.closeConnection(con, st);
        }
        
    }        
    
        public void excluiFunc(Funcionario f){
        String sql = "DELETE from tb_funcionario where nome_funcionario = ?";
        try {
        st =con.prepareStatement(sql);
        st.setString (1,f.getNome());
        st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Funcionário "+f.getNome()+" excluído");
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            //ConnectionFactory.closeConnection(con, st);
        }
        
    } 
    
    
    
    public List<Funcionario> listaFunc(){
        String sql = "SELECT * FROM tb_funcionario order by nome_funcionario";
        List <Funcionario> funcionarios= new ArrayList<>();
        
        try{
            st=con.prepareStatement(sql);
            rs = st.executeQuery();
                    
            while (rs.next()){
                Funcionario f = new Funcionario();
                f.setCPF(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("Nome_funcionario"));
                f.setFuncao(rs.getString("funcao_funcionario"));
                f.setStatus(rs.getString("status_funcionario"));
                funcionarios.add(f);
                
            }
        }catch (SQLException e){
           JOptionPane.showMessageDialog(null,e); 
        }finally{
            //ConnectionFactory.closeConnection(con,st, rs);
        }
    return funcionarios;
    }

}
