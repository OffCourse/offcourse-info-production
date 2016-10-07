(ns offcourse.styles.components.image
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn image [{:keys [templates colors fonts units]}]
  [[v/image                   {:display           :block
                               :max-width        (percent 100)}]
   [v/image-size-10           {:max-width        (percent 10)}]
   [v/image-filter            {:filter            "grayscale(100%)"
                               :transition      [[:all "1s" :ease "1s"]]}]
   [v/image-filter-recolor
    [v/hovered                {:filter            :none}]]]) 