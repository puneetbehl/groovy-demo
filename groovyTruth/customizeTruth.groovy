class Account {
	String name
	boolean disabled = false 

	boolean asBoolean() { !disabled }
}

assert new Account( name: "current" )
assert !new Account( name: "old", disabled: true )


// while( account ), if( account ) etc.