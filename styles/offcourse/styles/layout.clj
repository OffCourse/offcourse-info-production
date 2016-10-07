(ns offcourse.styles.layout
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [stylesheet :refer [at-media]]
              [selectors :as s]
              [units :as u :refer [percent vh px]]]
            [offcourse.styles.vocabulary :as v]))

(defn layout [{:keys [templates units colors breakpoints]}]
  [[v/layout                  (merge (:column-component       templates)
                                     (:paper                  templates))]
   [v/layout--section         (merge (:recycled-paper         templates)
                                     (:row-component          templates)
                                     {:justify-content        :center})]

   [v/grid                    (merge (:row-component          templates)
                                     {:width                 (:max-content-width units)})]
   [v/grid--section           (merge (:column-component       templates)
                                     {:flex                   1
                                      :padding             [[(:full units)]]})
    [v/last                   (merge {:flex                   3
                                      :padding              [[0 (:full units)]]})]]

   [v/subgrid                 (merge (:row-component          templates)
                                     {:display                :flex
                                      :flex-wrap              :wrap})]

   [v/container                      (:row-component          templates)]
   [v/container-column               (:column-component       templates)]
   [v/container-fw            (merge (:column-component       templates)
                                     {:align-items            :stretch})]
   [v/container-wrap                 (:flex-wrap              :wrap)]
   [v/subgrid-two
    [v/container-subgrid             {:width                 (percent 50)}
     [(s/& (s/nth-child "2n-1"))     {:padding-right         (:half   units)}]
     [(s/& (s/nth-child "2n"))       {:padding-left          (:half   units)}]]]
   [v/subgrid-three
    [v/container-subgrid             {:width                 (percent 33.33333)}
     [(s/& (s/nth-child "3n-1"))     {:padding-right         (:half   units)}]
     [(s/& (s/nth-child "3n"))       {:padding-left          (:half   units)}]
     [(s/& (s/nth-child "3n-2"))     {:padding-right         (:half   units)}]
     [(s/& (s/nth-child "3n-1"))     {:padding-left          (:half   units)}]]]

   (let [{:keys [min-width max-width]} (first breakpoints)]
    (at-media                        {:min-width min-width    :max-width max-width}
     [[v/grid                        (:column-component       templates)]
      [v/grid--section               {:flex                   :unset}
       [v/last                       {:flex                   :unset}]
       [v/subgrid                    (:row-component          templates)]]
      [v/subgrid-two
       [v/container-subgrid          {:width                 (percent 100)}
        [(s/& (s/nth-child "2n-1"))  {:padding-right          0}]
        [(s/& (s/nth-child "2n"))    {:padding-left           0}]]]
      [v/subgrid-three
       [v/container-subgrid          {:width                 (percent 100)}
        [(s/& (s/nth-child "3n-1"))  {:padding-right          0}]
        [(s/& (s/nth-child "3n"))    {:padding-left           0}]
        [(s/& (s/nth-child "3n-2"))  {:padding-right          0}]
        [(s/& (s/nth-child "3n-1"))  {:padding-left           0}]]]]))])
