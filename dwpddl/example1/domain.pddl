(define (domain path)
   (:requirements :action-costs)
   (:predicates
    (node ?n)
		(agent ?a)
    (at ?a ?n)
    (canTravel ?n ?n)

    )

  (:functions
      (travelCost ?n ?n)
      (total-cost)
  )

   (:action move
       :parameters  (?a ?from ?to)
       :precondition (and  (node ?from) (node ?to) (agent ?a) (at ?a ?from) (canTravel ?from ?to))
       :effect (and
         (at ?a ?to)
		     (not (at ?a ?from))
         (increase (total-cost) (travelCost ?from ?to))
         )
    )
)
