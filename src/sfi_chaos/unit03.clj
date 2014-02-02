(ns sfi-chaos.unit03)

(defn logistic-eqn
  "Takes growth factor r and current population x. x is a proportion of the annihilation population, between 0 and 1"
  [r x]
  (* r x (- 1 x)))

(defn symbolise
  "Using break point b express the sequence s in terms of values being 'Left' or 'Right' of b"
  [b s]
  (map #(if (< % b) :L :R) s))

(defn symbol-seq-freq
  "Return a frequency count of given symbol seq"
  [p s]
  (let [symbol-seqs (partition (count p) 1 s)]
    (count (filter #(= % p) symbol-seqs))))

;; (doseq [first '(:L :R) second '(:L :R)] (println (symbol-seq-freq (list first second) ss) (list first second)))
