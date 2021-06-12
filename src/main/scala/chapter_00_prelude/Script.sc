// Scala REPL
(1 to 10) foreach println
(2 to 10 by 2) foreach println
(1 to 10).sum
val letters = ('a' to 'z').toList
letters.foldRight("")(_ + _)
letters.foldLeft("")(_ + _)
