package com.howtoprogram.junit5;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;

import com.howtoprogram.junit5.Services.Election;
import com.howtoprogram.junit5.Services.IElection;
import com.howtoprogram.junit5.interfaz.ElectionMock;


public class MenuTest {
	@Test
	public void getNameByPartyTest() {
		IElection election = new ElectionMock();
		
		String candidateName = election.getCandidateNameByParty("Axity");
		
		int numOfVotes = election.getNumberOfVotesByParty("Axity");
		
		assertEquals("Prueba", candidateName);
		assertEquals(10, numOfVotes);
	}
	
	@Test
	public void getNameByPartyTestMockito() {
		IElection election = mock(Election.class);
		
		when(election.getCandidateNameByParty("Otra cosa")).thenReturn("Arturo");
		when(election.getNumberOfVotesByParty("")).thenReturn(0);
		
		String candidateName = election.getCandidateNameByParty("Otra cosa");
		
		int numOfVotes = election.getNumberOfVotesByParty("");
		
		assertEquals("Arturo", candidateName);
		assertEquals(0, numOfVotes);
	}

}

