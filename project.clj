(defproject star-system-bot "0.1.0-SNAPSHOT"
  :description "RPG running discord bot"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [discord.clj "1.1.1"]]
  :repl-options {:init-ns star-system-bot.core}
  :main ^:skip-aot star-system-bot.core
  :profiles {:uberjar {:aot :all}})
