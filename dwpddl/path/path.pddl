;;;; AI project: multi-agent routeplanning problem definition in PDDL using the
;;;; Fast-downward solver

;;;; Authors:
;;;; - Adrian Chmielewski-Anders
;;;; - Alex Mellado
;;;; - Daniel Skantz
;;;; - William Skägerstrom
;;;; - Bas Straathof


(define (problem path-x-1)
  (:domain path)
  (:objects LOC1 LOC2 LOC3 LOC4 LOC5 LOC6 LOC7
            LOC8 LOC9 LOC10 LOC11 LOC12 LOC13
            LOC14 LOC15 LOC16 LOC17 LOC18 LOC19
            LOC20 LOC21 LOC22 LOC23
            AGENT1 AGENT2 AGENT3)

  (:init
    (= (total-cost) 0)  ; Keeps track of the total cost of a path, initialized to 0

    ;; AGENTS
    (AGENT AGENT1)
    (AGENT AGENT2)

    ;; NODES/LOCATIONS
    (LOCATION LOC1)
    (LOCATION LOC2)
    (LOCATION LOC3)
    (LOCATION LOC4)
    (LOCATION LOC5)
    (LOCATION LOC6)
    (LOCATION LOC7)
    (LOCATION LOC8)
    (LOCATION LOC9)
    (LOCATION LOC10)
    (LOCATION LOC11)
    (LOCATION LOC12)
    (LOCATION LOC13)
    (LOCATION LOC14)
    (LOCATION LOC15)
    (LOCATION LOC16)
    (LOCATION LOC17)
    (LOCATION LOC18)
    (LOCATION LOC19)
    (LOCATION LOC20)
    (LOCATION LOC21)
    (LOCATION LOC22)
    (LOCATION LOC23)

    ;; defining initial locations of agents
    (at AGENT1 LOC6)
    (at AGENT2 LOC2)

    ;; defining valid moves corresponding to the edge-list
    (CAN_MOVE LOC1 LOC6)
    (CAN_MOVE LOC3 LOC8)
    (CAN_MOVE LOC4 LOC9)
    (CAN_MOVE LOC7 LOC12)
    (CAN_MOVE LOC2 LOC7)
    (CAN_MOVE LOC8 LOC13)
    (CAN_MOVE LOC9 LOC14)
    (CAN_MOVE LOC12 LOC17)
    (CAN_MOVE LOC13 LOC18)
    (CAN_MOVE LOC16 LOC21)
    (CAN_MOVE LOC17 LOC22)
    (CAN_MOVE LOC18 LOC23)
    (CAN_MOVE LOC4 LOC5)
    (CAN_MOVE LOC6 LOC7)
    (CAN_MOVE LOC9 LOC10)
    (CAN_MOVE LOC11 LOC12)
    (CAN_MOVE LOC12 LOC13)
    (CAN_MOVE LOC13 LOC14)
    (CAN_MOVE LOC14 LOC15)
    (CAN_MOVE LOC16 LOC17)
    (CAN_MOVE LOC17 LOC18)
    (CAN_MOVE LOC18 LOC19)
    (CAN_MOVE LOC19 LOC20)


    ;; set all travel costs to 1
    (= (COST LOC1 LOC6) 1)
    (= (COST LOC2 LOC7) 1)
    (= (COST LOC3 LOC8) 1)
    (= (COST LOC4 LOC9) 1)
    (= (COST LOC7 LOC12) 1)
    (= (COST LOC8 LOC13) 1)
    (= (COST LOC9 LOC14) 1)
    (= (COST LOC12 LOC17) 1)
    (= (COST LOC13 LOC18) 1)
    (= (COST LOC16 LOC21) 1)
    (= (COST LOC17 LOC22) 1)
    (= (COST LOC18 LOC23) 1)
    (= (COST LOC4 LOC5) 1)
    (= (COST LOC6 LOC7) 1)
    (= (COST LOC9 LOC10) 1)
    (= (COST LOC11 LOC12) 1)
    (= (COST LOC12 LOC13) 1)
    (= (COST LOC13 LOC14) 1)
    (= (COST LOC14 LOC15) 1)
    (= (COST LOC16 LOC17) 1)
    (= (COST LOC17 LOC18) 1)
    (= (COST LOC18 LOC19) 1)
    (= (COST LOC19 LOC20) 1)
  )

  ;; defining the goal
  (:goal (and
    (at AGENT1 LOC8)
    (at AGENT2 LOC14)
    )
  )

  ; tell the solver that this is a minimization problem
  ; i.e. try to make the total cost as low as possible
  (:metric minimize (total-cost))
)
