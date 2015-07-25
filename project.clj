(defproject arubaito "0.1.0"

  :description "A minimal Clojure nREPL client shell for your side jobs"

  :url "https://github.com/kanasubs/arubaito"

  :scm {:name "git"
        :url "https://github.com/kanasubs/arubaito"}

  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}

  :main arubaito.core

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.nrepl "0.2.10"]]

  :repl-options {:init-ns arubaito.core})
