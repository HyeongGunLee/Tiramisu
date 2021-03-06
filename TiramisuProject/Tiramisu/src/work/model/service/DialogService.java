package work.model.service;

import java.util.ArrayList;

import work.model.dao.DialogDao;
import work.model.dto.Dialog;

public class DialogService {
	public static DialogService instance = new DialogService();
	private DialogDao dao = new DialogDao();
	
	private DialogService(){
		
	}
	
	public static DialogService getInstance(){
		return instance;
	}
	
	public ArrayList<Dialog> inTeamChannelDialog(String teamName, String channelName){
		ArrayList<Dialog> returnList = new ArrayList<>();
		ArrayList<Dialog> allList = dao.selectAll();
		System.out.println("Debug : inTeamChannelDialog - "+teamName+":"+channelName);
		for(Dialog d : allList){
			if(d.getChannelName().equals(channelName)&&d.getTeamName().equals(teamName)){
				returnList.add(d);
				System.out.println("LDebug : inTeamChannelDialog - "+d.getTeamName()+":"+d.getChannelName());
			}
		}
		return returnList;
	}
	public ArrayList<Dialog> inTeamNicknameDialog(String teamName, String nickname){
		ArrayList<Dialog> returnList = new ArrayList<>();
		ArrayList<Dialog> allList = dao.selectAll();
		System.out.println("Debug : inTeamChannelDialog - "+teamName+":"+nickname);
		for(Dialog d : allList){
			if(d.getWriter().equals(nickname)&&d.getTeamName().equals(teamName)){
				returnList.add(d);
				System.out.println("LDebug : inTeamChannelDialog - "+d.getTeamName()+":"+d.getChannelName());
			}
		}
		return returnList;
	}
}
