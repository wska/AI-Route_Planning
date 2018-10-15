(define (domain path)
   (:requirements :action-costs)
   (:predicates
    (node ?n) ; Vertices
		(agent ?a) ; Edges
    (at ?a ?n) ; Location n for an agent a
    (canTravel ?n ?n) ; If there exists an edge between two nodes n and n

    )


  (:functions
      ;Function for finding the given cost between two nodes
      (travelCost ?n ?n)
      ;Function for keeping track of the total cost of a path
      (total-cost)
  )

    ;Function for moving between two given nodes, and adds the cost of said path. 
    ;Two move actions, one for a-b and one for b-a(so you do not need to double down on paths)
    
    
   (:action move ;move action for a-b
       :parameters  (?a ?from ?to)
       :precondition (and  (node ?from) (node ?to) (agent ?a) (at ?a ?from) (canTravel ?from ?to) )
          :effect (and
            (at ?a ?to)
            (not (at ?a ?from))
            (increase (total-cost) (travelCost ?from ?to))
            )
  
    )

      (:action move ;move action for b-a
      :parameters  (?a ?from ?to)
      :precondition (and  (node ?from) (node ?to) (agent ?a) (at ?a ?from) (canTravel ?to ?from))
      :effect (and
        (at ?a ?to)
        (not (at ?a ?from))
        (increase (total-cost) (travelCost ?to ?from))
        )
  )
)
