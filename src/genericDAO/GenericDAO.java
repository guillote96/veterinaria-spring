package genericDAO;

public interface GenericDAO<T> {
	
	public T buscar(int id);
	public Boolean alta (T entidad);
	public Boolean borrar (int id);
	public Boolean modificar (T entidad);

}
