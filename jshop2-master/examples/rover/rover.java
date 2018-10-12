import JSHOP2.*;

class Precondition0 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition0(Term[] unifier)
	{
		p = new Precondition[3];
		p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(1, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[3][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[2] == null)
		{
			boolean b1changed = false;
			while (b[1] == null)
			{
				b[1] = p[1].nextBinding();
				if (b[1] == null)
					return null;
				b1changed = true;
			}
			if ( b1changed ) {
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
			}
			b[2] = p[2].nextBinding();
			if (b[2] == null) b[1] = null;
		}

		Term[] retVal = Term.merge(b, 3);
		b[2] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		b[1] = null;
		b[2] = null;
	}
}

class Operator0 extends Operator
{
	public Operator0()
	{
		super(new Predicate(0, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(5.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition0(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition1 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition1(Term[] unifier)
	{
		p = new Precondition[7];
		p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier);
		p[5] = new PreconditionAtomic(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		b = new Term[7][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[6] == null)
		{
			boolean b5changed = false;
			while (b[5] == null)
			{
				boolean b4changed = false;
				while (b[4] == null)
				{
					boolean b3changed = false;
					while (b[3] == null)
					{
						boolean b2changed = false;
						while (b[2] == null)
						{
							boolean b1changed = false;
							while (b[1] == null)
							{
								b[1] = p[1].nextBinding();
								if (b[1] == null)
									return null;
								b1changed = true;
							}
							if ( b1changed ) {
								p[2].reset();
								p[2].bind(Term.merge(b, 2));
							}
							b[2] = p[2].nextBinding();
							if (b[2] == null) b[1] = null;
							b2changed = true;
						}
						if ( b2changed ) {
							p[3].reset();
							p[3].bind(Term.merge(b, 3));
						}
						b[3] = p[3].nextBinding();
						if (b[3] == null) b[2] = null;
						b3changed = true;
					}
					if ( b3changed ) {
						p[4].reset();
						p[4].bind(Term.merge(b, 4));
					}
					b[4] = p[4].nextBinding();
					if (b[4] == null) b[3] = null;
					b4changed = true;
				}
				if ( b4changed ) {
					p[5].reset();
					p[5].bind(Term.merge(b, 5));
				}
				b[5] = p[5].nextBinding();
				if (b[5] == null) b[4] = null;
				b5changed = true;
			}
			if ( b5changed ) {
				p[6].reset();
				p[6].bind(Term.merge(b, 6));
			}
			b[6] = p[6].nextBinding();
			if (b[6] == null) b[5] = null;
		}

		Term[] retVal = Term.merge(b, 7);
		b[6] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
	}
}

class Operator1 extends Operator
{
	public Operator1()
	{
		super(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition1(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition2 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition2(Term[] unifier)
	{
		p = new Precondition[9];
		p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(5, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[5] = new PreconditionAtomic(new Predicate(6, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(7, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[7] = new PreconditionAtomic(new Predicate(8, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(9, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[9][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[8] == null)
		{
			boolean b7changed = false;
			while (b[7] == null)
			{
				boolean b6changed = false;
				while (b[6] == null)
				{
					boolean b5changed = false;
					while (b[5] == null)
					{
						boolean b4changed = false;
						while (b[4] == null)
						{
							boolean b3changed = false;
							while (b[3] == null)
							{
								boolean b2changed = false;
								while (b[2] == null)
								{
									boolean b1changed = false;
									while (b[1] == null)
									{
										b[1] = p[1].nextBinding();
										if (b[1] == null)
											return null;
										b1changed = true;
									}
									if ( b1changed ) {
										p[2].reset();
										p[2].bind(Term.merge(b, 2));
									}
									b[2] = p[2].nextBinding();
									if (b[2] == null) b[1] = null;
									b2changed = true;
								}
								if ( b2changed ) {
									p[3].reset();
									p[3].bind(Term.merge(b, 3));
								}
								b[3] = p[3].nextBinding();
								if (b[3] == null) b[2] = null;
								b3changed = true;
							}
							if ( b3changed ) {
								p[4].reset();
								p[4].bind(Term.merge(b, 4));
							}
							b[4] = p[4].nextBinding();
							if (b[4] == null) b[3] = null;
							b4changed = true;
						}
						if ( b4changed ) {
							p[5].reset();
							p[5].bind(Term.merge(b, 5));
						}
						b[5] = p[5].nextBinding();
						if (b[5] == null) b[4] = null;
						b5changed = true;
					}
					if ( b5changed ) {
						p[6].reset();
						p[6].bind(Term.merge(b, 6));
					}
					b[6] = p[6].nextBinding();
					if (b[6] == null) b[5] = null;
					b6changed = true;
				}
				if ( b6changed ) {
					p[7].reset();
					p[7].bind(Term.merge(b, 7));
				}
				b[7] = p[7].nextBinding();
				if (b[7] == null) b[6] = null;
				b7changed = true;
			}
			if ( b7changed ) {
				p[8].reset();
				p[8].bind(Term.merge(b, 8));
			}
			b[8] = p[8].nextBinding();
			if (b[8] == null) b[7] = null;
		}

		Term[] retVal = Term.merge(b, 9);
		b[8] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
	}
}

class Operator2 extends Operator
{
	public Operator2()
	{
		super(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(9, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)));
		delIn[1] = new DelAddAtomic(new Predicate(6, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(10, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)));
		addIn[1] = new DelAddAtomic(new Predicate(11, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition2(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition3 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition3(Term[] unifier)
	{
		p = new Precondition[9];
		p[1] = new PreconditionAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(5, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[5] = new PreconditionAtomic(new Predicate(12, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(13, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[7] = new PreconditionAtomic(new Predicate(8, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(9, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[9][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[8] == null)
		{
			boolean b7changed = false;
			while (b[7] == null)
			{
				boolean b6changed = false;
				while (b[6] == null)
				{
					boolean b5changed = false;
					while (b[5] == null)
					{
						boolean b4changed = false;
						while (b[4] == null)
						{
							boolean b3changed = false;
							while (b[3] == null)
							{
								boolean b2changed = false;
								while (b[2] == null)
								{
									boolean b1changed = false;
									while (b[1] == null)
									{
										b[1] = p[1].nextBinding();
										if (b[1] == null)
											return null;
										b1changed = true;
									}
									if ( b1changed ) {
										p[2].reset();
										p[2].bind(Term.merge(b, 2));
									}
									b[2] = p[2].nextBinding();
									if (b[2] == null) b[1] = null;
									b2changed = true;
								}
								if ( b2changed ) {
									p[3].reset();
									p[3].bind(Term.merge(b, 3));
								}
								b[3] = p[3].nextBinding();
								if (b[3] == null) b[2] = null;
								b3changed = true;
							}
							if ( b3changed ) {
								p[4].reset();
								p[4].bind(Term.merge(b, 4));
							}
							b[4] = p[4].nextBinding();
							if (b[4] == null) b[3] = null;
							b4changed = true;
						}
						if ( b4changed ) {
							p[5].reset();
							p[5].bind(Term.merge(b, 5));
						}
						b[5] = p[5].nextBinding();
						if (b[5] == null) b[4] = null;
						b5changed = true;
					}
					if ( b5changed ) {
						p[6].reset();
						p[6].bind(Term.merge(b, 6));
					}
					b[6] = p[6].nextBinding();
					if (b[6] == null) b[5] = null;
					b6changed = true;
				}
				if ( b6changed ) {
					p[7].reset();
					p[7].bind(Term.merge(b, 7));
				}
				b[7] = p[7].nextBinding();
				if (b[7] == null) b[6] = null;
				b7changed = true;
			}
			if ( b7changed ) {
				p[8].reset();
				p[8].bind(Term.merge(b, 8));
			}
			b[8] = p[8].nextBinding();
			if (b[8] == null) b[7] = null;
		}

		Term[] retVal = Term.merge(b, 9);
		b[8] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
	}
}

class Operator3 extends Operator
{
	public Operator3()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(9, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)));
		delIn[1] = new DelAddAtomic(new Predicate(12, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(10, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)));
		addIn[1] = new DelAddAtomic(new Predicate(14, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition3(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition4 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition4(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(0, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(5, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(8, 2, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(10, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Operator4 extends Operator
{
	public Operator4()
	{
		super(new Predicate(4, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(10, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(9, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition4(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition5 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition5(Term[] unifier)
	{
		p = new Precondition[10];
		p[1] = new PreconditionAtomic(new Predicate(0, 4, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(15, 4, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(16, 4, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		p[5] = new PreconditionAtomic(new Predicate(17, 4, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(18, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[7] = new PreconditionAtomic(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(19, 4, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[9] = new PreconditionAtomic(new Predicate(20, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		b = new Term[10][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[9] == null)
		{
			boolean b8changed = false;
			while (b[8] == null)
			{
				boolean b7changed = false;
				while (b[7] == null)
				{
					boolean b6changed = false;
					while (b[6] == null)
					{
						boolean b5changed = false;
						while (b[5] == null)
						{
							boolean b4changed = false;
							while (b[4] == null)
							{
								boolean b3changed = false;
								while (b[3] == null)
								{
									boolean b2changed = false;
									while (b[2] == null)
									{
										boolean b1changed = false;
										while (b[1] == null)
										{
											b[1] = p[1].nextBinding();
											if (b[1] == null)
												return null;
											b1changed = true;
										}
										if ( b1changed ) {
											p[2].reset();
											p[2].bind(Term.merge(b, 2));
										}
										b[2] = p[2].nextBinding();
										if (b[2] == null) b[1] = null;
										b2changed = true;
									}
									if ( b2changed ) {
										p[3].reset();
										p[3].bind(Term.merge(b, 3));
									}
									b[3] = p[3].nextBinding();
									if (b[3] == null) b[2] = null;
									b3changed = true;
								}
								if ( b3changed ) {
									p[4].reset();
									p[4].bind(Term.merge(b, 4));
								}
								b[4] = p[4].nextBinding();
								if (b[4] == null) b[3] = null;
								b4changed = true;
							}
							if ( b4changed ) {
								p[5].reset();
								p[5].bind(Term.merge(b, 5));
							}
							b[5] = p[5].nextBinding();
							if (b[5] == null) b[4] = null;
							b5changed = true;
						}
						if ( b5changed ) {
							p[6].reset();
							p[6].bind(Term.merge(b, 6));
						}
						b[6] = p[6].nextBinding();
						if (b[6] == null) b[5] = null;
						b6changed = true;
					}
					if ( b6changed ) {
						p[7].reset();
						p[7].bind(Term.merge(b, 7));
					}
					b[7] = p[7].nextBinding();
					if (b[7] == null) b[6] = null;
					b7changed = true;
				}
				if ( b7changed ) {
					p[8].reset();
					p[8].bind(Term.merge(b, 8));
				}
				b[8] = p[8].nextBinding();
				if (b[8] == null) b[7] = null;
				b8changed = true;
			}
			if ( b8changed ) {
				p[9].reset();
				p[9].bind(Term.merge(b, 9));
			}
			b[9] = p[9].nextBinding();
			if (b[9] == null) b[8] = null;
		}

		Term[] retVal = Term.merge(b, 10);
		b[9] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		p[9].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
	}
}

class Operator5 extends Operator
{
	public Operator5()
	{
		super(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(21, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition5(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition6 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition6(Term[] unifier)
	{
		p = new Precondition[12];
		p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(1, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(16, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(15, 5, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		p[5] = new PreconditionAtomic(new Predicate(22, 5, new TermList(TermVariable.getVariable(4), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(21, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[7] = new PreconditionAtomic(new Predicate(20, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(17, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[9] = new PreconditionAtomic(new Predicate(23, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[10] = new PreconditionAtomic(new Predicate(19, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[11] = new PreconditionAtomic(new Predicate(4, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		b = new Term[12][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[11] == null)
		{
			boolean b10changed = false;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding();
													if (b[1] == null)
														return null;
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset();
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding();
												if (b[2] == null) b[1] = null;
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset();
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding();
											if (b[3] == null) b[2] = null;
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset();
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding();
										if (b[4] == null) b[3] = null;
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset();
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding();
									if (b[5] == null) b[4] = null;
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset();
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding();
								if (b[6] == null) b[5] = null;
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset();
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding();
							if (b[7] == null) b[6] = null;
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset();
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding();
						if (b[8] == null) b[7] = null;
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset();
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding();
					if (b[9] == null) b[8] = null;
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset();
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding();
				if (b[10] == null) b[9] = null;
				b10changed = true;
			}
			if ( b10changed ) {
				p[11].reset();
				p[11].bind(Term.merge(b, 11));
			}
			b[11] = p[11].nextBinding();
			if (b[11] == null) b[10] = null;
		}

		Term[] retVal = Term.merge(b, 12);
		b[11] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		p[9].reset();
		p[10].reset();
		p[11].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
	}
}

class Operator6 extends Operator
{
	public Operator6()
	{
		super(new Predicate(6, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL)))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(21, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(24, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(4), TermList.NIL)))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition6(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition7 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition7(Term[] unifier)
	{
		p = new Precondition[12];
		p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(25, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(1, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(1, 5, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		p[5] = new PreconditionAtomic(new Predicate(1, 5, new TermList(TermVariable.getVariable(4), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(4, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[7] = new PreconditionAtomic(new Predicate(26, 5, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(11, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[9] = new PreconditionAtomic(new Predicate(27, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[10] = new PreconditionAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[11] = new PreconditionAtomic(new Predicate(28, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[12][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[11] == null)
		{
			boolean b10changed = false;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding();
													if (b[1] == null)
														return null;
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset();
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding();
												if (b[2] == null) b[1] = null;
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset();
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding();
											if (b[3] == null) b[2] = null;
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset();
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding();
										if (b[4] == null) b[3] = null;
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset();
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding();
									if (b[5] == null) b[4] = null;
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset();
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding();
								if (b[6] == null) b[5] = null;
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset();
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding();
							if (b[7] == null) b[6] = null;
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset();
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding();
						if (b[8] == null) b[7] = null;
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset();
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding();
					if (b[9] == null) b[8] = null;
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset();
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding();
				if (b[10] == null) b[9] = null;
				b10changed = true;
			}
			if ( b10changed ) {
				p[11].reset();
				p[11].bind(Term.merge(b, 11));
			}
			b[11] = p[11].nextBinding();
			if (b[11] == null) b[10] = null;
		}

		Term[] retVal = Term.merge(b, 12);
		b[11] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		p[9].reset();
		p[10].reset();
		p[11].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
	}
}

class Operator7 extends Operator
{
	public Operator7()
	{
		super(new Predicate(7, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL)))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		delIn[1] = new DelAddAtomic(new Predicate(28, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[3];
		addIn[0] = new DelAddAtomic(new Predicate(28, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)));
		addIn[1] = new DelAddAtomic(new Predicate(29, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)));
		addIn[2] = new DelAddAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition7(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition8 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition8(Term[] unifier)
	{
		p = new Precondition[12];
		p[1] = new PreconditionAtomic(new Predicate(0, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(25, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(1, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(1, 5, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		p[5] = new PreconditionAtomic(new Predicate(1, 5, new TermList(TermVariable.getVariable(4), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(4, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[7] = new PreconditionAtomic(new Predicate(26, 5, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(14, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[9] = new PreconditionAtomic(new Predicate(27, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[10] = new PreconditionAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[11] = new PreconditionAtomic(new Predicate(28, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[12][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[11] == null)
		{
			boolean b10changed = false;
			while (b[10] == null)
			{
				boolean b9changed = false;
				while (b[9] == null)
				{
					boolean b8changed = false;
					while (b[8] == null)
					{
						boolean b7changed = false;
						while (b[7] == null)
						{
							boolean b6changed = false;
							while (b[6] == null)
							{
								boolean b5changed = false;
								while (b[5] == null)
								{
									boolean b4changed = false;
									while (b[4] == null)
									{
										boolean b3changed = false;
										while (b[3] == null)
										{
											boolean b2changed = false;
											while (b[2] == null)
											{
												boolean b1changed = false;
												while (b[1] == null)
												{
													b[1] = p[1].nextBinding();
													if (b[1] == null)
														return null;
													b1changed = true;
												}
												if ( b1changed ) {
													p[2].reset();
													p[2].bind(Term.merge(b, 2));
												}
												b[2] = p[2].nextBinding();
												if (b[2] == null) b[1] = null;
												b2changed = true;
											}
											if ( b2changed ) {
												p[3].reset();
												p[3].bind(Term.merge(b, 3));
											}
											b[3] = p[3].nextBinding();
											if (b[3] == null) b[2] = null;
											b3changed = true;
										}
										if ( b3changed ) {
											p[4].reset();
											p[4].bind(Term.merge(b, 4));
										}
										b[4] = p[4].nextBinding();
										if (b[4] == null) b[3] = null;
										b4changed = true;
									}
									if ( b4changed ) {
										p[5].reset();
										p[5].bind(Term.merge(b, 5));
									}
									b[5] = p[5].nextBinding();
									if (b[5] == null) b[4] = null;
									b5changed = true;
								}
								if ( b5changed ) {
									p[6].reset();
									p[6].bind(Term.merge(b, 6));
								}
								b[6] = p[6].nextBinding();
								if (b[6] == null) b[5] = null;
								b6changed = true;
							}
							if ( b6changed ) {
								p[7].reset();
								p[7].bind(Term.merge(b, 7));
							}
							b[7] = p[7].nextBinding();
							if (b[7] == null) b[6] = null;
							b7changed = true;
						}
						if ( b7changed ) {
							p[8].reset();
							p[8].bind(Term.merge(b, 8));
						}
						b[8] = p[8].nextBinding();
						if (b[8] == null) b[7] = null;
						b8changed = true;
					}
					if ( b8changed ) {
						p[9].reset();
						p[9].bind(Term.merge(b, 9));
					}
					b[9] = p[9].nextBinding();
					if (b[9] == null) b[8] = null;
					b9changed = true;
				}
				if ( b9changed ) {
					p[10].reset();
					p[10].bind(Term.merge(b, 10));
				}
				b[10] = p[10].nextBinding();
				if (b[10] == null) b[9] = null;
				b10changed = true;
			}
			if ( b10changed ) {
				p[11].reset();
				p[11].bind(Term.merge(b, 11));
			}
			b[11] = p[11].nextBinding();
			if (b[11] == null) b[10] = null;
		}

		Term[] retVal = Term.merge(b, 12);
		b[11] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		p[9].reset();
		p[10].reset();
		p[11].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
	}
}

class Operator8 extends Operator
{
	public Operator8()
	{
		super(new Predicate(8, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL)))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		delIn[1] = new DelAddAtomic(new Predicate(28, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[3];
		addIn[0] = new DelAddAtomic(new Predicate(28, 5, new TermList(TermVariable.getVariable(1), TermList.NIL)));
		addIn[1] = new DelAddAtomic(new Predicate(30, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)));
		addIn[2] = new DelAddAtomic(new Predicate(3, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition8(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition9 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition9(Term[] unifier)
	{
		p = new Precondition[13];
		p[1] = new PreconditionAtomic(new Predicate(0, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(25, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(16, 6, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(22, 6, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		p[5] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(4), TermList.NIL)), unifier);
		p[6] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		p[7] = new PreconditionAtomic(new Predicate(4, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[8] = new PreconditionAtomic(new Predicate(26, 6, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[9] = new PreconditionAtomic(new Predicate(24, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL)))), unifier);
		p[10] = new PreconditionAtomic(new Predicate(27, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL))), unifier);
		p[11] = new PreconditionAtomic(new Predicate(3, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[12] = new PreconditionAtomic(new Predicate(28, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[13][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
		b[12] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[12] == null)
		{
			boolean b11changed = false;
			while (b[11] == null)
			{
				boolean b10changed = false;
				while (b[10] == null)
				{
					boolean b9changed = false;
					while (b[9] == null)
					{
						boolean b8changed = false;
						while (b[8] == null)
						{
							boolean b7changed = false;
							while (b[7] == null)
							{
								boolean b6changed = false;
								while (b[6] == null)
								{
									boolean b5changed = false;
									while (b[5] == null)
									{
										boolean b4changed = false;
										while (b[4] == null)
										{
											boolean b3changed = false;
											while (b[3] == null)
											{
												boolean b2changed = false;
												while (b[2] == null)
												{
													boolean b1changed = false;
													while (b[1] == null)
													{
														b[1] = p[1].nextBinding();
														if (b[1] == null)
															return null;
														b1changed = true;
													}
													if ( b1changed ) {
														p[2].reset();
														p[2].bind(Term.merge(b, 2));
													}
													b[2] = p[2].nextBinding();
													if (b[2] == null) b[1] = null;
													b2changed = true;
												}
												if ( b2changed ) {
													p[3].reset();
													p[3].bind(Term.merge(b, 3));
												}
												b[3] = p[3].nextBinding();
												if (b[3] == null) b[2] = null;
												b3changed = true;
											}
											if ( b3changed ) {
												p[4].reset();
												p[4].bind(Term.merge(b, 4));
											}
											b[4] = p[4].nextBinding();
											if (b[4] == null) b[3] = null;
											b4changed = true;
										}
										if ( b4changed ) {
											p[5].reset();
											p[5].bind(Term.merge(b, 5));
										}
										b[5] = p[5].nextBinding();
										if (b[5] == null) b[4] = null;
										b5changed = true;
									}
									if ( b5changed ) {
										p[6].reset();
										p[6].bind(Term.merge(b, 6));
									}
									b[6] = p[6].nextBinding();
									if (b[6] == null) b[5] = null;
									b6changed = true;
								}
								if ( b6changed ) {
									p[7].reset();
									p[7].bind(Term.merge(b, 7));
								}
								b[7] = p[7].nextBinding();
								if (b[7] == null) b[6] = null;
								b7changed = true;
							}
							if ( b7changed ) {
								p[8].reset();
								p[8].bind(Term.merge(b, 8));
							}
							b[8] = p[8].nextBinding();
							if (b[8] == null) b[7] = null;
							b8changed = true;
						}
						if ( b8changed ) {
							p[9].reset();
							p[9].bind(Term.merge(b, 9));
						}
						b[9] = p[9].nextBinding();
						if (b[9] == null) b[8] = null;
						b9changed = true;
					}
					if ( b9changed ) {
						p[10].reset();
						p[10].bind(Term.merge(b, 10));
					}
					b[10] = p[10].nextBinding();
					if (b[10] == null) b[9] = null;
					b10changed = true;
				}
				if ( b10changed ) {
					p[11].reset();
					p[11].bind(Term.merge(b, 11));
				}
				b[11] = p[11].nextBinding();
				if (b[11] == null) b[10] = null;
				b11changed = true;
			}
			if ( b11changed ) {
				p[12].reset();
				p[12].bind(Term.merge(b, 12));
			}
			b[12] = p[12].nextBinding();
			if (b[12] == null) b[11] = null;
		}

		Term[] retVal = Term.merge(b, 13);
		b[12] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		p[6].reset();
		p[7].reset();
		p[8].reset();
		p[9].reset();
		p[10].reset();
		p[11].reset();
		p[12].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
		b[6] = null;
		b[7] = null;
		b[8] = null;
		b[9] = null;
		b[10] = null;
		b[11] = null;
		b[12] = null;
	}
}

class Operator9 extends Operator
{
	public Operator9()
	{
		super(new Predicate(9, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(5), TermList.NIL))))))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(3, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		delIn[1] = new DelAddAtomic(new Predicate(28, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[3];
		addIn[0] = new DelAddAtomic(new Predicate(28, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)));
		addIn[1] = new DelAddAtomic(new Predicate(31, 6, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))));
		addIn[2] = new DelAddAtomic(new Predicate(3, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new Precondition9(unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator10 extends Operator
{
	public Operator10()
	{
		super(new Predicate(10, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[0];

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(32, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(1)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator11 extends Operator
{
	public Operator11()
	{
		super(new Predicate(11, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(32, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[0];

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(1)).setComparator(null);
		p.reset();

		return p;
	}
}

class Method0 extends Method
{
	public Method0()
	{
		super(new Predicate(0, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = TaskList.empty;
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(4, 2, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(9, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionNil(2)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Case1";
			case 1: return "Case2";
			default: return null;
		}
	}
}

class Method1 extends Method
{
	public Method1()
	{
		super(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(3, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(10, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(11, 3, new TermList(TermVariable.getVariable(2), TermList.NIL)), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(4, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method1Branch0";
			default: return null;
		}
	}
}

class Precondition10 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition10(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(1, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(3), TermList.NIL)))), unifier);
		p[3] = new PreconditionNegation(new PreconditionAtomic(new Predicate(32, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier), 4);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method2 extends Method
{
	public Method2()
	{
		super(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[3];

		subsIn[0] = TaskList.empty;
		subsIn[1] = createTaskList1();
		subsIn[2] = createTaskList2();

		setSubs(subsIn);
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));

		return retVal;
	}

	TaskList createTaskList2()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(3), TermList.NIL)))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(10, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(11, 4, new TermList(TermVariable.getVariable(3), TermList.NIL)), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(4, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionAtomic(new Predicate(2, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), unifier)).setComparator(null);
			break;
			case 2:
				p = (new Precondition10(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Case1";
			case 1: return "Case2";
			case 2: return "Case3";
			default: return null;
		}
	}
}

class Precondition11 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition11(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(25, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(26, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(27, 5, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method3 extends Method
{
	public Method3()
	{
		super(new Predicate(2, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(7, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(3), TermList.NIL)))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition11(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method3Branch0";
			default: return null;
		}
	}
}

class Precondition12 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition12(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(8, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(7, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Method4 extends Method
{
	public Method4()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition12(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method4Branch0";
			default: return null;
		}
	}
}

class Precondition13 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition13(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(8, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(7, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Method5 extends Method
{
	public Method5()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition13(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method5Branch0";
			default: return null;
		}
	}
}

class Precondition14 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition14(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(8, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(7, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Method6 extends Method
{
	public Method6()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition14(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method6Branch0";
			default: return null;
		}
	}
}

class Precondition15 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition15(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(1, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(0, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(33, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method7 extends Method
{
	public Method7()
	{
		super(new Predicate(4, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition15(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method7Branch0";
			default: return null;
		}
	}
}

class Precondition16 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition16(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(1, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(0, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(34, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method8 extends Method
{
	public Method8()
	{
		super(new Predicate(5, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition16(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method8Branch0";
			default: return null;
		}
	}
}

class Precondition17 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition17(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(1, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(0, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(35, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method9 extends Method
{
	public Method9()
	{
		super(new Predicate(6, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(1, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 2, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition17(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method9Branch0";
			default: return null;
		}
	}
}

class Precondition18 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition18(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(25, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(26, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(27, 5, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method10 extends Method
{
	public Method10()
	{
		super(new Predicate(7, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(8, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(3), TermList.NIL)))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition18(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method10Branch0";
			default: return null;
		}
	}
}

class Precondition19 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition19(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(0, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(13, 3, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[4] = new PreconditionAtomic(new Predicate(8, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Method11 extends Method
{
	public Method11()
	{
		super(new Predicate(8, 3, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(7, 3, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition19(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method11Branch0";
			default: return null;
		}
	}
}

class Precondition20 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition20(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(25, 6, new TermList(TermVariable.getVariable(3), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(26, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(27, 6, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method12 extends Method
{
	public Method12()
	{
		super(new Predicate(9, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(5), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(9, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(4), TermList.NIL))))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition20(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method12Branch0";
			default: return null;
		}
	}
}

class Precondition21 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition21(Term[] unifier)
	{
		p = new Precondition[6];
		p[1] = new PreconditionAtomic(new Predicate(16, 5, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(17, 5, new TermList(TermVariable.getVariable(2), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(20, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(23, 5, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[5] = new PreconditionAtomic(new Predicate(19, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(4), TermList.NIL))), unifier);
		b = new Term[6][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[5] == null)
		{
			boolean b4changed = false;
			while (b[4] == null)
			{
				boolean b3changed = false;
				while (b[3] == null)
				{
					boolean b2changed = false;
					while (b[2] == null)
					{
						boolean b1changed = false;
						while (b[1] == null)
						{
							b[1] = p[1].nextBinding();
							if (b[1] == null)
								return null;
							b1changed = true;
						}
						if ( b1changed ) {
							p[2].reset();
							p[2].bind(Term.merge(b, 2));
						}
						b[2] = p[2].nextBinding();
						if (b[2] == null) b[1] = null;
						b2changed = true;
					}
					if ( b2changed ) {
						p[3].reset();
						p[3].bind(Term.merge(b, 3));
					}
					b[3] = p[3].nextBinding();
					if (b[3] == null) b[2] = null;
					b3changed = true;
				}
				if ( b3changed ) {
					p[4].reset();
					p[4].bind(Term.merge(b, 4));
				}
				b[4] = p[4].nextBinding();
				if (b[4] == null) b[3] = null;
				b4changed = true;
			}
			if ( b4changed ) {
				p[5].reset();
				p[5].bind(Term.merge(b, 5));
			}
			b[5] = p[5].nextBinding();
			if (b[5] == null) b[4] = null;
		}

		Term[] retVal = Term.merge(b, 6);
		b[5] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		p[5].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
		b[5] = null;
	}
}

class Method13 extends Method
{
	public Method13()
	{
		super(new Predicate(11, 5, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(10, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(4), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(6, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(1), TermList.NIL)))))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(9, 5, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition21(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method13Branch0";
			default: return null;
		}
	}
}

class Precondition22 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition22(Term[] unifier)
	{
		p = new Precondition[3];
		p[1] = new PreconditionAtomic(new Predicate(18, 4, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(19, 4, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))), unifier);
		b = new Term[3][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[2] == null)
		{
			boolean b1changed = false;
			while (b[1] == null)
			{
				b[1] = p[1].nextBinding();
				if (b[1] == null)
					return null;
				b1changed = true;
			}
			if ( b1changed ) {
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
			}
			b[2] = p[2].nextBinding();
			if (b[2] == null) b[1] = null;
		}

		Term[] retVal = Term.merge(b, 3);
		b[2] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		b[1] = null;
		b[2] = null;
	}
}

class Method14 extends Method
{
	public Method14()
	{
		super(new Predicate(10, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(5, 4, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition22(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method14Branch0";
			default: return null;
		}
	}
}

public class rover extends Domain
{
	public rover()
	{
		TermVariable.initialize(6);

		constants = new String[36];
		constants[0] = "rover";
		constants[1] = "waypoint";
		constants[2] = "can_traverse";
		constants[3] = "available";
		constants[4] = "at";
		constants[5] = "store";
		constants[6] = "at_soil_sample";
		constants[7] = "equipped_for_soil_analysis";
		constants[8] = "store_of";
		constants[9] = "empty";
		constants[10] = "full";
		constants[11] = "have_soil_analysis";
		constants[12] = "at_rock_sample";
		constants[13] = "equipped_for_rock_analysis";
		constants[14] = "have_rock_analysis";
		constants[15] = "camera";
		constants[16] = "objective";
		constants[17] = "equipped_for_imaging";
		constants[18] = "calibration_target";
		constants[19] = "visible_from";
		constants[20] = "on_board";
		constants[21] = "calibrated";
		constants[22] = "mode";
		constants[23] = "supports";
		constants[24] = "have_image";
		constants[25] = "lander";
		constants[26] = "at_lander";
		constants[27] = "visible";
		constants[28] = "channel_free";
		constants[29] = "communicated_soil_data";
		constants[30] = "communicated_rock_data";
		constants[31] = "communicated_image_data";
		constants[32] = "visited";
		constants[33] = "go1_target";
		constants[34] = "go2_target";
		constants[35] = "go3_target";

		compoundTasks = new String[12];
		compoundTasks[0] = "empty-store";
		compoundTasks[1] = "navigate";
		compoundTasks[2] = "send_soil_data";
		compoundTasks[3] = "get_soil_data";
		compoundTasks[4] = "go1";
		compoundTasks[5] = "go2";
		compoundTasks[6] = "go3";
		compoundTasks[7] = "send_rock_data";
		compoundTasks[8] = "get_rock_data";
		compoundTasks[9] = "send_image_data";
		compoundTasks[10] = "calibrate";
		compoundTasks[11] = "get_image_data";

		primitiveTasks = new String[12];
		primitiveTasks[0] = "!position";
		primitiveTasks[1] = "!navigate";
		primitiveTasks[2] = "!sample_soil";
		primitiveTasks[3] = "!sample_rock";
		primitiveTasks[4] = "!drop";
		primitiveTasks[5] = "!calibrate";
		primitiveTasks[6] = "!take_image";
		primitiveTasks[7] = "!communicate_soil_data";
		primitiveTasks[8] = "!communicate_rock_data";
		primitiveTasks[9] = "!communicate_image_data";
		primitiveTasks[10] = "!visit";
		primitiveTasks[11] = "!unvisit";

		methods = new Method[12][];

		methods[0] = new Method[1];
		methods[0][0] = new Method0();

		methods[1] = new Method[2];
		methods[1][0] = new Method1();
		methods[1][1] = new Method2();

		methods[2] = new Method[1];
		methods[2][0] = new Method3();

		methods[3] = new Method[3];
		methods[3][0] = new Method4();
		methods[3][1] = new Method5();
		methods[3][2] = new Method6();

		methods[4] = new Method[1];
		methods[4][0] = new Method7();

		methods[5] = new Method[1];
		methods[5][0] = new Method8();

		methods[6] = new Method[1];
		methods[6][0] = new Method9();

		methods[7] = new Method[1];
		methods[7][0] = new Method10();

		methods[8] = new Method[1];
		methods[8][0] = new Method11();

		methods[9] = new Method[1];
		methods[9][0] = new Method12();

		methods[10] = new Method[1];
		methods[10][0] = new Method14();

		methods[11] = new Method[1];
		methods[11][0] = new Method13();


		ops = new Operator[12][];

		ops[0] = new Operator[1];
		ops[0][0] = new Operator0();

		ops[1] = new Operator[1];
		ops[1][0] = new Operator1();

		ops[2] = new Operator[1];
		ops[2][0] = new Operator2();

		ops[3] = new Operator[1];
		ops[3][0] = new Operator3();

		ops[4] = new Operator[1];
		ops[4][0] = new Operator4();

		ops[5] = new Operator[1];
		ops[5][0] = new Operator5();

		ops[6] = new Operator[1];
		ops[6][0] = new Operator6();

		ops[7] = new Operator[1];
		ops[7][0] = new Operator7();

		ops[8] = new Operator[1];
		ops[8][0] = new Operator8();

		ops[9] = new Operator[1];
		ops[9][0] = new Operator9();

		ops[10] = new Operator[1];
		ops[10][0] = new Operator10();

		ops[11] = new Operator[1];
		ops[11][0] = new Operator11();

		axioms = new Axiom[36][];

		axioms[0] = new Axiom[0];

		axioms[1] = new Axiom[0];

		axioms[2] = new Axiom[0];

		axioms[3] = new Axiom[0];

		axioms[4] = new Axiom[0];

		axioms[5] = new Axiom[0];

		axioms[6] = new Axiom[0];

		axioms[7] = new Axiom[0];

		axioms[8] = new Axiom[0];

		axioms[9] = new Axiom[0];

		axioms[10] = new Axiom[0];

		axioms[11] = new Axiom[0];

		axioms[12] = new Axiom[0];

		axioms[13] = new Axiom[0];

		axioms[14] = new Axiom[0];

		axioms[15] = new Axiom[0];

		axioms[16] = new Axiom[0];

		axioms[17] = new Axiom[0];

		axioms[18] = new Axiom[0];

		axioms[19] = new Axiom[0];

		axioms[20] = new Axiom[0];

		axioms[21] = new Axiom[0];

		axioms[22] = new Axiom[0];

		axioms[23] = new Axiom[0];

		axioms[24] = new Axiom[0];

		axioms[25] = new Axiom[0];

		axioms[26] = new Axiom[0];

		axioms[27] = new Axiom[0];

		axioms[28] = new Axiom[0];

		axioms[29] = new Axiom[0];

		axioms[30] = new Axiom[0];

		axioms[31] = new Axiom[0];

		axioms[32] = new Axiom[0];

		axioms[33] = new Axiom[0];

		axioms[34] = new Axiom[0];

		axioms[35] = new Axiom[0];

	}
}