arubaito
==========
A minimal Clojure nREPL client shell for your side jobs

### Install
----------
Add the following to the `:dependencies` vector of your `project.clj` file:

[![clojars version](https://clojars.org/arubaito/latest-version.svg?raw=true)]
(https://clojars.org/arubaito)

### Usage
----------
In the REPL:
```clojure
user=> (require '[arubaito.core :refer [nrepl-task nrepl-tasks]])

user=> (def task (nrepl-task :host "kanasubs.com" :port 56975))

user=> (task (+ 1 3)) ;=> [4]
user=> (task (- 1 3)) ;=> [-2]

user=> (nrepl-tasks :host "kanasubs.com" :port 56975)
; or
user=> (nrepl-tasks :port 56975) ; :host defaults to 'localhost'
; localhost:56975=> (+ 1 2)
;=> [3]
; localhost:56975=>
```

As a script that runs with `lein-oneoff`:
```clojure
(defdeps [[org.clojure/clojure "1.7.0"] [arubaito "0.1.0"]])

(apply arubaito/-main *command-line-args*)
```

In the comand line:
`lein run 56975` or `lein run kanasubs.com:56975`

### License
----------
Copyright (C) 2015 Carlos C. Fontes.

Licensed under the [Apache License, Version 2.0]("https://www.apache.org/licenses/LICENSE-2.0").
