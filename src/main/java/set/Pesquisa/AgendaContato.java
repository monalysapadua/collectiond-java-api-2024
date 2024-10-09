package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        //agendaContato.exibirContato();

        agendaContato.adicionarContato("Monalysa",1034);
        agendaContato.adicionarContato("Monalysa",548);
        agendaContato.adicionarContato("Monalysa de Pádua",2546);
        agendaContato.adicionarContato("Monalysa Dantas",587458);
        agendaContato.adicionarContato("Esequiel de Pádua",2546);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Esequiel"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Esequiel de Pádua", 555));

        agendaContato.exibirContato();

    }
}
