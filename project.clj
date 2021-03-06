(defproject sfi-chaos "0.1.0-SNAPSHOT"
  :description "Code snippets for SFI Chaos MOOC"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.combinatorics "0.0.7"]
                 [incanter/incanter-core "1.5.5-SNAPSHOT"]
                 [incanter/incanter-charts "1.5.5-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}})
