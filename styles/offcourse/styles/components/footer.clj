(ns offcourse.styles.components.footer
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]
              [selectors :as s]]
            [offcourse.styles.vocabulary :as v]))

(defn footer [{:keys [templates colors units]}]
  [[v/footer              (:negative      templates)]])