import org.stringtemplate.v4.*;

class Attributo{
	private String visibility;
    private String type;
    private String name;
    private String value;
    
    public Attributo(String vis, String t,String n, String val){ visibility = vis; type = t; name = n; value = val;}
    
    public String getVisibility(){ return visibility;}
    public String getType(){return type;}
    public String getName(){return name;}
    public String getValue(){return value;}
    
    public String renderAttributo(){
    	STGroup group = new STGroupFile("test.stg");
		ST st = group.getInstanceOf("decl");
		st.add("visibility", this.getVisibility());
		st.add("type", this.getType());
		st.add("name", this.getName());
		st.add("value", this.getValue());
		return st.render();
    }
}

public class StringTemplate {
	public static void main(String[] args){
		Attributo[] arrayAttr;
		arrayAttr = new Attributo[3];
		arrayAttr[0] = new Attributo("public", "int", "x", "1");
		arrayAttr[1] = new Attributo("private", "int", "y", null);
		arrayAttr[2] = new Attributo(null, "int", "z", "2");
		
		for(int i = 0; i<arrayAttr.length; i++)
			System.out.println(arrayAttr[i].renderAttributo());
	}
}
