(ns concurrency-functional-programming-with-clojure.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn hello [name]
  (str "hello " name))

  (hello "world")