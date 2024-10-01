package projeto;

// Exceção personalizada para reservas inválidas
public class ReservaInvalidaException extends Exception {
    private static final long serialVersionUID = 1L;

	public ReservaInvalidaException(String message) {
        super(message);
    }
}
