(ns offcourse.styles.components.sheet
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [*]]
             [stylesheet :refer [at-media]]
             [selectors :as s]]
            [offcourse.styles.vocabulary :as v]))

; Disliking this abstraction!
(defn sheet [{:keys [templates breakpoints colors units]}]
  [[v/sheet                       (merge (:column-component        templates)
                                         (:sheet                   templates)
                                         {:padding                (:full units)
                                          :transition            [[:margin-top "1s" :ease-in-out]]})
    [v/hovered                           (:border-highlighted      templates)]]

   [v/sheet--section-collapsable  (merge {:padding               [[0 0 0 0]]
                                          :overflow                :hidden
                                          :transition            [[:max-height "0.5s" :ease-in-out]]
                                          :max-height              0})]

   ; cleanup this selector
   [(v/sheet--section-collapsable v/hover) (s/+ ".sheet--section:hover" v/sheet--section-collapsable) {:max-height             (* (:full units) 10)
                                                                                                       :transition            [[:max-height "0.5s" :ease-in-out "0.5s"]]}]

   [v/sheet--section              (merge {:padding               [[0 0 (:half units) 0]]})
    [v/last                              {:padding               [[0 0 0 0]]}]]
   [v/sheet--title                (merge (:title                   templates))]
   [v/sheet--subtitle             (merge (:subtitle                templates))]
   [v/sheet--text                 (merge (:text                    templates))]])
