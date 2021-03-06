import org.apache.parquet.io.api.Binary;

public class StringConverter extends CountSetConverter {

  public StringConverter(String columnName){
    super(columnName);
  }

  @Override
  public void addBinary(Binary value) {
    count.add(value.toStringUsingUTF8());
  }
}