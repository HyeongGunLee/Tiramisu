package work.model.service;

import work.model.dao.ChannelDao;
import work.model.dto.Channel;

public class ChannelService {
	public static ChannelService instance = new ChannelService();
	private ChannelDao dao = new ChannelDao();
	
	private ChannelService(){
		
	}
	
	public static ChannelService getInstance(){
		return instance;
	}

	public boolean makeChannel(String teamName, String channelName) {
		dao.insert(new Channel(channelName, teamName));
		return true;
	}
}
