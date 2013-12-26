(defproject servant-demo "0.1.3"
  :description "Demo for servant library"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "0.3.3"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2127"] 
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [servant "0.1.4"]
                 ]
  :cljsbuild
              {:builds
               [{:id "servant-demo"
                 :source-paths ["src/cljs/servant-demo"]
                 :compiler {:optimizations :simple
                            :pretty-print false
                            :output-to "main.js"
                            :source-map "main.js.map"}}]})
