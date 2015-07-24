(ns arubaito.core
  (:require [clojure.string :as str]
            [clojure.tools.nrepl :as nrepl]))

(defn nrepl-task [& {:keys [host port]}]
  (fn [code]
    (with-open [conn (nrepl/connect :bind host :port port)]
      (-> (nrepl/client conn Long/MAX_VALUE)
        (nrepl/message {:op "eval" :code code})
        nrepl/response-values))))

(defn nrepl-tasks [& {:keys [host port]}]
  (let [host (or host "localhost")
        url (str host ":" port)
        task (nrepl-task :host host :port port)]
    (repeatedly
      #(do (print (str url "=> "))
           (flush)
           (->> (read-line) task println)))))

(defn -main [url] 
  (let [[port host] (reverse (str/split url #":"))
        port (Integer. port)]
    (dorun (nrepl-tasks :host host :port port))))
