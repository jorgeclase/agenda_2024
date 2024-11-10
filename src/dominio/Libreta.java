package contactos.agenda_2024.src.dominio;
import java.util.ArrayList;
import java.io.Serializable;
public class Libreta implements Serializable{
	private ArrayList<Contacto> lista;

	public Libreta(){
		lista=new ArrayList<Contacto>();
	}

	public Libreta add(Contacto c){
 		lista.add(c);
		return this;
	}

	public String toString(){
		String cadena="";
		for ( Contacto c:lista)
			cadena+=c+"\n";
		return cadena;
	}

	public Libreta del(String nombre){
		lista.remove(new Contacto(nombre));
		return this;
	}
	public Contacto search(String n){
		int i=lista.indexOf(new Contacto(n));
		return lista.get(i);
	}
}