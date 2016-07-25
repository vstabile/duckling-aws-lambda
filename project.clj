(defproject parser "0.1.0-SNAPSHOT"
  :description "Duckling Parser"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [wit/duckling "0.4.6"]]
  :java-source-paths ["src/java"]
  :aot :all)
