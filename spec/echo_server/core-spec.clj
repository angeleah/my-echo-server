(ns echo_server.core-spec
  (:use [speclj.core] 
		[echo_server.core]))

(describe "it should take the right action based on what is typed to the echo server"
	(it "should return 42 if you ask the meaning of life"
		(should= 42 meaning-of-life))
)

;I don't get how to test this since nothing gets directly passed to echo server.
