(defproject echo_server "1.0.0-SNAPSHOT"
  :description "echo server in clojure"
  :dependencies [[org.clojure/clojure "1.3.0"]
				[server-socket "1.0.0"]]
  :dev-dependencies [[speclj "2.1.1"]]
  :test-path "spec/"
  :main echo_server.core
)