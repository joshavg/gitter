(defproject dorfggitter "0.1.0-SNAPSHOT"
  :description "dorfgemeinschaft-gitter.de"
  :url "dorfgemeinschaft-gitter.de"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :plugins [[joshavg/mdsync "0.1.2-SNAPSHOT"]
            [lein-less "1.7.5"]]
  :less {:source-paths ["resources/app/stylesheets"]
         :target-path "resources/page/resources"}
  :repl-options {:init-ns dorfggitter.core})
