class Greeter {
    String owner
    String greet(String name) {
		"Hello ${name}, I am ${owner}" 
	}
}

def greeter = new Greeter(owner: "Puneet Behl")
println greeter.greet("Newer") 
