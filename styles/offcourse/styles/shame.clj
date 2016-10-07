(ns offcourse.styles.shame
  (:refer-clojure :exclude [rem + - * /])
  (:require [offcourse.styles.vocabulary :as v]
            [garden
             [units :as u :refer [rem percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [+ - * /]]
             [selectors :as s]]))

(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[v/code-pre            (merge     (:mono               templates)
                                     (:darkend-paper      templates)
                                     (:border-quotes      templates)
                                     (:border-highlighted templates)
                                     {:white-space        :pre-wrap
                                      :padding          [[(:third units) (:full units) (:third units) (- (:full units) (:sixth units))]]})
    [v/code               (merge     (:mono               templates)
                                     (:darkend-paper      templates)
                                     {:display            :block})]]])