package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Esequiel", 40, 1.70);
        ordenacaoPessoa.adicionarPessoa("Monalysa", 37, 1.64);
        ordenacaoPessoa.adicionarPessoa("Esther", 11, 1.58);
        ordenacaoPessoa.adicionarPessoa("Rebeca", 7, 1.27);

        System.out.println(ordenacaoPessoa.pessoaList);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
