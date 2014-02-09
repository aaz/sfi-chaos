(ns sfi-chaos.core-test
  (:require [clojure.test :refer :all]
            [sfi-chaos.unit03 :refer :all]))

(deftest logistic-map-test
  (testing "Logistic map with r = 1 and x = 0.5."
    (is (= 0.25 (logistic-map 1.0 0.5)))))
