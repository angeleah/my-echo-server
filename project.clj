(defproject echo_server "1.0.0-SNAPSHOT"
  :description "echo server in clojure"
  :dependencies [[org.clojure/clojure "1.5.1"]
              [server-socket "1.0.0"]]
  :profiles {:dev {:dependencies [[speclj "2.9.1"]]}}
  :plugins [[speclj "2.9.1"]]
  :test-paths ["spec"]
  :main echo_server.core
)
