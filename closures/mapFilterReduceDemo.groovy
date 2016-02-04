//@groovy.transform.Immutable
class Person {
	String name
	int age
}

def persons = [
	new Person('Puneet', 25),
	new Person('Gaurav', 35),
	new Person('Himanshu', 30),
	new Person('Roni', 27)
]

def names = persons.findAll { it.age < 30 }
                   .collect { it.name.toUpperCase() }
                   .sort()
                   .join(', ')

assert names == "Puneet, Roni"