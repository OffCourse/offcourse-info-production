(ns offcourse.styles.global
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :as u :refer [percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]]))

(defn global [{:keys [templates breakpoints colors units fonts]}]
  [[:*                {:margin                0
                       :padding               0
                       :box-sizing            :border-box
                       :outline               :none}]

   [:html             {:position              :relative
                       :font-family          (:base fonts)
                       :overflow-x            :hidden}]

   [:ul               {:list-style            :none
                       :margin-right          :none}]

   [:a                {:color                 :inherit
                       :text-decoration       :inherit}]
   
   [:textarea         {:resize                :none}]

   [:input            {:border                :none}]

   (for [{:keys [min-width max-width percent]} breakpoints]
     (at-media        {:min-width min-width   :max-width max-width}
                      [:html {:font-size      percent
                              :line-height   (:base-line-height units)}]))])