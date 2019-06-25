package gt.com.init.oauth.exception;

public class UsuarioNotFoundException  extends Exception{
	private long id;
	public UsuarioNotFoundException(long id) {
	        super(String.format("resource is not found with id : '%s'", id));
	        }
}
