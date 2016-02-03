public class Greeter {
	private String owner;

	public  String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String greet() {
		return "Hello " + name + "I am " + owner;
	}

}

Greeter greeter = new Greeter();
greeter.setOwner( "Puneet Behl" )
System.out.println( greeter.greet("Newers") );