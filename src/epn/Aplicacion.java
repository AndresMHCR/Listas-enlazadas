package epn;

public class Aplicacion {

	public static void main(String[] args) {
		 SLinkedList lista = new SLinkedList();
		 
		 
		 if (lista.estaVacia())
			 System.out.println("Lista vacia");
		 
		 lista.insertarFinal("hola");
		 lista.insertarFinal("Juanito");
		 lista.insertarFinal("mama");
		 lista.insertarFinal("pepe");
		 lista.insertarFinal("lucas");
		 
		 lista.imprimirLista();
		 System.out.println("La lista tiene "+lista.tamaño()+" elementos");
		 
		 lista.eliminarpos(3);
		 
		 lista.imprimirLista();
		 System.out.println("La lista tiene "+lista.tamaño()+" elementos");
		 
		 lista.localizar(3);
		 
		 lista.vaciar();
		 
		 if (lista.estaVacia())
			 System.out.println("\nLista vacia");
		 
		 System.out.println("La lista tiene "+lista.tamaño()+" elementos");
		 

	}

}
