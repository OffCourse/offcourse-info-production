(ns offcourse.styles.components.label
  (:require [offcourse.styles.vocabulary :as v]))

(defn label-component [{:keys [templates fonts colors units]}]
  [[v/label             (merge  (:column-component      templates)
                                (:label                 templates)
                                (:recycled-paper        templates)
                                {:align-items           :center
                                 :justify-content       :center
                                 :margin-bottom        (:sixth units)
                                 :margin-right         (:sixth units)
                                 :padding             [[0 (:half units)]]})
    [v/hovered                  (:selected              templates)]]
   [v/label-smudged     (merge  (:paper                 templates))]])
