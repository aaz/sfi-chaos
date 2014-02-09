(ns sfi-chaos.unit03
  (:use (clojure.math combinatorics)))

(defn logistic-map
  "Takes growth factor r and current population x. x is a proportion of the annihilation population, between 0 and 1"
  [r x]
  (* r x (- 1 x)))

(defn symbolise
  "Using break point b express the sequence s in terms of values being 'Left' or 'Right' of b"
  ([s] (symbolise 0.5 s))
  ([b s] (map #(if (< % b) :L :R) s)))

(defn count-patterns
  "s - partitioned sequence, p - patterns"
  [s p]
  (loop [parts s
         tally (zipmap p (repeat (count p) 0))]
    (cond
     (empty? parts) tally
     (not (contains? tally (first parts))) (recur (rest parts) tally)
     :else (recur (rest parts) (assoc tally (first parts)
                                      (inc (tally (first parts))))))))

(defn analyse-symbol-sequence
  "ss - symbol sequence, si - symbols of interest, l - pattern length"
  [ss si l]
  ;; Partition sequence; Create patterns
  (let [parts (partition l 1 ss)
        patterns (selections si l)]
    (count-patterns parts patterns)))
