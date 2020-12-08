import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex = 0;
    data = new int[other.length];
    for(int i = 0; i < other.length; i ++){
      data[i] = other[i];
    }
  }
  public void reset(){
    
  }
  public int length(){
    return 1;
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    return true;
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){
    return 1;
  }
}
