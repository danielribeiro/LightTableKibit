{:+ {
  :editor.clj {"pmeta-i" [(:eval.custom
  "(do (require 'kibit.check)
    (if-let [better (kibit.check/check-expr '__SELECTION__)]
    (with-out-str
      (clojure.pprint/write (:alt better)
        :suppress-namespaces true
        :dispatch clojure.pprint/code-dispatch))
    __SELECTION*__))"
    {:result-type :replace :verbatim true})]}}

 }
