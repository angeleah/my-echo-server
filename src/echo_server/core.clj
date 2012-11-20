(ns echo_server.core
	(:use server.socket))
(import '[java.io BufferedReader InputStreamReader OutputStreamWriter])

(def port 1234)

(defn echo-server [in out]
	(binding [*in* (BufferedReader. (InputStreamReader. in))
	          *out* (OutputStreamWriter. out)]
		(loop []
			(if (= "quit" read-line)
				(do (close-server echo-server)))
			(recur))))

(defn -main []
	(create-server port echo-server))
