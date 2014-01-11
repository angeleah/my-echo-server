Echo(Echo) Server
=================
This was an exercise to get me familiar with a basic echo server.  You can run it and have it echo back to you. It has some extra functionality described below as well.  It is written in Clojure.

Usage:
------
- Running the program:
  + First, you need to make sure that you have a Java version greater than 1.5.  $ java -version to check this.
  + Next you need [Leiningen](https://github.com/technomancy/leiningen). The quickes way to that is to use [Homebrew](http://brew.sh/) if you have that installed.( brew install Leiningen)
  If you do not have Homebrew, follow the instructions on the Leiningen page.
  + Once you have that set up, you can clone the project, cd to the root, and type lein run.  It will look like nothing is happening.  That is the server running. Leave it open and running.
  + In a new terminal window, cd to the project root and use telnet to connect to the server.(ex: type telnet localhost 1234)
  + type in *almost* anything and it will echo back to you.
  + Remember how I said almost?  If you type quit, it will say "goodbye" and will close the connection. Ask "what is the meaning of life?" for a surprising answer.

- Running the specs:
  + First, you need to make sure that you have a Java version greate than 1.5.  $ java -version to check this.
  + Next you need [Leiningen](https://github.com/technomancy/leiningen). The quickes way to that is to use [Homebrew](http://brew.sh/) if you have that installed.( brew install Leiningen)
  If you do not have Homebrew, follow the instructions on the Leiningen page.
  + Once you have that set up, you can clone the project, cd to the root, and type lein spec.
