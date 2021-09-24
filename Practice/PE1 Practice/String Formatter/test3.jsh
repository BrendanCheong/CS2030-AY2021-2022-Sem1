/open TextFormatter.java
/open FormatterComparator.java
/open TextEditor.java
/open SnakeCase.java
/open KebabCase.java
/open PascalCase.java

import java.util.List
import java.util.ArrayList

List<TextFormatter> inputList = new ArrayList<>()
inputList.add(new SnakeCase(""))
inputList.add(new KebabCase(""))
inputList.add(new PascalCase(""))
TextEditor inputEditor = new TextEditor(inputList)
inputEditor.addString("I_Love_CS2030").printAll()
inputEditor.addString("oneword").printAll()
inputEditor.addString("two_words").printAll()
inputEditor.addString("Capitalized_Text").printAll()
inputEditor.addString("same_same").printAll()
inputEditor.addString("But_Different").printAll()
inputEditor.addString("correcT_BaTTery_stAp13_H0rSe").printAll()
