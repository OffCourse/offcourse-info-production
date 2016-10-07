(ns offcourse.styles.components.roadmap-item
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* / + -]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn roadmap-item [{:keys [templates breakpoints colors units]}]
  [[v/roadmap-item                  (merge (:column-component        templates)
                                           (:sheet                   templates)
                                           {:padding               [[(:full units) (:full units) 0 (:full units)]]})
    [v/hovered                             (:border-highlighted      templates)
     [v/roadmap-item--collapsable          {:max-height             (* (:full units) 20)
                                            :transition            [[:max-height "0.5s" :ease-in-out "1s"]]}]]]
   [v/roadmap-item--collapsable     (merge {:padding               [[0 0 0 0]]
                                            :overflow                :hidden
                                            :transition            [[:max-height "0.5s" :ease-in-out "1s"]]
                                            :max-height              0})]
   [v/roadmap-item--header          (merge (:row-component           templates)
                                           {:justify-content         :space-between
                                            :padding               [[0 0 (:full units) 0]]})]
   [v/roadmap-item--issue-number    (merge (:title                   templates)
                                           {:text-align              :right})]
   [v/roadmap-item--meta            (merge (:row-component           templates)
                                           {:justify-content         :flex-start})]
   [v/roadmap-item--assignee-title  (merge {:padding               [[0 0 0 (:two units)]]})]
   [v/roadmap-item--assignee        (merge (:column-component        templates)       
                                           (:recycled-paper          templates)
                                           (:border-quotes           templates)
                                           {:margin                [[0 (:full units) (:full units) 0]]
                                            :padding               [[(:full units) (:three units) (:full units) (:full units)]]})]
   [v/roadmap-item--row-container   (merge (:row-component           templates)       
                                           {})]
   [v/roadmap-item--profile-img     (merge {:padding              [[(:sixth units) (:third units) (:sixth units) 0 ]]
                                            :width                  (:two units)
                                            :height                 (:two units)})]
   [v/roadmap-item--activity        (merge (:column-component        templates)
                                           (:recycled-paper          templates)
                                           (:border-quotes           templates)
                                           {:margin                [[0 (:full units) (:full units) 0]]
                                            :padding               [[(:full units) (:three units) (:full units) (:full units)]]})]
   [v/roadmap-item--milestone       (merge (:column-component        templates)  
                                           (:recycled-paper          templates)
                                           (:border-quotes           templates)
                                           {:margin                [[0 (:full units) (:full units) 0]]
                                            :padding               [[(:full units) (:three units) (:full units) (:full units)]]})]
   [v/roadmap-item--labels          (merge (:column-component        templates)
                                           (:recycled-paper          templates)
                                           (:border-quotes           templates)
                                           {:padding               [[(:full units) (:full units) (:full units) (:full units)]]})]
   [v/roadmap-item--labels-container (merge (:row-component          templates)
                                           {:flex-wrap               :wrap})]
   [v/roadmap-item--body            (merge (:row-component           templates)      
                                           {:padding              [[(:full units) 0]]})]
   [v/roadmap-item--title           (merge (:title                   templates))]
   [v/roadmap-item--smalltitle      (merge (:smalltitle              templates)
                                           {:padding               [[0 0 (:sixth units) 0]]})]
   [v/roadmap-item--text            (merge (:text                    templates))]
   [v/roadmap-item--tiny            (merge (:label                   templates))]
  ])