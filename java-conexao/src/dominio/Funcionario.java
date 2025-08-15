package dominio;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String cracha;
    private LocalDate dataNasc;

    public Funcionario(String nome, String cracha, LocalDate dataNasc){
        this.nome = nome;
        this.cracha = cracha;
        this.dataNasc = dataNasc;
    }

    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

}
