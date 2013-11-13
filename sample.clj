(+ 1 x)

(into [] succ)

(do (into [] succ))

(if-let [succ (+ 1 x)]
     (do (into [] succ))
      nil)

(defn singleton-succ-vec [x]
  (if-let [succ (+ 1 x)]
     (do (into [] succ))
      nil))

