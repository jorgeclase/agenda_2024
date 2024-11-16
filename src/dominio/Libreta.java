package contactos.agenda_2024.src.dominio;
import java.util.ArrayList;
import java.io.Serializable;

public class Libreta implements Serializable {
    private ArrayList<Contacto> lista;

    public Libreta() {
        lista = new ArrayList<Contacto>();
    }

    public Libreta add(Contacto c) throws Exception {
        if (lista.contains(c)) {
            throw new Exception("Error: El contacto ya existe.");
        }
        lista.add(c);
        return this;
    }

    public String toString() {
        String cadena = "";
        for (Contacto c : lista)
            cadena += c + "\n";
        return cadena;
    }

    public Libreta del(String nombre) throws Exception {
        if (!lista.remove(new Contacto(nombre))) {
            throw new Exception("Error: Contacto no encontrado.");
        }
        return this;
    }

    public Contacto search(String n) throws Exception {
        int i = lista.indexOf(new Contacto(n));
        if (i == -1) {
            throw new Exception("Error: Contacto no encontrado.");
        }
        return lista.get(i);
    }
}