arubaito
==========
A nREPL client shell for your side jobs

### Install
----------
Add the following to the `:dependencies` vector of your `project.clj` file:

[![clojars version](https://clojars.org/arubaito/latest-version.svg?raw=true)]
(https://clojars.org/arubaito)

### Usage
----------
In the REPL:
```clojure
(require '[arubaito.core :refer [nrepl-task nrepl-tasks]])

(def task (nrepl-task :host "kanasubs.com" :port 56975))

(task (+ 1 3)) ;=> [4]
(task (- 1 3)) ;=> [-2]

(nrepl-tasks :host "kanasubs.com" :port 56975)
; or
(nrepl-tasks :port 56975) ; :host defaults to 'kanasubs.com'
; localhost:56975=> (+ 1 2)
;=> [3]
; localhost:56975=>
```

In the comand line:

`lein run 56975` or `lein run kanasubs.com:56975`

### License
----------
Copyright (C) 2015 Carlos C. Fontes.

Licensed under the [Apache License, Version 2.0]("https://www.apache.org/licenses/LICENSE-2.0").
