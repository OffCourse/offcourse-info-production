(ns offcourse.styles.colors
  (:refer-clojure :exclude [+ - * /])
  (:require [garden.stylesheet :refer [at-font-face]]
            [offcourse.styles.vocabulary :as v]))

(defn colors [{:keys [colors templates fonts]}]
  [[v/c--night               {:background        (:night         colors)}]
   [v/c--dark                {:background        (:dark          colors)}]
   [v/c--medium              {:background        (:medium        colors)}]
   [v/c--light               {:background        (:light         colors)}]
   [v/c--very-light          {:background        (:very-light    colors)}]
   [v/c--day                 {:background        (:day           colors)}]
   [v/c--primary             {:background        (:primary       colors)}]
   
   [v/c--highlighted         (:highlighted        templates)]
   [v/c--selected            (:selected           templates)]
   [v/c--negative            (:negative           templates)]
   [v/c--paper               (:paper              templates)]
   [v/c--recycled-paper      (:recycled-paper     templates)]
   [v/c--smudged-paper       (:smudged-paper      templates)]
   [v/c--darkend-paper       (:darkend-paper      templates)]])