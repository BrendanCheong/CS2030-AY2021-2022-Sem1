/open Question.java
/open LockQuestion.java
/open FillInBlank.java
/open MCQ.java
/open TFQ.java
/open Grader.java
/open FreeTenMarksGrader.java
/open OffByOneGrader.java
/open DummyGrader.java

MCQ mcq = new MCQ("Colour of orange?", new String[]{"red", "green", "blue", "orange"}, 4)
mcq.answer(4)
mcq.answer(4).answer(3)
mcq.answer(4).answer(3).answer(4)
mcq
/exit
