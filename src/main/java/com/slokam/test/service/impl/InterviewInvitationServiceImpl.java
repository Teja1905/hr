package com.slokam.hr.service.impl;

import com.slokam.hr.entity.InterviewInvitation;
import com.slokam.hr.repo.InterviewInvitationRepo;
import com.slokam.hr.service.InterviewInvitationService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class InterviewInvitationServiceImpl implements InterviewInvitationService {

      
   

	@Autowired
	private InterviewInvitationRepo repo;
	
	@Override
	public List<InterviewInvitation> getAll() {
		return repo.findAll();
	}

	@Override
	public InterviewInvitation getById(Integer id) {
		
		Optional<InterviewInvitation> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public InterviewInvitation save(InterviewInvitation todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(InterviewInvitation todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
