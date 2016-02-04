class Person {
   String name
   Integer age
   

   public void setName(String  name) {  // Added by default
   println "called setName"
       this.name =name
   }
   public String getName(){                 // Added by Default
   println "called getName"
       return name
   }
   
   void setAge(age) {
       println "called set age"
       this.age = age
   }

   Integer getAge() {
       println "called get age"
       age*2
   }
   
  String getNameAndAge() {
       println "$name ($age)"
   }
}


Person person = new Person()
person.@name = "Gaurav"
person.name
