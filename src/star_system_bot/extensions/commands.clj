(ns star-system-bot.extensions.commands
  (:require [discord.bot :as bot]))

(bot/defcommand test [client message]
  "test command"
  (bot/say (:content message)))
