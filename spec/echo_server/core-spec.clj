(ns chat_server.core-spec
  (:use [speclj.core] [chat_server.core]))

(describe "it should take the right action based on what is typed to the echo server"
	(it "should say goodbye if you type quit"
		(should= "goodbye" quit(quit)))
)
