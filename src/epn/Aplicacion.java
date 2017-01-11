package epn;

public class Aplicacion {

	public static void main(String[] args) {
		 SLinkedList lista = new SLinkedList();
		 String cadena="";
		 
		 if (lista.estaVacia())
			 System.out.println("Lista vacia");
		 
		 lista.insertarFinal("hola");
		 lista.insertarFinal("Juanito");
		 lista.insertarFinal("mama");
		 lista.insertarFinal("pepe");
		 
		 lista.imprimirLista();
		 

	}

}
