(ns offcourse.styles.components.business-card
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn business-card [{:keys [templates breakpoints colors units]}]
  [[v/business-card     (merge (:row-component           templates)
                               (:sheet                   templates)
                               {:width                   "100%"})
    [v/hovered                 (:border-highlighted      templates)]]
   [v/business-card--section   {:width                  (* (:atom units) 140)}
    [v/last                    {:width                   :auto
                                :padding              [[(:half units)(:half units)(:third units)(:two-third units)]]}]]])
