(define (problem path-x-1)
   (:domain path)
   (:objects node1 node2 node3 node4 node5 node6 node7 
             node8 node9 node10 node11 node12 node13
             node14 node15 node16 node17 node18 node19
             node20 node21 node22 node23
             Agent1 Agent2 Agent3)
   (:init 
          (= (total-cost) 0)  ; Keeps track of the total cost of a path, initializes to 0.

          (agent Agent1)
          (at Agent1 node1)

          (agent Agent2)
          (at Agent2 node14)

          (agent Agent3)
          (at Agent3 node21)
        

          (node node1)
          (node node2)
          (node node3)
          (node node4)
          (node node5)
          (node node6)
          (node node7)
          (node node8)
          (node node9)
          (node node10)
          (node node11)
          (node node12)
          (node node13)
          (node node14)
          (node node15)
          (node node16)
          (node node17)
          (node node18)
          (node node19)
          (node node20)
          (node node21)
          (node node22)
          (node node23)

          (canTravel node1 node6)
          (= (travelCost node1 node6) 1)

          (canTravel node2 node7)
          (= (travelCost node2 node7) 1)

          (canTravel node3 node8)
          (= (travelCost node3 node8) 1)

          (canTravel node4 node9)
          (= (travelCost node4 node9) 1)

          (canTravel node7 node12)
          (= (travelCost node7 node12) 1)

          (canTravel node8 node13)
          (= (travelCost node8 node13) 1)

          (canTravel node9 node14)
          (= (travelCost node9 node14) 1)

          (canTravel node12 node17)
          (= (travelCost node12 node17) 1)

          (canTravel node13 node18)
          (= (travelCost node13 node18) 1)

          (canTravel node16 node21)
          (= (travelCost node16 node21) 1)

          (canTravel node17 node22)
          (= (travelCost node17 node22) 1)

          (canTravel node18 node23)
          (= (travelCost node18 node23) 1)

          (canTravel node4 node5)
          (= (travelCost node4 node5) 1)

          (canTravel node6 node7)
          (= (travelCost node6 node7) 1)
          
          (canTravel node9 node10)
          (= (travelCost node9 node10) 1)

          (canTravel node11 node12)
          (= (travelCost node11 node12) 1)

          (canTravel node12 node13)
          (= (travelCost node12 node13) 1)

          (canTravel node13 node14)
          (= (travelCost node13 node14) 1)

          (canTravel node14 node15)
          (= (travelCost node14 node15) 1)

          (canTravel node16 node17)
          (= (travelCost node16 node17) 1)

          (canTravel node17 node18)
          (= (travelCost node17 node18) 1)

          (canTravel node18 node19)
          (= (travelCost node18 node19) 1)

          (canTravel node19 node20)
          (= (travelCost node19 node20) 1)
          
          )
   (:goal  (and (at Agent1 node20) (at Agent2 node3) (at Agent3 node15) )
                
    ) ; Goal specification for a given agent
   (:metric minimize (total-cost)) ; Tells the solver that this is a minimization problem, aka, try to get the total-cost as low as possible.
   )
