import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex = 0;
    data = other;
  }
  public void reset(){
    currentIndex = data[0];
  }
  public int length(){
    return data.length;
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    return currentIndex < data.length;
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){
    int temp = currentIndex;
    try{
      if(currentIndex>=data.length){
        throw new NoSuchElementException("Current must not be greater than end");
      }
      currentIndex++;
    }catch(NoSuchElementException e){
      throw new NoSuchElementException("Current must not be greater than end");
    }
     return data[temp];
  }
}
