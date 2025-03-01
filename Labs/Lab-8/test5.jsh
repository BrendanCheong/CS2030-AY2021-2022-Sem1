/open Logger.java
/open Pair.java

Logger<Integer> five = Logger.<Integer>of(5)

five.test(x -> x == 5, five.map(x -> x + 1), five.map(x -> x - 1))
five.map(x -> x + 1).test(x -> x == 5, five.map(x -> x + 1), five.map(x -> x - 1))

five.map(x -> x + 1).
    test(x -> x == 5, 
        five.map(x -> { System.out.println("add 1"); return x + 1; }),
        five.map(x -> { System.out.println("sub 1"); return x - 1; }))


// test the level5.jsh here, copy and paste level5.jsh into jshell first before using the test cases below
add(Logger.<Integer>of(5), 6)
add(Logger.<Integer>of(5).map(x -> x * 2), 6)

sum(0)
sum(5)

f(16)
f(10)