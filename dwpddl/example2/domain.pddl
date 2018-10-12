(define (domain path)
   (:requirements :action-costs)
   (:predicates
    (node ?n)
		(agent ?a)
    (at ?a ?n ?n)
    (canTravel ?n ?n ?n ?n)

    )

  (:functions
      (travelCost ?n ?n)
      (total-cost)
  )

   (:action move
       :parameters  (?a ?from1 ?from2 ?to1 ?to2)
       :precondition (and  (node ?from1) (node ?from2) (node ?to1) (node ?to2) (agent ?a) (at ?from1 ?from2) (canTravel ?from1 ?from2 ?to1 ?to2))
       :effect (and
         (at  ?a ?to1 ?to2)
		     (not (at ?a ?from1 ?from2))
         (increase (total-cost) (travelCost ?from ?to))
         )
    )
)
