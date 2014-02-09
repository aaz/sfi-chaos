(ns sfi-chaos.t-unit03
  (:use midje.sweet)
  (:require [sfi-chaos.unit03 :as unit03]))

(fact "symbolise represents numbers as 'left' or 'right' of given value"
      (unit03/symbolise 0.4 [0 0.3 -1 0.4 0.6 0.0]) => [:L :L :L :R :R :L]
      (unit03/symbolise [(/ 0.5 2) 1/3 0.4999 0.5 0.9]) => [:L :L :L :R :R])
