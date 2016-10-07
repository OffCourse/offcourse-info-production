(ns offcourse.styles.components.logo
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [stylesheet :refer [at-media]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn logo [{:keys [templates colors units fonts breakpoints]}]
  [[v/logo                     (:textbar             templates)]

   [v/logo-padded              {:padding           [[0 (:full units)]]}]

   [v/logo-inverse             (:paper               templates)]
   
   [v/logo-large        (merge (:banner              templates)
                               {:padding           [[0 (:full units) 0 (* (:atom units) 25)]]
                                :margin            [[0 (:third units) (:third units) 0]]})]
   (let [{:keys [min-width max-width]} (first breakpoints)]
    (at-media                  {:min-width min-width    :max-width max-width}
     [[v/logo-large            (:logo                   templates)]]))])