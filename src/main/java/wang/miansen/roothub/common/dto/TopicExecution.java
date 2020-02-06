package wang.miansen.roothub.common.dto;

import wang.miansen.roothub.common.enums.InsertTopicEnum;
import wang.miansen.roothub.modules.post.model.Post;

public class TopicExecution {

	private String title;//话题名称
	private int state;// 结果状态
	private String stateInfo;// 状态标识
	private Post topic;//成功对象
	
	public TopicExecution() {
		super();
	}
	
	/**
	 * 失败时的构造器
	 * @param topicName
	 * @param stateEnum
	 */
	public TopicExecution(String title,InsertTopicEnum stateEnum) {
		this.title = title;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}
	
	/**
	 * 成功时的构造器
	 * @param topicName
	 * @param stateEnum
	 * @param topic
	 */
	public TopicExecution(String title,InsertTopicEnum stateEnum,Post topic) {
		this.title = title;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.topic = topic;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public Post getTopic() {
		return topic;
	}

	public void setTopic(Post topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "RootTopicExecution [title=" + title + ", state=" + state + ", stateInfo=" + stateInfo + ", topic="
				+ topic + "]";
	}
	
}
