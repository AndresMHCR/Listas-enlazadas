package epn;

public class SLinkedList {

	protected Nodo head;  
	protected long size; 
	
 public SLinkedList() {
	 head = null;
	 size = 0;
	}
	
 public boolean estaVacia(){
	 
	 return head==null;
	 
 }

 public void insertaralInicio(String a){
	 if (estaVacia()) 
		  head= new Nodo(a);
	 else 
		  head = new Nodo(a,head);
	 
	 
 }
 
 public void insertarFinal(String a){

     Nodo aux = new Nodo(a);
     Nodo inicio;

     if (estaVacia()) {
         insertaralInicio(a);
     }else {
         inicio = head;         
         while(inicio.getNext() != null){
             inicio=inicio.getNext();
         }              
         inicio.setNext(aux);
     }
 }
 public void imprimirLista(){
     System.out.println("Contenido de la lista");
     System.out.println("---------------------");
     
     Nodo aux= head;
     
     while(aux!=null){
         System.out.println(aux.getElement());
         aux=aux.getNext();
     }
     
 }
}
