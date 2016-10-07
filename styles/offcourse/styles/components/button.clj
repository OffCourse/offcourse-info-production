(ns offcourse.styles.components.button
  (:require [offcourse.styles.vocabulary :as v]))

(defn button [{:keys [templates colors units fonts]}]
  [[v/button                (merge  (:buttonbase            templates))]
   [v/button-sheet          (merge  (:row-component         templates)
                                    (:sheet                 templates)
                                    (:subtitle              templates)
                                    {:padding            [[(:third units) (:half units)]]
                                     :margin             [[ 0 (:sixth units) 0 0]]})
    [v/hovered              (merge  (:border-highlighted    templates))]]
   [v/button-smudged        (merge  (:row-component         templates)
                                    (:recycled-paper        templates)
                                    (:border-default        templates)
                                    (:label                 templates)
                                    {:align-items           :center
                                     :padding             [[0 (:half units)]]
                                     :margin              [[0 (:full units) 0 0]]})
    [v/hovered              (merge  (:border-highlighted    templates))]]
  ])