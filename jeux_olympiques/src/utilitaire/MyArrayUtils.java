package utilitaire;

public class MyArrayUtils<T> {
	
	//Attribue
	private T[] obj;
	
	//Constructor
	public MyArrayUtils(T[] tabdeT) {
		obj=tabdeT;
	}
	
	//Getter
	public T[] getArray() { return obj; }
	
	public T getAt(int pos) { return obj[pos]; }
	
	public void changeAt(T t, int pos) { obj[pos]=t;}
	
	public String toString(){
		String s="";
		for(T elt:this.obj) {
			s+=" "+elt.toString();
		}
		return s;
	}
}



