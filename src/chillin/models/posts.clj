(ns chillin.models.posts
	(:require [clj-couchdb.core :as couch]))

(def base "https://gorsuch.cloudant.com")

(def db "blog")

(defn now [] (System/currentTimeMillis))

(defn create [title body]
	(couch/insert base db {:time (now) :title title :body body}))