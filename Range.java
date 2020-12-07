import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){

    try{

      if(!(start<=end)){
        throw new IllegalArgumentException("Start value must be less than or equal to end");
      }
      this.start=start;
      this.end=end;
      current = start;
    }
    catch(IllegalArgumentException e){
      throw new IllegalArgumentException("Start value must be less than or equal to end");
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
