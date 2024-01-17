# Linux / MacOS
# Sheldon Pasciak, MCC, 2016-09-01
# This script compiles all the java files in the current directory
# and below.  It creates a file called sources.txt that contains
# the names of all the java files.  It then compiles all the java
# files in sources.txt.  It then lists all the class files in the
# current directory.
cd /Users/sheldonpasciak/SDPre/Labs/ || exit
ls -l ./*.java
find . -name "*.java" > sources.txt
javac @sources.txt
ls -l ./*.Class

