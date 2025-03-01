/open Virus.java
/open AlphaCoronavirus.java
/open SARS_CoV_2.java
/open BetaCoronavirus.java
/open Person.java
/open Contact.java

Person a = new Person("A").infectWith(List.of(new AlphaCoronavirus(1)), 1)
Person b = new Person("B").infectWith(List.of(new SARS_CoV_2(1)), 1)
Contact e = new Contact(a, b, 1)
e.transmit(1).get(0).test("Alpha Coronavirus")
e.transmit(1).get(0).test("SARS-CoV-2")
e.transmit(1).get(0).test("Beta Coronavirus")
e.transmit(1).get(1).test("Alpha Coronavirus")
e.transmit(1).get(1).test("SARS-CoV-2")
e.transmit(1).get(1).test("Beta Coronavirus")
Arrays.toString(e.getPeople().toArray())
e.timeOfContact()
/exit