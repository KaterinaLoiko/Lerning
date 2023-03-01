package newpackage.lerning;

public class Record {
  String singer;
  String author;
  int year;
  int duration;

  public String getSinger() {
    return singer;
  }

  public Record(String singer, String author, int year, int duration) {
    this.singer = singer;
    this.author = author;
    this.duration = duration;
    this.year = year;
  }

  public Record(String singer, String author) {
    this.singer = singer;
    this.author = author;
  }

  public Record() {
  }

}
