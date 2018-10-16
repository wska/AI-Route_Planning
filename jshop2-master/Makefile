c: src/JSHOP2/JSHOP2.g src/JSHOP2/*.java
	cd src/JSHOP2; java antlr.Tool JSHOP2.g; javac *.java
	cd src; jar cvf JSHOP2.jar JSHOP2/*.class;
	rm src/JSHOP2/*.class
	mv src/JSHOP2.jar bin.build/

clean:
	rm src/JSHOP2/JSHOP2Lexer.*
	rm src/JSHOP2/JSHOP2Parser.*
	rm src/JSHOP2/JSHOP2TokenTypes.java
	rm src/JSHOP2/JSHOP2TokenTypes.txt


d: src/JSHOP2/*.java
	rm -rf doc
	cd src; javadoc -d ../doc -author -version -private JSHOP2

1: bin.build/JSHOP2.jar
	cd routeplanning_coupled; java JSHOP2.InternalDomain routeplanning
	cd routeplanning_coupled; java JSHOP2.InternalDomain -r problem
	cd routeplanning_coupled; javac gui.java
	cd routeplanning_coupled; java -Xmx256M gui
	cd routeplanning_coupled; rm routeplanning.java; rm routeplanning.txt; rm problem.java; rm *.class

2: bin.build/JSHOP2.jar
	cd routeplanning_decoupled; java JSHOP2.InternalDomain routeplanning
	cd routeplanning_decoupled; java JSHOP2.InternalDomain -r problem
	cd routeplanning_decoupled; javac gui.java
	cd routeplanning_decoupled; java -Xmx256M gui
	cd routeplanning_decoupled; rm routeplanning.java; rm routeplanning.txt; rm problem.java; rm *.class
