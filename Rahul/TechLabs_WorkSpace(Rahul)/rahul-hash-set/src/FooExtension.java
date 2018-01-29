
public class FooExtension extends Foo {
	public FooExtension(){
		this.bar = "20";
		//super.bar = 200;
	}
	public String getThisdotBar(){
		return this.bar;
	}
	public String getSuperdotBar(){
		return super.bar;
	}

}
