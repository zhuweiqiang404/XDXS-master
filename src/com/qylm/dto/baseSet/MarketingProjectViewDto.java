package com.qylm.dto.baseSet;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 保存服务管理管理画面需要的值
 * @author smj
 */
public class MarketingProjectViewDto implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7728815278928003147L;

	/**
	 * 项目
	 */
	private String project;
	
	/**
	 * 费用
	 */
	private BigDecimal money;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 有效状态
	 * true：有效
	 * false：反之无效
	 */
	private boolean state;

	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * @return the money
	 */
	public BigDecimal getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}
	
}
