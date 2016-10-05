(ns sourdough.core
  (:require [clojure.pprint :as pprint]
            [clojure.java.io :as io])
  (:gen-class))

(defn how-much-with-starter [starter]
  (let
    [first-time-sourdough (* 3 starter)
     fin-sourdough (* 9 starter)
     sourdough-in-dough (- fin-sourdough starter)
     flour (* 11 (/ sourdough-in-dough 15.0))
     water (/ sourdough-in-dough 3.0)
     weight (+ sourdough-in-dough flour water)]
    (clojure.pprint/print-table
      [{"вторая подкормка по" first-time-sourdough
        "в итоге закваски" fin-sourdough
        "закваски в тесто" sourdough-in-dough
        "муки в тесто"flour
        "воды в тесто"water
        "вес хлеба"weight}]))
  )

(defn -main [& args]
  (-> args first Double/parseDouble how-much-with-starter))

;; (how-much-with-starter 41)
