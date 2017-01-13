package epn;

public class SLinkedList {

	protected Nodo head;  
	protected int size; 
	
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
 
 public  void vaciar(){
	  head=null;
 }
 
 public int tamaño(){
     Nodo aux;
     size=0;
     aux = head;

     while(aux != null){
         size++;
         aux = aux.getNext();
     }
     return size;

 }
 
public void localizar(int pos){
	 
     Nodo aux= head;
     int contador=1;

     if(pos<1 || pos>=tamaño()){
         System.out.println("posicion no valida");
     }else{
         while(aux!=null){
             if (pos == contador){
                 System.out.println("Se encontro el elemento <"+aux.getElement()
                 					+"> en la posicion "+ pos);
                 aux=null;
                 }
                 
             else{                 
                 aux=aux.getNext();
                 contador++;
             }
         }
     }
 }
 public void eliminarpos(int pos){
	 
     Nodo aux= head;
     Nodo anterior=null;
     int contador=1;

     if(pos<1 || pos>=tamaño()){
         System.out.println("posicion no valida");
     }else{
         while(aux!=null){
             if (pos == contador){
                 if (anterior==null){
                     head = head.getNext();
                 }else {
                     anterior.setNext(aux.getNext());
                 }
                 aux=null;
             }else{
                 anterior=aux;
                 aux=aux.getNext();
                 contador++;
             }
         }
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
