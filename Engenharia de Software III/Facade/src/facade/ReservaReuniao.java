/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import classes.Sala;
import classes.Participantes;
import classes.Horario;

public class ReservaReuniao {
    private Sala sala;
    private Participantes participantes;
    private Horario horario;

    public ReservaReuniao() {
        this.sala = new Sala();
        this.participantes = new Participantes();
        this.horario = new Horario();
    }

    public void reservarPassagem(String origem, String destino, int numeroSala, String horario) {
        sala.exibirSala();
        sala.SelecionarSala(numeroSala);
        participantes.listarParticipantes(numeroSala);
        horario.agendarHorario(horario);
        System.out.println("Reunião reservada com sucesso!");
    }

    
    
}


// public class ReservaReuniao {
//     private ReservaVoos reservaVoos;
//     private SelecaoAssentos selecaoAssentos;
//     private Pagamento pagamento;

//     public ReservaReuniao() {
//         this.reservaVoos = new ReservaVoos();
//         this.selecaoAssentos = new SelecaoAssentos();
//         this.pagamento = new Pagamento();
//     }

//     public void reservarPassagem(String origem, String destino, int numeroVoo, int numeroAssento, double valor) {
//         reservaVoos.buscarVoos(origem, destino);
//         reservaVoos.selecionarVoo(numeroVoo);
//         selecaoAssentos.exibirMapaAssentos();
//         selecaoAssentos.selecionarAssento(numeroAssento);
//         pagamento.processarPagamento(valor);
//         System.out.println("Passagem reservada com sucesso!");
//     }
// }