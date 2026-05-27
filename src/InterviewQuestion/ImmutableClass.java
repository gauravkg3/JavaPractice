package InterviewQuestion;

import java.util.Date;
import java.util.List;

public final class ImmutableClass {

  private final String name;
  private final int id;
  private final Date localDate;
  private final List<Integer> list;

  public ImmutableClass(String name,int id,Date localDate,List<Integer> list)
  {
      this.name=name;
      this.id=id;
      this.localDate=new Date(localDate.getTime());
      this.list=List.copyOf(list);
  }

  public String  getName()
  {
      return name;
  }
  public int getId()
  {
      return id;
  }

  public Date getLocalDate()
  {
      return new Date(localDate.getTime());
  }
  public List<Integer> getList()
  {
      return List.copyOf(list);
  }
}
