# Session 2

## Jars

Jars are the main way Java programs are distributed. They are archives not unlike rars. Jars have the extension `.jar`.

Jars are composed of your `.class` files.

Executable jars need their entrypoints defined in a manifest. In our app, that manifest is `manifest.txt`.

```bash

# this is a comment
# below compiles multiple files
javac *.java
# below bundles our classes into a jar
jar cfm app.jar manifest.txt *.class
# run the jar file
java -jar app.jar

```