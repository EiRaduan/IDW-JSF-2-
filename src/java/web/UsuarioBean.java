package web;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author saimor
 */
@SessionScoped
@ManagedBean(name="UsuarioBean")

public class UsuarioBean implements Serializable {
    private String nome,email,senha,confirmaSenha,dataNasc;
    private String cnpj,cidade;

    public UsuarioBean(){
       this.nome="";
       this.email="";
       this.senha="";
       this.confirmaSenha="";
       this.dataNasc="";
       this.cnpj="";
       this.cidade="";	    
    }
    public UsuarioBean(String n,String e,String s,String cs,String dn,String cnpj,String cd){
       this.nome=n;
       this.email=e;
       this.senha=s;
       this.confirmaSenha=cs;
       this.dataNasc=dn;
       this.cnpj=cnpj;
       this.cidade=cd;
    }

     public String getCnpj () {
          return cnpj;
     }

     public void setCnpj ( String cnpj ) {
          this.cnpj = cnpj;
     }

     public String getCidade () {
          return cidade;
     }

     public void setCidade ( String cidade ) {
          this.cidade = cidade;
     }
    

    public String getDataNasc () {
        return dataNasc;
    }

    public void setDataNasc ( String dataNasc ) {
        this.dataNasc = dataNasc;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public String novo(){
        return "usuario";
    }
    
    public String salvar(){
       FacesContext context = FacesContext.getCurrentInstance ();
       if(!this.senha.equalsIgnoreCase(this.confirmaSenha)){
          context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"senha confirmada incorretamente",""));
       return "usuario";
       }
       return "mostraUsuario";
    }
     public String novoF(){
        return "Fornecedor";
    }
    
    public String salvarF(){
       FacesContext context = FacesContext.getCurrentInstance ();
       if(!this.senha.equalsIgnoreCase(this.confirmaSenha)){
          context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"senha confirmada incorretamente",""));
       return "Fornecedor";
       }
       return "mostraFornecedor";
    }
public String index(){
   return "index";
}
     
    
}
