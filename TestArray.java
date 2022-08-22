import java.util.ArrayList;
import java.util.List;

public class TestArray {
  protected List<Integer> array = new ArrayList<Integer>();
  private Integer arrayLength;

  TestArray(int arrayLength, int maxValue) {
    this.arrayLength = arrayLength;
    for (int i = 0; i < arrayLength; i++) {
      this.array.add((int) (Math.random() * maxValue));
    }
  }

  public List<Integer> getArray() {
    return this.array;
  }

  public void setArray(List<Integer> array) {
    this.array = array;
  }

  public Integer getArrayLength() {
    return this.arrayLength;
  }

  public void setArrayLength(Integer arrayLength) {
    this.arrayLength = arrayLength;
  }

}
