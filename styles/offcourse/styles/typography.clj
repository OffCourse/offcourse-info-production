(ns offcourse.styles.typography
  (:refer-clojure :exclude [+ - * /])
  (:require [garden.stylesheet :refer [at-font-face]]
            [offcourse.styles.vocabulary :as v]))

(defn make-at-font-face [[font-name file-name]]
  (at-font-face {:font-family font-name
                 :font-weight 500
                 :src (str "url('/fonts/" file-name ".woff') " "format('woff')")}))

(defn typography [{:keys [templates fonts]}]
  [(map make-at-font-face    (:raw         fonts))
   [v/t--nitty-normal        {:font-family   (:mono fonts)}]
   [v/t--nitty-bold          {:font-family   (:logo fonts)}]
   [v/t--nitty-grotesk       {:font-family   (:base fonts)}]
   [v/t--nitty-grotesk-bold  {:font-family   (:title fonts)}]
   [v/t--title               (:title          templates)]
   [v/t--subtitle            (:subtitle       templates)]
   [v/t--text                (:text           templates)]
   [v/t--banner              (:banner         templates)]
   [v/t--logo                (:logo           templates)]
   [v/t--form                (:form           templates)]
   [v/t--list                (:list           templates)]
   [v/t--label               (:label          templates)]])