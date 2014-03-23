(ns sfi-chaos.core
  (:use [sfi-chaos.unit03]
        [incanter core charts]))

(def lm20 (partial logistic-map 2.0))
(def lm30 (partial logistic-map 3.0))
(def lm35 (partial logistic-map 3.5))
(def lm357 (partial logistic-map 3.57))
(def lm40 (partial logistic-map 4.0))

(def NUMBER-TO-PLOT 40)
(def NUMBER-TO-SKIP 1400)

(def series-1 (take NUMBER-TO-PLOT (drop NUMBER-TO-SKIP (iterate lm40 0.2))))
(def series-2 (take NUMBER-TO-PLOT (drop NUMBER-TO-SKIP (iterate lm40 0.200000001))))
(def iterations (range 0 NUMBER-TO-PLOT))

(def plot (line-chart iterations series-1 :legend true :series-label "s1"))
(set-stroke plot :series 0 :width 2.5)
(add-categories plot iterations series-2 :series-label "s2")
(set-stroke plot :series 1 :width 2.5)

(view plot)
