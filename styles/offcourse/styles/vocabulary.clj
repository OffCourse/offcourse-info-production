;;;; Naming Schema ;;;;
;
; General wisdom:
; 1. Less code is usually better code: only create an abstraction if it removes code.
; 2. Name things in a meaningful manner so that comments would state the obvious.
;
; Modular rules:
; 1. Use flat specificity as much as possible (single class selectors) and limit cascade usage to component.
; 2. Use layout and grid styles to do all major positioning: Components are always full width.
; 3. Use Clojure templates and units to decouple markup and design pattern.
; 4. Use helpers to prevent the excessive creation of container classes, but generally avoid them.
;
; Naming rules:
; 1. The single dash is used to seperate words
; 2. The double dash is used to distinguish component elements
; 3. The data attributes are used to distinguish component variations and state
; 
;;;;;;;;;;;;;;;;;;;;;;;


(ns offcourse.styles.vocabulary
  (:refer-clojure :exclude [first second last list])
  (:require [garden.selectors :as s]))

; Layout
(s/defclass layout)
(s/defclass layout--section)

(s/defclass grid)
(s/defclass grid--section)

(s/defclass subgrid)
(def subgrid-two          (subgrid (s/attr :data-subgrid-columns := "2")))
(def subgrid-three        (subgrid (s/attr :data-subgrid-columns := "3")))

(s/defclass container)
(def container-column     (container (s/attr :data-container-type := :column)))
(def container-fw         (container (s/attr :data-container-type := :fw)))
(def container-wrap       (container (s/attr :data-container-type := :wrap)))
(def container-subgrid    (container (s/attr :data-container-type := :subgrid))) ; Needed due to broken column break

; Helpers
(s/defclass padding-b-third)
(s/defclass padding-b-half)
(s/defclass padding-t-twothird)
(s/defclass padding-b-twothird)
(s/defclass padding-tb-twothird)
(s/defclass padding-t-one)
(s/defclass padding-b-one)
(s/defclass padding-tb-one)
(s/defclass padding-trbl-one)
(s/defclass padding-t-two-b-one)
(s/defclass padding-t-two)
(s/defclass padding-b-two)
(s/defclass padding-tb-two)
(s/defclass padding-tb-four)

; Typography
(s/defclass t--nitty-normal)
(s/defclass t--nitty-bold)
(s/defclass t--nitty-grotesk)
(s/defclass t--nitty-grotesk-bold)
(s/defclass t--title)
(s/defclass t--subtitle)
(s/defclass t--text)
(s/defclass t--banner)
(s/defclass t--logo)
(s/defclass t--form)
(s/defclass t--list)
(s/defclass t--label)

; Colors
(s/defclass c--night)
(s/defclass c--dark)
(s/defclass c--medium)
(s/defclass c--light)
(s/defclass c--very-light)
(s/defclass c--day)
(s/defclass c--primary)

(s/defclass c--highlighted)
(s/defclass c--selected)
(s/defclass c--negative)
(s/defclass c--paper)
(s/defclass c--recycled-paper)
(s/defclass c--smudged-paper)
(s/defclass c--darkend-paper)

; Components
(s/defclass header)

(s/defclass markdown) ; Class with child selectors for markup that isn't classed 

(s/defclass logo)
(def logo-large           (logo (s/attr :data-logo-size := :large)))
(def logo-inverse         (logo (s/attr :data-logo-inverse := :true)))
(def logo-padded          (logo (s/attr :data-logo-padded := :true)))

(s/defclass form--input)
(s/defclass form--subscribe)
(s/defclass form--success)
(s/defclass form--error)
(def and--form--error (s/& (form--error))) ; Flat specificity requires non-trivial changes in mailchimp form

(s/defclass code)
(s/defclass code-pre)

(s/defclass image)
(def image-size-10        (image (s/attr :data-image-size           := "10")))
(def image-filter         (image (s/attr :data-image-filter         := :true)))
(def image-filter-recolor (image (s/attr :data-image-filter-recolor := :true)))

(s/defclass sheet)
(s/defclass sheet--section)
(def sheet--section-collapsable      (sheet--section (s/attr :data-collapsable := :true)))
(s/defclass sheet--title)
(s/defclass sheet--subtitle)
(s/defclass sheet--text)

(s/defclass business-card)
(s/defclass business-card--section)

(s/defclass roadmap-item)
(s/defclass roadmap-item--collapsable)
(s/defclass roadmap-item--header)
(s/defclass roadmap-item--issue-number)
(s/defclass roadmap-item--meta)
(s/defclass roadmap-item--row-container)
(s/defclass roadmap-item--assignee-title)
(s/defclass roadmap-item--assignee)
(s/defclass roadmap-item--profile-img)
(s/defclass roadmap-item--milestone)
(s/defclass roadmap-item--activity)
(s/defclass roadmap-item--labels)
(s/defclass roadmap-item--labels-container)
(s/defclass roadmap-item--body)
(s/defclass roadmap-item--title)
(s/defclass roadmap-item--smalltitle)
(s/defclass roadmap-item--text)
(s/defclass roadmap-item--tiny)

(s/defclass viewer)
(s/defclass viewer--content)
(def viewer-headers      [:h1 :h2 :h3 :h4 :h5 :h6])
(def viewer-header-1      :h1)
(def viewer-header-2      :h2)
(def viewer-header-3      :h3)
(def viewer-header-4      :h4)
(def viewer-header-5      :h5)
(def viewer-header-6      :h6)
(def viewer-text          :p)
(def viewer-anchor        :a)
(def viewer-strong        :strong)
(def viewer-em            :em)
(def viewer-hr            :hr)
(def viewer-ul            :ul)
(def viewer-ol            :ol)
(def viewer-li            :li)
(def viewer-image         :img)
(def viewer-figcaption    :figcaption)
(def viewer-blockquote    :blockquote)
(def viewer-pre           :pre)
(def viewer-code          :code)
(def viewer-fieldset      :fieldset)
(def viewer-legend        :legend)
(def viewer-input         :input)
(def viewer-textarea      :textarea)
(def viewer-select        :select)

; OL UL LI STRONG EM 

(s/defclass footer)

(s/defclass button)
(def button-smudged        (button (s/attr :data-button-type := :smudged)))
(def button-sheet          (button (s/attr :data-button-type := :sheet)))

(s/defclass list)
(s/defclass list--item)

(s/defclass label)
(def label-smudged  (label (s/attr :data-label-type := :smudged)))

;; MODIFIERS
(s/defpseudoclass hover)
(s/defpseudoclass disabled)
(s/defpseudoclass first-child)
(s/defpseudoclass last-child)

(def selected (s/& (s/attr :data-selected := :true)))
(def disabled (s/& disabled))
(def hovered (s/& hover))
(def first (s/& first-child))
(def second (s/& (s/nth-child 2)))
(def third (s/& (s/nth-child 3)))
(def last (s/& last-child))
