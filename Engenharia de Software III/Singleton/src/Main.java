public class Main {
    public static void main(String[] args) {
        ControleRegistro controleRegistro = controleRegistro.getInstance();

        // Tentando iniciar a impressão duas vezes para demonstrar que apenas uma é permitida
        controleRegistro.startRegistro();
        controleRegistro.startRegistro();

        // Finalizando a impressão
        controleRegistro.finishRestartRegistro();
    }
}
