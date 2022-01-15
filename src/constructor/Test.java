package constructor;

public class Test {
	int id;
	String name; 
	Test(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Test t1=new Test(101,"Nikita");
		Test t2=new Test(102,"Ankita");
		System.out.println(t1.name+" "+t1.id);
		System.out.println(t2.name+" "+t2.id);
	}

}
