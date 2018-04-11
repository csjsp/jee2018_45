import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		List nums=new ArrayList();
		nums.add("1");
		nums.add("2");
		String[] row={"lisi","90","89"};
		nums.add(row);
		//集合,数据结构的java实现
	    List<String[]> rows=new ArrayList<>();
	    String[] row1={"zhangsan","90","89"};
	    rows.add(row1);
	    String[] row2={"lisi","90","89"};
	    rows.add(row2);
	    for(String[] r:rows){
	      System.out.println(r[0]);
	    }
	    
	}

}
