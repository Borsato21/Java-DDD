package Aula03.cliente;

public class Cliente {
    private String id; // indentidade unica como cpf
    private String nome;
    private String email;
    private String telefone;

    //criando um construtor
    public Cliente(String nome, String email, String telefone){

        //criando um id unico aleatorio
        this.id= java.util.UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        System.out.println("Cliente criado: " + nome);
    }
    //GETTERS - Consultando ver dados
    public String getId(){
        return  this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public String getTelefone(){
        return this.telefone;
    }

}
