(ns sfi-chaos.unit03)

(defn logistic-eqn
  "Takes growth factor r and current population x. x is a proportion of the annihilation population, between 0 and 1"
  [r x]
  (* r x (- 1 x)))

(defn symbolise
  "Using break point b express the sequence s in terms of values being 'Left' or 'Right' of b"
  [b s]
  (map #(if (< % b) :L :R) s))

(defn symbol-pattern-freq
  "Count occurences of a given symbol pattern p in the overall sequence s"
  [p s]
  (let [symbol-seqs (partition (count p) 1 s)]
    (count (filter #(= % p) symbol-seqs))))

;; Generalise for arbitrary pattern length - use a macro?
(defn print-sequence-summary
  "Display counts for each symbol pattern"
  [s]
  (doseq [first '(:L :R) second '(:L :R)]
    (println (symbol-pattern-freq (list first second) s)
             (list first second))))
