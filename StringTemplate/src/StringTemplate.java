import org.stringtemplate.v4.*;

class Attributo{
    private String type;
    private String name;
    private String value;
    
    public Attributo(String t,String n, String v){type = t; name = n; value = v;}
    
    public String getType(){return type;}
    public String getName(){return name;}
    public String getValue(){return value;}
    
    public String renderAttributo(Attributo a){
    	STGroup group = new STGroupFile("test.stg");
		ST st = group.getInstanceOf("decl");
		st.add("type", a.getType());
		st.add("name", a.getName());
		st.add("value", a.getValue());
		return st.render();
    }
}

public class StringTemplate {
	public static void main(String[] args){
		Attributo[] arrayAttr;
		arrayAttr = new Attributo[3];
		arrayAttr[0] = new Attributo("int", "x", "1");
		arrayAttr[1] = new Attributo("int", "y", "");
		arrayAttr[2] = new Attributo("int", "z", "2");
		
		for(int i = 0; i<arrayAttr.length; i++)
			System.out.println(arrayAttr[i].renderAttributo(arrayAttr[i]));
	}
}
