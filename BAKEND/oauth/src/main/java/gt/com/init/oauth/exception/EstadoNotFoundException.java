package gt.com.init.oauth.exception;

public class EstadoNotFoundException  extends Exception{
	private long estado_id;
	public EstadoNotFoundException(long estado_id) {
	        super(String.format("Book is not found with id : '%s'", estado_id));
	        }
}
