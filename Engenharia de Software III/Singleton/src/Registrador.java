public class Registrador {
    private static Registrador instance;
    private boolean registroInProgress;

    private Registrador() {
        registroInProgress = false;
    }

    public static Registrador getInstance() {
        if (instance == null) {
            instance = new Registrador();
        }
        return instance;
    }

    public void startRegistro() {
        if (!registroInProgress) {
            registroInProgress = true;
            System.out.println("Iniciando impressão...");
        } else {
            System.out.println("Já existe uma impressão em andamento.");
        }
    }

    public void finishRegistro() {
        if (registroInProgress) {
            registroInProgress = false;
            System.out.println("Impressão finalizada.");
        } else {
            System.out.println("Não há impressão em andamento para finalizar.");
        }
    }

    public void controleRegistro() {
        if (registroInProgress) {
            System.out.println("Impressão em andamento. Use o comando 'finish' para finalizar.");
        } else {
            System.out.println("Nenhuma impressão em andamento. Use o comando 'start' para iniciar.");
        }
    }
}
