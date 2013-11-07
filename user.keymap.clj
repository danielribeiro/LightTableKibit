{:+ {
     :editor.clj {"pmeta-i" [(:eval.custom "(do (require 'kibit.check)
                                           (if-let [better (kibit.check/check-expr '__SELECTION__)] 
                                             (:alt better)
                                             '__SELECTION__
                                           ))"
                                           {:result-type :replace})]}

     }

 }
