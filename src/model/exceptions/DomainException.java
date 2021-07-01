package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 3303870181677866627L;

//	public DomainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//		// TODO Auto-generated constructor stub
//	}
//
//	public DomainException(String message, Throwable cause) {
//		super(message, cause);
//		// TODO Auto-generated constructor stub
//	}

	public DomainException(String message) { // Permite que eu possa instanciar minha Exceção personalizada enviando uma msg para ela.
		super(message);
		// TODO Auto-generated constructor stub
	}

//	public DomainException(Throwable cause) {
//		super(cause);
//		// TODO Auto-generated constructor stub
//	}
	
}
