(+ 1 x)

(into [] succ)

(->> succ (into []))

(do (->> succ (into [])))

(if-let [succ (+ 1 x)]
     (do (->> succ (into [])))
      nil)

(defn singleton-succ-vec [x]
  (if-let [succ (+ 1 x)]
     (do (->> succ (into [])))
      nil))

