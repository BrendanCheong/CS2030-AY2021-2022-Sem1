/open Lazy.java
/open InfiniteList.java
/open InfiniteListImpl.java
/open EmptyList.java

new EmptyList<>().toArray()
InfiniteList.iterate(0, i -> i + 1).limit(10).limit(3).toArray()
InfiniteList.iterate(0, i -> i + 1).limit(3).limit(100).toArray()
InfiniteList.generate(() -> 1).limit(0).toArray()
InfiniteList.generate(() -> 1).limit(2).toArray()
Random rnd = new Random(1)
InfiniteList.generate(() -> rnd.nextInt() % 100).limit(4).toArray();
InfiniteList.generate(() -> "A").map(x -> x + "-").map(str -> str.length()).limit(4).toArray()
InfiniteList.generate(() -> "A").limit(4).map(x -> x + "-").map(str -> str.length()).toArray()
InfiniteList.generate(() -> "A").map(x -> x + "-").limit(4).map(str -> str.length()).toArray()
InfiniteList.iterate(1, x -> x + 1).limit(4).filter(x -> x % 2 == 0).toArray()
InfiniteList.iterate(1, x -> x + 1).filter(x -> x % 2 == 0).limit(4).toArray()
InfiniteList.iterate(0, x -> x + 1).filter(x -> x > 10).filter(x -> x < 20).limit(5).toArray()
InfiniteList.iterate(0, x -> x + 1).filter(x -> x > 10).map(x -> x.hashCode() % 30).filter(x -> x < 20).limit(5).toArray()
InfiniteList.iterate(0, x -> x + 1).takeWhile(x -> x < 3).toArray()
InfiniteList.iterate(0, x -> x + 1).takeWhile(x -> x < 0).toArray()
InfiniteList.iterate(0, x -> x + 1).takeWhile(x -> x < 10).takeWhile(x -> x < 5).toArray()
InfiniteList.iterate(0, x -> x + 1).map(x -> x).takeWhile(x -> x < 4).limit(1).toArray()
InfiniteList.iterate(0, x -> x + 1).limit(4).takeWhile(x -> x < 2).toArray()
InfiniteList.iterate(0, x -> x + 1).map(x -> x * x).filter(x -> x > 10).limit(1).toArray()
InfiniteList.iterate(0, x -> x + 1).filter(x -> x > 10).map(x -> x * x).limit(1).toArray()
Random rnd = new Random(1)
InfiniteList.generate(() -> rnd.nextInt() % 100).filter(x -> x > 10).limit(4).toArray()
new EmptyList<>().count()
InfiniteList.iterate(0, x -> x + 1).limit(0).count()
InfiniteList.iterate(0, x -> x + 1).limit(1).count()
InfiniteList.iterate(0, x -> x + 1).filter(x -> x % 2 == 1).limit(10).count()
InfiniteList.iterate(0, x -> x + 1).limit(10).filter(x -> x % 2 == 1).count()
InfiniteList.iterate(0, x -> x + 1).takeWhile(x -> x < 10).count()
InfiniteList.iterate(0, x -> x + 1).takeWhile(x -> x < 10).filter(x -> x % 2 == 0).count()
Random rnd = new Random(1)
InfiniteList.generate(() -> Math.abs(rnd.nextInt()) % 100).takeWhile(x -> x > 5).count()
new EmptyList<Integer>().reduce(100, (x,y) -> x*y)
InfiniteList.iterate(0, x -> x + 1).limit(5).reduce(0, (x, y) -> x + y)
InfiniteList.iterate(0, x -> x + 1).limit(0).reduce(0, (x, y) -> x + y)
InfiniteList.iterate(0, x -> x + 1).map(x -> x * x).limit(5).reduce(1, (x, y) -> x * y)
Random rnd = new Random(1)
InfiniteList.generate(() -> rnd.nextInt() % 100).filter(x -> x > 0).limit(10).reduce(0, (x, y) -> Math.max(x, y))
UnaryOperator<Integer> op = x -> { System.out.printf("iterate: %d -> %d\n", x, x + 1); return x + 1; };
Supplier<Integer> generator = () -> { System.out.println("generate: 1"); return 1; }
Function<Integer,Integer> doubler = x -> { System.out.printf("map: %d -> %d\n", x, x * 2); return x * 2; };
Function<Integer,Integer> oneLess = x -> { System.out.printf("map: %d -> %d\n", x, x - 1); return x - 1; };
Predicate<Integer> lessThan100 = x -> { System.out.printf("takeWhile: %d -> %b\n", x, x < 100); return x < 100; }
Predicate<Integer> moreThan10 = x -> { System.out.printf("filter: %d -> %b\n", x, x > 10); return x > 10; }
InfiniteList.iterate(0, op).filter(lessThan100).map(doubler).takeWhile(lessThan100).map(oneLess).limit(5).toArray()
InfiniteList.generate(generator).filter(lessThan100).map(doubler).takeWhile(lessThan100).map(oneLess).limit(5).toArray()
new EmptyList<>().forEach(System.out::println)
InfiniteList.iterate(0, x -> x + 1).limit(0).forEach(System.out::println)
InfiniteList.iterate(0, x -> x + 1).limit(1).forEach(System.out::println)
InfiniteList.iterate(0, x -> x + 1).filter(x -> x % 2 == 1).limit(10).forEach(System.out::println)
InfiniteList.iterate(0, x -> x + 1).limit(10).filter(x -> x % 2 == 1).forEach(System.out::println)
InfiniteList.iterate(0, x -> x + 1).takeWhile(x -> x < 10).forEach(System.out::println)
InfiniteList.iterate(0, x -> x + 1).takeWhile(x -> x < 10).filter(x -> x % 2 == 0).forEach(System.out::println)

/exit