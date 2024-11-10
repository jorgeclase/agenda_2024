package contactos.agenda_2024.src.aplicacion;
import contactos.agenda_2024.src.presentacion.Interfaz;


public class Principal{
	public static void main(String [] args){
		Interfaz IU=new Interfaz();
		String peticion;
		IU.procesarPeticion("help");
		do {
			peticion=IU.leerPeticion();
		} while (IU.procesarPeticion(peticion));
	}
}