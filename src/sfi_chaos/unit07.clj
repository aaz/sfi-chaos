(ns sfi-chaos.unit07)

(defrecord Point [x y])

(defn henon-map
  "Given the coefficients a & b, maps a Point p to its successor using the Henon Map"
  [a b p]
  (Point. (- (inc (:y p)) (* a (:x p) (:x p)))
          (* b (:x p))))
