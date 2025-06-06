package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Monalysa", 991886348);
        agendaContatos.adicionarContato("Monalysa", 973181999);
        agendaContatos.adicionarContato("Monalysa de Pádua", 99181818);
        agendaContatos.adicionarContato("Mona", 6565656);
        agendaContatos.adicionarContato("Esequiel", 99181818);
        agendaContatos.adicionarContato("Monalysa", 548457);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Esequiel");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Mona"));

    }
}
