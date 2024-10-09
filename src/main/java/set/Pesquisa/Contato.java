package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int numero;

    public Contato(String nome, int número) {
        this.nome = nome;
        this.numero = número;
    }

    public String getNome() {
        return nome;
    }

    public int getNúmero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "{" + nome + '\'' +
                "," + numero + "}";
    }
}

