(ns chat_server.core
	(:use server.socket))
(import '[java.io BufferedReader InputStreamReader OutputStreamWriter])

(def port 1234)

(defn echo-server [in out]
	(binding [*in* (BufferedReader. (InputStreamReader. in))
	          *out* (OutputStreamWriter. out)]
		(loop []
			(println (read-line))
			(recur))))

(defn -main []
	(create-server port echo-server))

; This was Cymen's version that I used as a jumping off point.
;(ns chat_server.core
;	(:use server.socket))
;(import '[java.io BufferedReader InputStreamReader OutputStreamWriter])

;(defn echo-server []
;  (letfn [(echo [in out] (binding [*in* (BufferedReader. (InputStreamReader. in))
;                              *out* (OutputStreamWriter. out)]
;                      (loop []
;                        (let [input (read-line)]
;                          (print input)
;                          (flush))
;                        (recur))))]
;    (create-server 8080 echo)))

;(defn -main [] 
;  (echo-server)))

