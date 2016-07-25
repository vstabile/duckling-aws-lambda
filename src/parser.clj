(ns parser
  (:gen-class
      :methods [^:static [handler [aws.Event] String]])
  (:require [duckling.core :as p]
            [clojure.data.json :as json]))

(def loaded (atom false))

(defn load-languages []
  (p/load! {:languages ["pt"]})
  (reset! loaded true))

(defn -handler [event]
  (if (not @loaded) (load-languages))
  (json/write-str (p/parse :pt$core (.getQ event) [:time :number])))
