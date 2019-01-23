(ns armstrong-numbers)

(defn exp
  "Quick and easy X ** N"
  [x n]
  (reduce * (repeat n x)))

(defn split-num
  "Split a multi digit number into seperate digits"
  [number]
  (map #(Character/digit % 10) (str number)))

(defn armstrong?
  "Is the given number an Armstrong number?"
  [num]
  (=
    num
    (reduce +
            (map
              (fn [x]
                (exp x (count (str num))))
              (split-num num)))))
