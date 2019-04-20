(ns star-system-bot.core
  (:require [discord.bot :as bot]
            [discord.http :as http])
  (:gen-class))

(defn -main
  [& args]
  (let [bot-name          "Star System Bot"
        prefix            "."
        extension-folders ["src/star_system_bot/extensions"]]
    (bot/from-files bot-name prefix extension-folders)))
