package collections;
public class Pairs<T,U>{
	  public T items1 ;
	  public U items2 ;
	  public T getItems1() {
		  return items1;
	  }
	  public void setItems1(T items1) {
		  this.items1 = items1;
	  }
	  public U getItems2() {
		  return items2;
	  }
	  public void setItems2(U items2) {
		  this.items2 = items2;
	  }
	  
	  T getFirst() {
		  return this.items1;
	  }
	  U getSecond() {
		  return this.items2;
	  }
	  
}