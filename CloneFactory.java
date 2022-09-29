package edu.kau.fcit.cpit252;

public class CloneFactory {
    public static Cars getClone(Cars Cartype) {

		return Cartype.makeCopy();

	}

}
