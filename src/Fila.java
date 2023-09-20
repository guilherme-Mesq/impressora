public class Fila {

    // Instância única da fila de impressão
    private static Fila instancia;


    // Construtor privado para impedir a criação direta de instâncias
    private Fila() {
    }

    // Método para obter a instância única da fila de impressão
    public static Fila getInstance() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }

    // Método para adicionar um documento à fila de impressão
    public void imprimeDocumento(String documento) {
    }

    // Método para remover o próximo documento da fila de impressão
    public void removeDocumento() {
    }

    // Método para remover todos os documentos da fila de impressão
    public void removeTodosDocumentos() {
    }
}