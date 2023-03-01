import java.util.Objects;
import newpackage.lerning.Record;

public class Test {

  public static void main(String[] arg) {
    Record record = new Record();
    Record record1 = new Record("Меладзе", "Меладзе");
    Record recordNew = new Record("Валерий Меладзе", "Валерий Меладзе", 45, 56);
    System.out.println(record.getSinger());
    System.out.println(record1.getSinger());
    System.out.println(recordNew.getSinger());
    String rec = "hreugf";
  }
}


