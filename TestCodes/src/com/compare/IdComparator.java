package com.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<Users>{

	@Override
	public int compare(Users u1, Users u2) {
		return Integer.compare(u1.getId(), u2.getId());
	}


}
