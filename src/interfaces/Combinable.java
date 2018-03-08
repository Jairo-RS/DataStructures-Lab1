package interfaces;

import orderedStructures.Progression;

public interface Combinable {
	Progression addProg(Progression other);
	Progression subtractProg(Progression other);
}
