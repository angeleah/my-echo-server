(ns echo_server.core
	(:use server.socket))
(import '[java.io BufferedReader InputStreamReader OutputStreamWriter])

(def port 1234)

(defn echo-server [in out]
	(binding [*in* (BufferedReader. (InputStreamReader. in))
			  *out* (OutputStreamWriter. out)]
		(loop [input (read-line)]
			(println (cond (= "quit" input) "goodbye."
				  (= "what is the meaning of life?" input) "42"
				 :else input))
			(if (not= "quit" input) (recur (read-line))))))

(defn -main []
(create-server port echo-server))
