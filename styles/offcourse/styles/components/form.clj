(ns offcourse.styles.components.form
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn form [{:keys [templates colors fonts units]}]
  [[v/form--input         (merge (:form                 templates)
                                 (:recycled-paper       templates)
                                 {:flex                 2
                                  :padding           [[(:half units)(:half units)(:half units)(:full units)]]})]

   [v/form--subscribe     (merge (:component            templates)
                                 (:buttonbase           templates)
                                 (:form                 templates)
                                 (:highlighted          templates)
                                 {:flex 1
                                  :justify-content      :center
                                  :align-items          :center
                                  :padding           [[(:half units) 0]]})
    [v/hovered                   (:negative             templates)]]
 
   [:div ; Flat specificity requires non-trivial changes in mailchimp form
    [v/and--form--error   (merge (:subtitle             templates)
                                 (:negative             templates)
                                 {:width               (percent 100)
                                  :padding           [[(:third units) (:third units) (:third units) (:full units)]]
                                  :margin               0})]]
   [v/form--success       (merge (:title                templates)
                                 {:padding-top         (:two-third units)})]
  ]) 