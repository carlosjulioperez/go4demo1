package ec.cjpq.go4demo1.creationalpatterns.prototype;

/**
 * Gang of Four Design Patterns Demo 1
 * Shape abstract class implementing Cloneable interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-07
 */
public abstract class Shape implements Cloneable{

	private String id;
	protected String type;
	
	abstract void draw();
	
	public String getType(){
		return type;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}
	
	public Object clone(){
		Object clone = null;
		try{
			clone = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}

}
