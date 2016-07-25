(ns parser-test
  (:require [clojure.test :refer :all]
            [parser :refer :all]))

(deftest a-test
  (testing "Parser handler"
    (is (=
      (parser/-handler
        (aws.Event. "terça"))
      "[{\"dim\":\"time\",\"body\":\"ter\\u00e7a\",\"value\":{\"type\":\"value\",\"value\":\"2016-07-05T00:00:00.000-03:00\",\"grain\":\"day\",\"values\":[{\"type\":\"value\",\"value\":\"2016-07-05T00:00:00.000-03:00\",\"grain\":\"day\"},{\"type\":\"value\",\"value\":\"2016-07-12T00:00:00.000-03:00\",\"grain\":\"day\"},{\"type\":\"value\",\"value\":\"2016-07-19T00:00:00.000-03:00\",\"grain\":\"day\"}]},\"start\":0,\"end\":5}]"))))
