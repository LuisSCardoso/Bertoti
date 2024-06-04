package classes;

public class Participantes {
    
    public void listarParticipantes(int numeroSala) {
        System.out.println("Participantes confirmados na sala " + numeroSala + ".");
    }
    
    public void agendarParticipantes(String origem, String reuniao,String sala ,String horas) {
        System.out.println("Participantes agendados para a reunião em " + sala + " a partir de " + horas + ".");
}

}
