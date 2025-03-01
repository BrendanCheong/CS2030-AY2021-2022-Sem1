/open Lazy.java
/open InfiniteList.java
/open InfiniteListImpl.java
/open EmptyList.java

InfiniteList.iterate(1, x -> x + 1).isEmpty()
InfiniteList.generate(() -> 2).isEmpty()
InfiniteList.generate(() -> 2).filter(x -> x % 3 == 0).isEmpty()
InfiniteList.iterate(1, x -> x + 1).map(x -> 2).isEmpty()
InfiniteList.iterate(1, x -> x + 1).filter(x -> x % 2 == 0).isEmpty()
new EmptyList<>().isEmpty()
new EmptyList<>().map(x -> 2).isEmpty()
new EmptyList<>().filter(x -> true).isEmpty()
new EmptyList<>().filter(x -> false).isEmpty()
InfiniteList.iterate(1, x -> x + 1).limit(0).isEmpty()
InfiniteList.iterate(1, x -> x + 1).limit(1).isEmpty()
InfiniteList.iterate(1, x -> x + 1).limit(-1).isEmpty()
UnaryOperator<Integer> op = x -> { System.out.printf("iterate: %d -> %d\n", x, x + 1); return x + 1; };
InfiniteList.iterate(1, op).limit(0).isEmpty()
InfiniteList.iterate(1, op).limit(1).isEmpty()
InfiniteList.iterate(1, op).limit(2).isEmpty()
InfiniteList<Integer> list;
list = InfiniteList.iterate(1, op).limit(0).peek()
list = InfiniteList.iterate(1, op).limit(1).peek()
list = InfiniteList.iterate(1, op).limit(1).peek().peek()
list = InfiniteList.iterate(1, op).limit(2).peek().peek().peek()
list = InfiniteList.iterate(1, op).limit(2).limit(1).peek().peek()
list = InfiniteList.iterate(1, op).limit(1).limit(2).peek().peek()
InfiniteList.iterate(1, op).takeWhile(x -> x < 0).isEmpty()
InfiniteList.iterate(1, op).takeWhile(x -> x < 2).isEmpty()
list = InfiniteList.iterate(1, op).takeWhile(x -> x < 0).peek()
list = InfiniteList.iterate(1, op).takeWhile(x -> x < 2).peek().peek()
list = InfiniteList.iterate(1, op).takeWhile(x -> x < 2).takeWhile(x -> x < 0).peek()
list = InfiniteList.iterate(1, op).takeWhile(x -> x < 0).takeWhile(x -> x < 2).peek()
list = InfiniteList.iterate(1, op).takeWhile(x -> x < 5).takeWhile(x -> x < 2).peek().peek()
Predicate<Integer> lessThan5 = x -> { System.out.printf("takeWhile: %d -> %b\n", x, x < 5); return x < 5; }
list = InfiniteList.iterate(1, op).takeWhile(lessThan5).peek().peek()

/exit