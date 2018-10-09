import java.util.LinkedList;
import JSHOP2.*;

public class problem
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[10];

		problemConstants[0] = "b1";
		problemConstants[1] = "b2";
		problemConstants[2] = "b7";
		problemConstants[3] = "b3";
		problemConstants[4] = "b4";
		problemConstants[5] = "b10";
		problemConstants[6] = "b5";
		problemConstants[7] = "b6";
		problemConstants[8] = "b8";
		problemConstants[9] = "b9";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(8), TermList.NIL)));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(9), new TermList(TermConstant.getConstant(8), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(9), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(10), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(11), TermList.NIL)));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(12), new TermList(TermConstant.getConstant(11), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(13), new TermList(TermConstant.getConstant(12), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(13), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(14), TermList.NIL)));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(15), new TermList(TermConstant.getConstant(14), TermList.NIL))));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(15), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(16), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(16), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(17), TermList.NIL)));
		s.add(new Predicate(0, 0, new TermList(TermConstant.getConstant(17), TermList.NIL)));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(18);

		Domain d = new oldblocks();

		d.setProblemConstants(defineConstants());

		State s = new State(8, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 0, new TermList(new TermList(new TermList(TermConstant.getConstant(1), new TermList(TermConstant.getConstant(8), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermConstant.getConstant(13), new TermList(TermConstant.getConstant(8), TermList.NIL))), new TermList(new TermList(TermConstant.getConstant(0), new TermList(TermConstant.getConstant(13), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(1), new TermList(TermConstant.getConstant(9), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermConstant.getConstant(11), new TermList(TermConstant.getConstant(9), TermList.NIL))), new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermConstant.getConstant(12), new TermList(TermConstant.getConstant(11), TermList.NIL))), new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermConstant.getConstant(14), new TermList(TermConstant.getConstant(12), TermList.NIL))), new TermList(new TermList(TermConstant.getConstant(0), new TermList(TermConstant.getConstant(14), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(1), new TermList(TermConstant.getConstant(15), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(15), TermList.NIL))), new TermList(new TermList(TermConstant.getConstant(3), new TermList(TermConstant.getConstant(16), new TermList(TermConstant.getConstant(10), TermList.NIL))), new TermList(new TermList(TermConstant.getConstant(0), new TermList(TermConstant.getConstant(16), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(1), new TermList(TermConstant.getConstant(17), TermList.NIL)), new TermList(new TermList(TermConstant.getConstant(0), new TermList(TermConstant.getConstant(17), TermList.NIL)), TermList.NIL)))))))))))))), TermList.NIL)), false, false));

		thread = new SolverThread(tl, 1);
		thread.start();

		try {
			while (thread.isAlive())
				Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		returnedPlans.addAll( thread.getPlans() );

		return returnedPlans;
	}

	public static LinkedList<Predicate> getFirstPlanOps() {
		return getPlans().getFirst().getOps();
	}
}