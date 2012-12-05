(ns echo_server.core-spec
  (:use [speclj.core] 
		[echo_server.core]))

(describe "it should be able to process the message based on what is typed to the echo server"

	(it "should return '42' if you ask the meaning of life"
		(should= "42" (process-message "what is the meaning of life?")))

	(it "should return 'goodbye' if you type quit"
		(should= "goodbye." (process-message "quit")))

	(it "should return back what you typed if the input does not match 'what is the meaning of life' or 'quit'"
		(should= "hello" (process-message "hello")))
)


(describe "it should be able to process a stream"

	(it "should return 'goodbye.' if quit was typed"
		(should= "goodbye.\n"
			(with-out-str (with-in-str "quit" (process-stream)))))
)
