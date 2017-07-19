package work.model.service;

import java.util.ArrayList;

public class ChannelService {
	public static ChannelService instance = new ChannelService();
	public static ChannelService getInstance(){
		return instance;
	}
	/**
	 * 채널은 기본키인 teamName과 channelName으로 식별할 수 있습니다. Channel을 만들어 주세요.
	 * @param teamName
	 * @param channelName
	 */
	public boolean makeChannel(String teamName, String channelName) {
		return true;
	}
	/**
	 * 특정팀의 특정 채널의 특정 회원의 모든 다이얼로그를 반환하는 함수.
	 * @param teamName
	 * @param channelName
	 * @param memberId
	 * @return
	 */
	public ArrayList<Dialog> getChannelMemberDialog(String teamName, String channelName, String memberId) {
		return null;
	}
}
