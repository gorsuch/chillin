(ns chillin.views.welcome
  (:require [chillin.views.common :as common])
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpage "/" []
         (common/layout
           [:p "Welcome to chillin"]))
