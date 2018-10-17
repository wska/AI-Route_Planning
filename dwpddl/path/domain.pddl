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
   (location ?n)         ; vertices/locations
   (agent ?a)        ; agents
   (at ?a ?n)        ; agent 'a' at location 'n'
   (can_move ?n ?n) ; if there exists an edge between two locations
  )


  (:functions
    ; Find the given cost between two locations
    (cost ?n ?n)

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
      (location ?from)
      (location ?to)
      (agent ?a)
      (at ?a ?from)
      (can_move ?from ?to)
    )

    :effect (and
      (at ?a ?to)
      (not (at ?a ?from))
      (increase (total-cost) (cost ?from ?to))
    )
  )


  (:action move ; move action for b-a
   ;; Moves an agent from location 'from' to location 'to' and adds the cost of
   ;; the action to the total cost.
  :parameters  (?a ?from ?to)
  :precondition (and
    (location ?from)
    (location ?to)
    (agent ?a)
    (at ?a ?from)
    (can_move ?to ?from)
  )
  :effect (and
    (at ?a ?to)
    (not (at ?a ?from))
    (increase (total-cost) (cost ?to ?from))
    )
  )
)
