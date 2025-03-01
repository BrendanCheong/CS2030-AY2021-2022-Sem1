/open Question.java
/open LockQuestion.java
/open FillInBlank.java
/open MCQ.java
/open TFQ.java
/open Grader.java
/open FreeTenMarksGrader.java
/open OffByOneGrader.java
/open DummyGrader.java
/open MRQ.java

String[] options = {"apple", "banana", "car", "orange"}
int[] answers = {2, 1, 4}
MRQ mrq = new MRQ("Pick the fruits.", options, answers)
mrq.answer(4)
mrq.answer(4).answer(3)
mrq.answer(4).answer(3).answer(4)
mrq
String[] options = {"apple", "banana", "car", "orange"}
int[] answers = {2, 1, 4}
Question q = new MRQ("Pick the fruits.", options, answers)
q.mark()
q.answer(1).mark()
q.answer(1).lock().answer(2)
q.answer(1).lock().mark()
q.answer(4).answer(1)
q.answer(4).answer(1).lock().mark()
q.answer(4).answer(1).answer(4)
q.answer(4).answer(1).answer(2).lock().mark()
q.answer(1) instanceof MRQ
q.answer(1).lock() instanceof MRQ

Question q = new MRQ("Question Time!", new String[] {"a", "b", "c", "d", "e"}, new int[] { 1, 3, 5})
q.answer(1).answer(3).answer(1)
q.answer(1).answer(3).answer(5)
q.answer(5).answer(3).answer(4)
q.answer(1).answer(3).answer(4).lock().mark()
q.answer(1).answer(3).answer(5).lock().mark()
q.answer(5).answer(3).answer(2).lock().mark()
q.answer(5).answer(3).answer(3).lock().mark()