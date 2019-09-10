package com.example.swimminggo.presenter;

import com.example.swimminggo.models.Team;
import com.example.swimminggo.repository.TeamRepository;

import java.util.List;

public class TeamPresenterImpl implements TeamPresenter {
    TeamRepository teamRepository;

    @Override
    public List<Team> getListTeamByUserId(int userId) {
        return teamRepository.getListTeam(userId);
    }

    @Override
    public Team getTeamById(int teamId) {
        return  teamRepository.getTeamById(teamId);
    }

    @Override
    public int deleteTeam(int teamId) {
        return 0;
    }

    @Override
    public int updateTeam(int teamId, Team team) {
        return 0;
    }
}
