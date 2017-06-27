package br.com.pk.Sisbiblio.bean;

import static java.lang.ProcessBuilder.Redirect.to;

public class Genero {
    private Long Id; 
    private String nome; 

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
            
    
    
    
}
