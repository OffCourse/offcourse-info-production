(ns offcourse.styles.helpers
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [percent vh px]]]
            [offcourse.styles.vocabulary :as v]))

(defn helpers [{:keys [templates breakpoints colors units fonts]}]
  [[v/padding-b-third         {:padding             [[ 0 0 (:third units) 0]]}]
   [v/padding-b-half          {:padding             [[ 0 0 (:half units) 0]]}]
   [v/padding-t-twothird      {:padding             [[(:two-third units) 0 0 0]]}]
   [v/padding-b-twothird      {:padding             [[ 0 0 (:two-third units) 0]]}]
   [v/padding-tb-twothird     {:padding             [[(:two-third units) 0]]}]
   [v/padding-t-one           {:padding             [[(:full units) 0 0 0]]}]
   [v/padding-b-one           {:padding             [[ 0 0 (:full units) 0]]}]
   [v/padding-tb-one          {:padding             [[(:full units) 0]]}]
   [v/padding-trbl-one        {:padding             [[(:full units)]]}]
   [v/padding-t-two-b-one     {:padding             [[(:two units) 0 (:full units) 0]]}]
   [v/padding-t-two           {:padding             [[(:two units) 0 0 0]]}]
   [v/padding-b-two           {:padding             [[ 0 0 (:two units) 0]]}]
   [v/padding-tb-two          {:padding             [[(:two units) 0]]}]
   [v/padding-tb-four         {:padding             [[(:four units) 0]]}]
  ])