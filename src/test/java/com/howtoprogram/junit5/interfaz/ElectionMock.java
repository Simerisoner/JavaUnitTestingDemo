package com.howtoprogram.junit5.interfaz;

import com.howtoprogram.junit5.Services.IElection;

public class ElectionMock implements IElection{

	@Override
	public String getCandidateNameByParty(String party) {
		return "Prueba";
	}

	@Override
	public int getNumberOfVotesByParty(String party) {
		return 10;
	}

}
