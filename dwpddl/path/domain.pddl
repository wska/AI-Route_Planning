;;;; AI project: multi-agent routeplanning domain definition in PDDL using the
;;;; Fast-downward solver

;;;; Authors:
;;;; - Adrian Chmielewski-Anders
;;;; - Alex Mellado
;;;; - Daniel Skantz
;;;; - William Skägerstrom
;;;; - Bas Straathof



(define (domain path)
  (:requirements :action-costs)
  (:predicates
   (node ?n)         ; Vertices/locations
   (agent ?a)        ; Agents
   (at ?a ?n)        ; Agent 'a' at location 'n'
   (canTravel ?n ?n) ; If there exists an edge between two nodes
  )


  (:functions
    ; Find the given cost between two nodes
    (travelCost ?n ?n)

    ; Keep track of the total cost of a path
    (total-cost)
  )


  ;; Two move actions are necessary for Fast-downward to find a solution
  ;; a move action for a-b and a move action for b-a
  (:action move ; move action for a-b
    ;; Moves an agent from location 'from' to location 'to' and adds the cost of
    ;; the action to the total cost.
    :parameters  (?a ?from ?to)
    :precondition (and
      (node ?from)
      (node ?to)
      (agent ?a)
      (at ?a ?from)
      (canTravel ?from ?to)
    )

    :effect (and
      (at ?a ?to)
      (not (at ?a ?from))
      (increase (total-cost) (travelCost ?from ?to))
    )
  )


  (:action move ; move action for b-a
   ;; Moves an agent from location 'from' to location 'to' and adds the cost of
   ;; the action to the total cost.
  :parameters  (?a ?from ?to)
  :precondition (and
    (node ?from)
    (node ?to)
    (agent ?a)
    (at ?a ?from)
    (canTravel ?to ?from)
  )
  :effect (and
    (at ?a ?to)
    (not (at ?a ?from))
    (increase (total-cost) (travelCost ?to ?from))
    )
  )
)
